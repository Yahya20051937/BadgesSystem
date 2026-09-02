package com.yg.controller;

import com.yg.annotation.YHasRole;
import com.yg.dto.BadgeTemplateDto;
import com.yg.dto.body.BadgeTemplateBodyDto;
import com.yg.entity.BadgeTemplate;
import com.yg.service.BadgeTemplateService;
import java.util.UUID;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/badgetemplate")
public class BadgeTemplateController implements @YHasRole("ADMIN") CreateController<BadgeTemplate, UUID, BadgeTemplateDto, BadgeTemplateBodyDto> {
  @Getter
  private final BadgeTemplateService service;
}
