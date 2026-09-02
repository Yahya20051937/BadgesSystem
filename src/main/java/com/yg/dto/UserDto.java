package com.yg.dto;

import java.util.UUID;
import java.time.LocalDateTime;
import java.time.LocalTime;

class UserDto extends YArchivableAuditableDto<UUID> {

    private String lastName;

    private String email;

    private DepartmentDto department;

    private String nom;

    private LocalTime expiryDate;
}
