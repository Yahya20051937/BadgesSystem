package com.yg.mapper.resolver;

import com.yg.entity.Airport;
import com.yg.repository.AirportRepository;
import java.util.UUID;
import org.springframework.stereotype.Component;

@Component
public class AirportResolver extends YMappingResolver<AirportRepository, Airport, UUID> {
  public AirportResolver(AirportRepository repository) {
    super(repository);
  }
}
