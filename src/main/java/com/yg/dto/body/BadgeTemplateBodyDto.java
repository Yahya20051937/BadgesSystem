package com.yg.dto.body;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import java.util.UUID;

class BadgeTemplateBodyDto {
  @NotEmpty
  private String name;

  @NotEmpty
  private String color;

  @NotNull
  private UUID aeroportId;
}
