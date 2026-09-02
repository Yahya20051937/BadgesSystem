package com.yg.mapper.resolver;

import com.yg.entity.BadgeTemplate;
import com.yg.repository.BadgeTemplateRepository;
import java.util.UUID;
import org.springframework.stereotype.Component;

@Component
public class BadgeTemplateResolver extends YMappingResolver<BadgeTemplateRepository, BadgeTemplate, UUID> {
  public BadgeTemplateResolver(BadgeTemplateRepository repository) {
    super(repository);
  }
}
