package com.co.ragazza.backend.ragazza.application.service;

import com.co.ragazza.backend.ragazza.application.interfaces.AccesorioInterface;
import com.co.ragazza.backend.ragazza.domain.Accesorio;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class AccesorioLogic {

    private final AccesorioInterface accesorioInterface;

    public AccesorioLogic(AccesorioInterface accesorioInterface) {
        this.accesorioInterface = accesorioInterface;
    }

    public Accesorio crear(Accesorio accesorio){
        return accesorioInterface.crearAccesorio(accesorio);
    }

    public List<Accesorio> listar(){
        return accesorioInterface.listarAccesorios();
    }

}
