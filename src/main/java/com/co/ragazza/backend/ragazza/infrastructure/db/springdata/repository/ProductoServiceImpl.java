package com.co.ragazza.backend.ragazza.infrastructure.db.springdata.repository;

import com.co.ragazza.backend.ragazza.application.interfaces.ProductoInteface;
import com.co.ragazza.backend.ragazza.domain.Producto;
import com.co.ragazza.backend.ragazza.infrastructure.db.springdata.mapper.ProductoMapper;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@CommonsLog
public class ProductoServiceImpl implements ProductoInteface {

    private final ProductoRepository productoRepository;
    private final ProductoMapper productoMapper;

    public ProductoServiceImpl(ProductoRepository productoRepository,
                               ProductoMapper productoMapper) {
        this.productoRepository = productoRepository;
        this.productoMapper = productoMapper;
    }

    @Override
    public List<Producto> listarProductos() {
        return productoMapper.productoEntityToProducto(productoRepository.findAll());
    }

    @Override
    public Producto obtenerProducto(Long id) {
        return null;
    }

    @Override
    public Producto crearProducto(Producto producto) {
        return productoMapper.productoEntityToProducto(productoRepository.save(productoMapper.productoToProductoEntity(producto)));
    }

    @Override
    public Producto eliminarProducto(Producto producto) {
        return null;
    }
}
