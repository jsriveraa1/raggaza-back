package com.co.ragazza.backend.ragazza.application.interfaces;

import com.co.ragazza.backend.ragazza.domain.Inventario;

public interface InventarioInterface {

    Inventario listarInventario();

    Inventario obtenerInventario(Long id);

    Inventario crearInventario(Inventario inventario);

    Inventario eliminarInventario(Inventario inventario);

}
