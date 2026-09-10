package com.yg.mapper;

import com.yg.dto.AirportZoneDto;
import com.yg.dto.body.AirportZoneBodyDto;
import com.yg.entity.AirportZone;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(
    config = com.yg.configuration.MapstructConfig.class,
    uses = {AirportMapper.class, AirportResolver.class}
)
interface AirportZoneMapper extends YMapper<AirportZone, AirportZoneDto, AirportZoneBodyDto> {
  @Override
  @Mapping(
      target = "airport",
      source = "airportId"
  )
  AirportZone from(AirportZoneBodyDto body);

  @Override
  @Mapping(
      target = "name",
      ignore = true
  )
  @Mapping(
      target = "airport",
      ignore = true
  )
  void fillIgnoreNull(@MappingTarget AirportZone entity, AirportZoneBodyDto body);

  @Override
  @Mapping(
      target = "name",
      ignore = true
  )
  @Mapping(
      target = "airport",
      source = "airportId"
  )
  void fill(@MappingTarget AirportZone entity, AirportZoneBodyDto body);
}
