package com.co.ragazza.backend.ragazza.infrastructure.db.springdata.mapper;

import com.co.ragazza.backend.ragazza.domain.Producto;
import com.co.ragazza.backend.ragazza.infrastructure.db.springdata.dbo.ProductoEntity;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductoMapper {

    @Mapping(target = "inventario.producto", ignore = true)
    Producto productoEntityToProducto(ProductoEntity productoEntity);

    List<Producto> productoEntityToProducto(List<ProductoEntity> productoEntity);

    @Mapping(target = "inventario.producto", ignore = true)
    ProductoEntity productoToProductoEntity(Producto producto);

    @AfterMapping
    default void setIdEntityProducto(@MappingTarget ProductoEntity productoEntity){
        productoEntity.getInventario().setProducto(productoEntity);
    }
}
