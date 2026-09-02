package com.yg.dto.body;

import jakarta.validation.constraints.NotEmpty;

class AirportBodyDto {
  @NotEmpty
  private String name;
}
