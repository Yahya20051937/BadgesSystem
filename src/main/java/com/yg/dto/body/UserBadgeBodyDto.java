package com.yg.dto.body;

import com.yg.constant.BadgeStatus;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.UUID;

class UserBadgeBodyDto {

    @NotNull
    private LocalDateTime collectedAt;

    @NotNull
    private LocalDateTime expiryDate;

    @NotEmpty
    private String collectionPoint;

    @NotNull
    private UUID ownerId;

    @NotNull
    private UUID badgeRequestId;

    @NotEmpty
    private String status;
}
