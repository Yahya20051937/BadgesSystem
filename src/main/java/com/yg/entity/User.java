package com.yg.entity;

import com.yg.dto.YAppEntityDto;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.UUID;

@YAppEntityDto
@Table(
    name = "user"
)
class User extends YArchivableAuditableEntity<UUID> {
  @Column(
      name = "firstName",
      nullable = false
  )
  private String firstName;

  @Column(
      name = "lastName",
      nullable = false
  )
  private String lastName;

  @Column(
      name = "email",
      nullable = false
  )
  private String email;

  @ManyToOne
  @JoinColumn(
      name = "departmentId",
      nullable = false
  )
  private Department department;
}
