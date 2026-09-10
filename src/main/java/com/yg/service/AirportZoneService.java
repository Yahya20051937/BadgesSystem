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
public class AirportZoneService implements YCrudService<AirportZone, UUID, AirportZoneDto, AirportZoneBodyDto>, YSearchService<AirportZone, UUID, AirportZoneDto> {

    @Getter
    private final AirportZoneRepository repository;

    @Getter
    private final AirportZoneMapper mapper;

    @Override
    Projection<AirportZoneDto> getDefaultProjection() {
        QAirportZone airportzone = new QAirportZone("airportzone");
        QAirport airport = new QAirport("airport");
        return Projection.<AirportZoneDto>builder().expression(Projections.fields(AirportZoneDto.class, airportzone.code, airportzone.name, Projections.fields(AirportDto.class, airport.name, airport.Code).as("airport"))).applyJoins(q -> q.leftJoin(airportzone.airport, airport)).build();
    }
}
