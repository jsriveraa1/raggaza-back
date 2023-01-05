package com.co.ragazza.backend.ragazza.application.interfaces;

import com.co.ragazza.backend.ragazza.domain.Producto;

import java.util.List;

public interface ProductoInteface {

    List<Producto> listarProductos();

    Producto obtenerProducto(Long id);

    Producto crearProducto(Producto producto);

    Producto eliminarProducto(Producto producto);
}
