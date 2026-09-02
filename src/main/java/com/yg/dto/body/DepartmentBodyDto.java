package com.yg.dto.body;

import jakarta.validation.constraints.NotEmpty;

class DepartmentBodyDto {
  @NotEmpty
  private String name;
}
