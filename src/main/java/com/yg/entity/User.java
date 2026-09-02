package com.yg.entity;

import com.yg.dto.YAppEntityDto;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.UUID;
import java.time.LocalDateTime;

@YAppEntityDto
@Table(name = "user")
class User extends YArchivableAuditableEntity<UUID> {

    @Column(name = "lastName", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false)
    private String email;

    @ManyToOne
    @JoinColumn(name = "departmentId", nullable = false)
    private Department department;

    @Column(name = "nom", nullable = false)
    private String nom;

    @Column(name = "expiryDate", nullable = false)
    private LocalDateTime expiryDate;
}
