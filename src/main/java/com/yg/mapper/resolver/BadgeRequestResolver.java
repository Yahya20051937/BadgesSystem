package com.yg.mapper.resolver;

import com.yg.entity.BadgeRequest;
import com.yg.repository.BadgeRequestRepository;
import java.util.UUID;
import org.springframework.stereotype.Component;

@Component
public class BadgeRequestResolver extends YMappingResolver<BadgeRequestRepository, BadgeRequest, UUID> {
  public BadgeRequestResolver(BadgeRequestRepository repository) {
    super(repository);
  }
}
