package com.co.ragazza.backend.ragazza.infrastructure.db.springdata.repository;

import com.co.ragazza.backend.ragazza.application.interfaces.InventarioInterface;
import com.co.ragazza.backend.ragazza.domain.Inventario;
import com.co.ragazza.backend.ragazza.infrastructure.db.springdata.mapper.InventarioMapper;
import org.springframework.stereotype.Service;

@Service
public class InventarioServiceImpl implements InventarioInterface {

    private final InventarioMapper inventarioMapper;
    private final InventarioRepository inventarioRepository;

    public InventarioServiceImpl(InventarioMapper inventarioMapper, InventarioRepository inventarioRepository) {
        this.inventarioMapper = inventarioMapper;
        this.inventarioRepository = inventarioRepository;
    }

    @Override
    public Inventario listarInventario() {
        return null;
    }

    @Override
    public Inventario obtenerInventario(Long id) {
        return null;
    }

    @Override
    public Inventario crearInventario(Inventario inventario) {
        return inventarioMapper.
                inventarioEntityToInventario(
                        inventarioRepository.save(inventarioMapper.inventarioToInventarioEntity(inventario)));
    }

    @Override
    public Inventario eliminarInventario(Inventario inventario) {
        return null;
    }
}
