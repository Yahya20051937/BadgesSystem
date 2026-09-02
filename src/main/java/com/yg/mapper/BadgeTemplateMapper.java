package com.yg.mapper;

import com.yg.dto.BadgeTemplateDto;
import com.yg.dto.body.BadgeTemplateBodyDto;
import com.yg.entity.BadgeTemplate;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(
    config = com.yg.configuration.MapstructConfig.class,
    uses = {AirportMapper.class, AirportResolver.class}
)
interface BadgeTemplateMapper extends YMapper<BadgeTemplate, BadgeTemplateDto, BadgeTemplateBodyDto> {
  @Override
  @Mapping(
      target = "color",
      ignore = true
  )
  @Mapping(
      target = "aeroport",
      source = "aeroportId"
  )
  BadgeTemplate from(BadgeTemplateBodyDto body);

  @Override
  @Mapping(
      target = "name",
      ignore = true
  )
  @Mapping(
      target = "color",
      ignore = true
  )
  @Mapping(
      target = "aeroport",
      ignore = true
  )
  void fillIgnoreNull(@MappingTarget BadgeTemplate entity, BadgeTemplateBodyDto body);

  @Override
  @Mapping(
      target = "name",
      ignore = true
  )
  @Mapping(
      target = "aeroport",
      ignore = true
  )
  void fill(@MappingTarget BadgeTemplate entity, BadgeTemplateBodyDto body);
}
