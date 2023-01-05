package com.co.ragazza.backend.ragazza.infrastructure.rest.spring.mapper;

import com.co.ragazza.backend.ragazza.domain.Inventario;
import com.co.ragazza.backend.ragazza.infrastructure.rest.spring.dbo.InventarioDto;
import com.co.ragazza.backend.ragazza.infrastructure.rest.spring.dbo.ProductoDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface InventarioRestMapper {

    Inventario toInventario(InventarioDto inventarioDto);

    InventarioDto toInventarioDto(Inventario inventario);


}
