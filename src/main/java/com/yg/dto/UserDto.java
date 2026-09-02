package com.yg.dto;

import java.util.UUID;
import java.time.LocalDateTime;

class UserDto extends YArchivableAuditableDto<UUID> {

    private String lastName;

    private String email;

    private DepartmentDto department;

    private String nom;

    private LocalDateTime expiryDate;
}
