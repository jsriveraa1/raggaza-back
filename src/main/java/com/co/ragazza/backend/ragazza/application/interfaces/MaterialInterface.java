package com.co.ragazza.backend.ragazza.application.interfaces;

import com.co.ragazza.backend.ragazza.domain.Material;

import java.util.List;

public interface MaterialInterface {

    List<Material> listarMaterial();

    Material obtenerMaterial(Long id);

    Material crearMaterial(Material Material);

    Material eliminarMaterial(Material Material);
    
}
