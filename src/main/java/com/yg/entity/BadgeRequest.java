package com.yg.entity;

import com.yg.dto.YAppEntityDto;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.UUID;

@YAppEntityDto
@Table(
    name = "badgerequest"
)
class BadgeRequest extends YArchivableAuditableEntity<UUID> {
  @ManyToOne
  @JoinColumn(
      name = "badgetemplateId",
      nullable = false
  )
  private BadgeTemplate model;
}
