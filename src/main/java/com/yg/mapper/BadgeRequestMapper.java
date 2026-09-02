package com.yg.mapper;

import com.yg.dto.BadgeRequestDto;
import com.yg.dto.body.BadgeRequestBodyDto;
import com.yg.entity.BadgeRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(
    config = com.yg.configuration.MapstructConfig.class,
    uses = {BadgeTemplateMapper.class, BadgeTemplateResolver.class}
)
interface BadgeRequestMapper extends YMapper<BadgeRequest, BadgeRequestDto, BadgeRequestBodyDto> {
  @Override
  @Mapping(
      target = "model",
      source = "modelId"
  )
  BadgeRequest from(BadgeRequestBodyDto body);

  @Override
  @Mapping(
      target = "model",
      ignore = true
  )
  void fillIgnoreNull(@MappingTarget BadgeRequest entity, BadgeRequestBodyDto body);

  @Override
  @Mapping(
      target = "model",
      ignore = true
  )
  void fill(@MappingTarget BadgeRequest entity, BadgeRequestBodyDto body);
}
