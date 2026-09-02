package com.yg.dto;

import com.yg.constant.BadgeStatus;
import java.time.LocalDateTime;
import java.util.UUID;

class UserBadgeDto extends YArchivableAuditableDto<UUID> {

    private LocalDateTime collectedAt;

    private LocalDateTime expiryDate;

    private String collectionPoint;

    private UserDto owner;

    private BadgeRequestDto badgeRequest;
}
