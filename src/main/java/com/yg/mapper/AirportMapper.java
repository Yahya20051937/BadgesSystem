package com.yg.mapper;

import com.yg.dto.AirportDto;
import com.yg.dto.body.AirportBodyDto;
import com.yg.entity.Airport;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(
    config = com.yg.configuration.MapstructConfig.class,
    uses = {}
)
interface AirportMapper extends YMapper<Airport, AirportDto, AirportBodyDto> {
  @Override
  @Mapping(
      target = "name",
      ignore = true
  )
  void fillIgnoreNull(@MappingTarget Airport entity, AirportBodyDto body);

  @Override
  @Mapping(
      target = "name",
      ignore = true
  )
  void fill(@MappingTarget Airport entity, AirportBodyDto body);
}
