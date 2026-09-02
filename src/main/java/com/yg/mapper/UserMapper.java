package com.yg.mapper;

import com.yg.dto.UserDto;
import com.yg.dto.body.UserBodyDto;
import com.yg.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(config = com.yg.configuration.MapstructConfig.class, uses = { DepartmentMapper.class, DepartmentResolver.class })
interface UserMapper extends YMapper<User, UserDto, UserBodyDto> {

    @Override
    @Mapping(target = "department", source = "departmentId")
    User from(UserBodyDto body);

    @Override
    @Mapping(target = "lastName", ignore = true)
    @Mapping(target = "email", ignore = true)
    @Mapping(target = "department", ignore = true)
    @Mapping(target = "nom", ignore = true)
    @Mapping(target = "expiryDate", ignore = true)
    void fillIgnoreNull(@MappingTarget User entity, UserBodyDto body);

    @Override
    @Mapping(target = "lastName", ignore = true)
    @Mapping(target = "email", ignore = true)
    @Mapping(target = "department", ignore = true)
    @Mapping(target = "nom", ignore = true)
    @Mapping(target = "expiryDate", ignore = true)
    void fill(@MappingTarget User entity, UserBodyDto body);
}
