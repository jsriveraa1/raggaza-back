package com.co.ragazza.backend.ragazza.infrastructure.db.springdata.repository;

import com.co.ragazza.backend.ragazza.application.interfaces.MaterialInterface;
import com.co.ragazza.backend.ragazza.domain.Material;
import com.co.ragazza.backend.ragazza.infrastructure.db.springdata.mapper.MaterialMapper;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@CommonsLog
public class MaterialServiceImpl implements MaterialInterface {

    private final MaterialRepository materialRepository;
    private final MaterialMapper materialMapper;

    public MaterialServiceImpl(MaterialRepository materialRepository, MaterialMapper materialMapper) {
        this.materialRepository = materialRepository;
        this.materialMapper = materialMapper;
    }

    @Override
    public List<Material> listarMaterial() {
        return materialMapper.toMaterial(materialRepository.findAll());
    }

    @Override
    public Material obtenerMaterial(Long id) {
        return null;
    }

    @Override
    public Material crearMaterial(Material Material) {
        return null;
    }

    @Override
    public Material eliminarMaterial(Material Material) {
        return null;
    }
}
