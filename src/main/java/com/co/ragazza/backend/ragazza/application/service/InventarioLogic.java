package com.co.ragazza.backend.ragazza.application.service;

import com.co.ragazza.backend.ragazza.application.interfaces.InventarioInterface;
import com.co.ragazza.backend.ragazza.domain.Inventario;
import com.co.ragazza.backend.ragazza.domain.Producto;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class InventarioLogic {

    private final InventarioInterface inventarioInterface;

    public InventarioLogic(InventarioInterface inventarioInterface) {
        this.inventarioInterface = inventarioInterface;
    }

    public Inventario crear(Inventario inventario){
        return inventarioInterface.crearInventario(inventario);
    }

}
