package com.yg.dto.body;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import java.util.UUID;

class AirportZoneBodyDto {
  @NotEmpty
  private String name;

  @NotNull
  private UUID airportId;
}
