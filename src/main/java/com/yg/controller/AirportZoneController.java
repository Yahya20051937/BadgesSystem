package com.yg.controller;

import com.yg.dto.AirportZoneDto;
import com.yg.dto.body.AirportZoneBodyDto;
import com.yg.entity.AirportZone;
import com.yg.service.AirportZoneService;
import java.util.UUID;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/airportzone")
public class AirportZoneController implements CreateController<AirportZone, UUID, AirportZoneDto, AirportZoneBodyDto>, PutController<AirportZone, UUID, AirportZoneDto, AirportZoneBodyDto>, PatchController<AirportZone, UUID, AirportZoneDto, AirportZoneBodyDto> {
  @Getter
  private final AirportZoneService service;
}
