package com.yg.service;

import com.yg.dto.AirportZoneDto;
import com.yg.dto.body.AirportZoneBodyDto;
import com.yg.entity.AirportZone;
import com.yg.mapper.AirportZoneMapper;
import com.yg.repository.AirportZoneRepository;
import java.util.UUID;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AirportZoneService implements YCrudService<AirportZone, UUID, AirportZoneDto, AirportZoneBodyDto> {
  @Getter
  private final AirportZoneRepository repository;

  @Getter
  private final AirportZoneMapper mapper;
}
