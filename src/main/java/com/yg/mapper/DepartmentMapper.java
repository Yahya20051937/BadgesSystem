package com.yg.mapper;

import com.yg.dto.DepartmentDto;
import com.yg.dto.body.DepartmentBodyDto;
import com.yg.entity.Department;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(
    config = com.yg.configuration.MapstructConfig.class,
    uses = {}
)
interface DepartmentMapper extends YMapper<Department, DepartmentDto, DepartmentBodyDto> {
  @Override
  @Mapping(
      target = "name",
      ignore = true
  )
  Department from(DepartmentBodyDto body);

  @Override
  @Mapping(
      target = "name",
      ignore = true
  )
  void fill(@MappingTarget Department entity, DepartmentBodyDto body);
}
