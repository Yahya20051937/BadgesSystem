package com.yg.mapper.resolver;

import com.yg.entity.Department;
import com.yg.repository.DepartmentRepository;
import java.util.UUID;
import org.springframework.stereotype.Component;

@Component
public class DepartmentResolver extends YMappingResolver<DepartmentRepository, Department, UUID> {
  public DepartmentResolver(DepartmentRepository repository) {
    super(repository);
  }
}
