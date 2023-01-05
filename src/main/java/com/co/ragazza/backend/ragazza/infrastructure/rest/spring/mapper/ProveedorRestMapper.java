package com.co.ragazza.backend.ragazza.infrastructure.rest.spring.mapper;

import com.co.ragazza.backend.ragazza.domain.Proveedor;
import com.co.ragazza.backend.ragazza.infrastructure.rest.spring.dbo.ProveedorDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProveedorRestMapper {

    Proveedor proveedorDtoToproveedor(ProveedorDto proveedorDto);

    ProveedorDto proveedorToProveedorDto(Proveedor proveedor);
}
