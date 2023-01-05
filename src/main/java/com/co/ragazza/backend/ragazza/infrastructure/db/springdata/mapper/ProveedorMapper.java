package com.co.ragazza.backend.ragazza.infrastructure.db.springdata.mapper;

import com.co.ragazza.backend.ragazza.domain.Proveedor;
import com.co.ragazza.backend.ragazza.infrastructure.db.springdata.dbo.ProveedorEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProveedorMapper {

    Proveedor toProveedor(ProveedorEntity proveedorEntity);

    ProveedorEntity toProveedorEntitY(Proveedor proveedor);
}
