package com.co.ragazza.backend.ragazza.infrastructure.db.springdata.mapper;

import com.co.ragazza.backend.ragazza.domain.Inventario;
import com.co.ragazza.backend.ragazza.infrastructure.db.springdata.dbo.InventarioEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface InventarioMapper {

    Inventario inventarioEntityToInventario(InventarioEntity inventarioEntity);

    InventarioEntity inventarioToInventarioEntity(Inventario inventario);
}
