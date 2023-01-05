package com.co.ragazza.backend.ragazza.infrastructure.rest.spring.mapper;

import com.co.ragazza.backend.ragazza.domain.Producto;
import com.co.ragazza.backend.ragazza.infrastructure.rest.spring.dbo.ProductoDto;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductoRestMapper {

    @Mapping(target = "inventario.producto", ignore = true)
    Producto productoDtoToProducto(ProductoDto productoDto);

    @Mapping(target = "inventario.producto", ignore = true)
    ProductoDto productoToProductoDto(Producto productoDto);

    List<ProductoDto> productoToProductoDto(List<Producto> productoDto);

    @AfterMapping
    default void setIdProducto(@MappingTarget Producto producto) {
        producto.getInventario().setProducto(producto);
    }
}
