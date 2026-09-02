package com.yg.dto;

import java.util.UUID;

class UserDto extends YArchivableAuditableDto<UUID> {
  private String firstName;

  private String lastName;

  private String email;

  private DepartmentDto department;
}
