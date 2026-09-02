package com.yg.controller;

import com.yg.annotation.YHasRole;
import com.yg.dto.UserBadgeDto;
import com.yg.dto.body.UserBadgeBodyDto;
import com.yg.entity.UserBadge;
import com.yg.service.UserBadgeService;
import java.util.UUID;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/userbadge")
public class UserBadgeController implements @YHasRole("ADMIN") CreateController<UserBadge, UUID, UserBadgeDto, UserBadgeBodyDto>, SearchController<UserBadge, UUID, UserBadgeDto> {

    @Getter
    private final UserBadgeService service;
}
