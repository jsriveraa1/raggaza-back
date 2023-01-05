package com.co.ragazza.backend.ragazza.application.interfaces;

import com.co.ragazza.backend.ragazza.domain.Accesorio;

import java.util.List;

public interface AccesorioInterface {

    List<Accesorio> listarAccesorios();

    Accesorio obtenerAccesorio(Long id);

    Accesorio crearAccesorio(Accesorio Accesorio);

    Accesorio eliminarAccesorio(Accesorio Accesorio);
}
