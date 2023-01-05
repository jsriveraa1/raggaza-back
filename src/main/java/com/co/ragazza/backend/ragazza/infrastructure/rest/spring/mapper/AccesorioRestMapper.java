package com.co.ragazza.backend.ragazza.infrastructure.rest.spring.mapper;

import com.co.ragazza.backend.ragazza.domain.Accesorio;
import com.co.ragazza.backend.ragazza.infrastructure.rest.spring.dbo.AccesorioDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AccesorioRestMapper {

//    Accesorio accesoriodtoToaccesorio();

    List<AccesorioDto> accesorioToAccesorioDto(List<Accesorio> accesorio);

}
