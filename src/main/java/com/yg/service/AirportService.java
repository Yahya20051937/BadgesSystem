package com.yg.service;

import com.yg.dto.AirportDto;
import com.yg.dto.body.AirportBodyDto;
import com.yg.entity.Airport;
import com.yg.mapper.AirportMapper;
import com.yg.repository.AirportRepository;
import java.util.UUID;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AirportService implements YCrudService<Airport, UUID, AirportDto, AirportBodyDto> {
  @Getter
  private final AirportRepository repository;

  @Getter
  private final AirportMapper mapper;
}
