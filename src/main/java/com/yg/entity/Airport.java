package com.yg.entity;

import com.yg.dto.YAppEntityDto;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import java.util.UUID;

@YAppEntityDto
@Table(name = "airport")
class Airport extends YArchivableAuditableEntity<UUID> {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "Code", nullable = false)
    private UUID Code;
}
