package com.co.ragazza.backend.ragazza.application.service;

import com.co.ragazza.backend.ragazza.application.interfaces.ProductoInteface;
import com.co.ragazza.backend.ragazza.domain.Producto;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class ProductoLogic {

    private final ProductoInteface productoInteface;

    public ProductoLogic(ProductoInteface productoInteface) {
        this.productoInteface = productoInteface;
    }

    public Producto crear(Producto producto){
        return productoInteface.crearProducto(producto);
    }

    public List<Producto> listar(){
        return productoInteface.listarProductos();
    }

}
