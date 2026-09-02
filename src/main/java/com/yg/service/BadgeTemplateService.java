package com.yg.service;

import com.yg.dto.BadgeTemplateDto;
import com.yg.dto.body.BadgeTemplateBodyDto;
import com.yg.entity.BadgeTemplate;
import com.yg.mapper.BadgeTemplateMapper;
import com.yg.repository.BadgeTemplateRepository;
import java.util.UUID;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BadgeTemplateService implements YCrudService<BadgeTemplate, UUID, BadgeTemplateDto, BadgeTemplateBodyDto> {
  @Getter
  private final BadgeTemplateRepository repository;

  @Getter
  private final BadgeTemplateMapper mapper;
}
