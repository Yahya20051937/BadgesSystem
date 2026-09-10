package com.yg.dto;

import java.util.UUID;

class AirportZoneDto extends YArchivableAuditableDto<UUID> {
  private String name;

  private String code;

  private AirportDto airport;
}
