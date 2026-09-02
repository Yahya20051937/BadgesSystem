package com.yg.controller;

import com.yg.dto.DepartmentDto;
import com.yg.dto.body.DepartmentBodyDto;
import com.yg.entity.Department;
import com.yg.service.DepartmentService;
import java.util.UUID;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/department")
public class DepartmentController implements PatchController<Department, UUID, DepartmentDto, DepartmentBodyDto> {
  @Getter
  private final DepartmentService service;
}
