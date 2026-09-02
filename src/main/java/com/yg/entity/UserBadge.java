package com.yg.entity;

import com.yg.constant.BadgeStatus;
import com.yg.dto.YAppEntityDto;
import jakarta.persistence.Column;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import java.util.UUID;

@YAppEntityDto
@Table(name = "userbadge")
class UserBadge extends YArchivableAuditableEntity<UUID> {

    @Column(name = "collectedAt", nullable = false)
    private LocalDateTime collectedAt;

    @Column(name = "expiryDate", nullable = false)
    private LocalDateTime expiryDate;

    @Column(name = "collectionPoint", nullable = false)
    private String collectionPoint;

    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private User owner;

    @ManyToOne
    @JoinColumn(name = "badgerequestId", nullable = false)
    private BadgeRequest badgeRequest;

    @Column(name = "status", nullable = false)
    private String status;
}
