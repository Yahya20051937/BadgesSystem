package com.yg.service;

import com.yg.annotation.YProjection;
import com.yg.dto.AirportDto;
import com.yg.dto.BadgeRequestDto;
import com.yg.dto.BadgeTemplateDto;
import com.yg.dto.DepartmentDto;
import com.yg.dto.UserBadgeDto;
import com.yg.dto.UserDto;
import com.yg.dto.body.UserBadgeBodyDto;
import com.yg.entity.UserBadge;
import com.yg.mapper.UserBadgeMapper;
import com.yg.repository.UserBadgeRepository;
import com.yg.request.Projection;
import java.util.UUID;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserBadgeService implements YSearchService<UserBadge, UUID, UserBadgeDto>, YCrudService<UserBadge, UUID, UserBadgeDto, UserBadgeBodyDto> {
  @Getter
  private final UserBadgeRepository repository;

  @Getter
  private final UserBadgeMapper mapper;

  @YProjection("select")
  Projection<UserBadgeDto> getSelectProjection() {
    QUserBadge userbadge = new QUserBadge("userbadge");

    return Projection.<UserBadgeDto>builder()
      .expression(
        Projections.fields(

          UserBadgeDto.class,
            userbadge.id,
            userbadge.createdDate,
            userbadge.status,
            userbadge.collectedAt,
            userbadge.createdDate,
            userbadge.expiryDate
        )
      )
      .applyJoins(q -> q
      )
      .build();
  }

  @Override
  Projection<UserBadgeDto> getDefaultProjection() {
    QUserBadge userbadge = new QUserBadge("userbadge");
    QUser owner = new QUser("owner");
    QDepartment department = new QDepartment("department");
    QBadgeRequest badgeRequest = new QBadgeRequest("badgeRequest");
    QBadgeTemplate model = new QBadgeTemplate("model");
    QAirport aeroport = new QAirport("aeroport");

    return Projection.<UserBadgeDto>builder()
      .expression(
        Projections.fields(

          UserBadgeDto.class,
            userbadge.id,
            userbadge.createdDate,
            userbadge.status,
            userbadge.collectedAt,
            userbadge.createdDate,
            userbadge.expiryDate,
            userbadge.collectionPoint,
            Projections.fields(

              UserDto.class,
                owner.id,
                owner.firstName,
                owner.lastName,
                owner.email,
                Projections.fields(

                  DepartmentDto.class,
                    department.name
                ).as("department")
            ).as("owner"),
            Projections.fields(

              BadgeRequestDto.class,
                Projections.fields(

                  BadgeTemplateDto.class,
                    model.id,
                    model.name,
                    model.color,
                    model.code,
                    Projections.fields(

                      AirportDto.class,
                        aeroport.name
                    ).as("aeroport")
                ).as("model")
            ).as("badgeRequest")
        )
      )
      .applyJoins(q -> q
        .leftJoin(userbadge.owner, owner)
        .leftJoin(owner.department, department)
        .leftJoin(userbadge.badgeRequest, badgeRequest)
        .leftJoin(badgeRequest.model, model)
        .leftJoin(model.aeroport, aeroport)
      )
      .build();
  }
}
