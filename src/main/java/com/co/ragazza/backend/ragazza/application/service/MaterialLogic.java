package com.co.ragazza.backend.ragazza.application.service;

import com.co.ragazza.backend.ragazza.application.interfaces.MaterialInterface;
import com.co.ragazza.backend.ragazza.domain.Material;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class MaterialLogic {

    private final MaterialInterface materialInterface;

    public MaterialLogic(MaterialInterface materialInterface) {
        this.materialInterface = materialInterface;
    }

    public Material crear(Material material){
        return materialInterface.crearMaterial(material);
    }

    public List<Material> listar(){
        return materialInterface.listarMaterial();
    }

}
