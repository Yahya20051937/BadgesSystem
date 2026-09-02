package com.yg.dto;

import java.util.UUID;

class BadgeTemplateDto extends YArchivableAuditableDto<UUID> {
  private String name;

  private String color;

  private String code;

  private AirportDto aeroport;
}
