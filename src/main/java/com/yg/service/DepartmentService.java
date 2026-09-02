package com.yg.service;

import com.yg.dto.DepartmentDto;
import com.yg.dto.body.DepartmentBodyDto;
import com.yg.entity.Department;
import com.yg.mapper.DepartmentMapper;
import com.yg.repository.DepartmentRepository;
import java.util.UUID;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DepartmentService implements YCrudService<Department, UUID, DepartmentDto, DepartmentBodyDto> {
  @Getter
  private final DepartmentRepository repository;

  @Getter
  private final DepartmentMapper mapper;
}
