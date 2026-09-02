package com.yg.mapper;

import com.yg.dto.UserBadgeDto;
import com.yg.dto.body.UserBadgeBodyDto;
import com.yg.entity.UserBadge;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(config = com.yg.configuration.MapstructConfig.class, uses = { UserMapper.class, UserResolver.class, BadgeRequestMapper.class, BadgeRequestResolver.class })
interface UserBadgeMapper extends YMapper<UserBadge, UserBadgeDto, UserBadgeBodyDto> {

    @Override
    @Mapping(target = "owner", source = "ownerId")
    @Mapping(target = "badgeRequest", source = "badgeRequestId")
    UserBadge from(UserBadgeBodyDto body);

    @Override
    @Mapping(target = "collectedAt", ignore = true)
    @Mapping(target = "expiryDate", ignore = true)
    @Mapping(target = "collectionPoint", ignore = true)
    @Mapping(target = "owner", ignore = true)
    @Mapping(target = "badgeRequest", ignore = true)
    @Mapping(target = "status", ignore = true)
    void fillIgnoreNull(@MappingTarget UserBadge entity, UserBadgeBodyDto body);

    @Override
    @Mapping(target = "collectedAt", ignore = true)
    @Mapping(target = "expiryDate", ignore = true)
    @Mapping(target = "collectionPoint", ignore = true)
    @Mapping(target = "badgeRequest", ignore = true)
    @Mapping(target = "owner", source = "ownerId")
    @Mapping(target = "status", ignore = true)
    void fill(@MappingTarget UserBadge entity, UserBadgeBodyDto body);
}
