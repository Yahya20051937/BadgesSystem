package com.yg.controller;

import com.yg.dto.AirportDto;
import com.yg.dto.body.AirportBodyDto;
import com.yg.entity.Airport;
import com.yg.service.AirportService;
import java.util.UUID;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/airport")
public class AirportController implements CreateController<Airport, UUID, AirportDto, AirportBodyDto> {
  @Getter
  private final AirportService service;
}
