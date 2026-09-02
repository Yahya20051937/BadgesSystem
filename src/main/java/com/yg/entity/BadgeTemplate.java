package com.yg.entity;

import com.yg.dto.YAppEntityDto;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.UUID;

@YAppEntityDto
@Table(
    name = "badgetemplate"
)
class BadgeTemplate extends YArchivableAuditableEntity<UUID> {
  @Column(
      name = "name",
      nullable = false
  )
  private String name;

  @Column(
      name = "color",
      nullable = false
  )
  private String color;

  @Column(
      name = "code",
      nullable = false
  )
  private String code;

  @ManyToOne
  @JoinColumn(
      name = "airportId",
      nullable = false
  )
  private Airport aeroport;
}
