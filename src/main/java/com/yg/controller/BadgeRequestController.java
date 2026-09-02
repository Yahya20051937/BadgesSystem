package com.yg.controller;

import com.yg.service.BadgeRequestService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/badgerequest")
public class BadgeRequestController {
  @Getter
  private final BadgeRequestService service;
}
