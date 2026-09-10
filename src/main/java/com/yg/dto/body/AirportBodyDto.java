package com.yg.dto.body;

import jakarta.validation.constraints.NotEmpty;
import java.util.UUID;
import jakarta.validation.constraints.NotNull;

class AirportBodyDto {

    @NotEmpty
    private String name;

    @NotNull
    private UUID Code;
}
