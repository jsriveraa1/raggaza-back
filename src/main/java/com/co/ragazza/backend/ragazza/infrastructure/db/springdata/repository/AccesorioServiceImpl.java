package com.co.ragazza.backend.ragazza.infrastructure.db.springdata.repository;

import com.co.ragazza.backend.ragazza.application.interfaces.AccesorioInterface;
import com.co.ragazza.backend.ragazza.domain.Accesorio;
import com.co.ragazza.backend.ragazza.infrastructure.db.springdata.mapper.AccesorioMapper;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@CommonsLog
public class AccesorioServiceImpl implements AccesorioInterface {

    private final AccesorioMapper accesorioMapper;
    private final AccesorioRepository accesorioRepository;

    public AccesorioServiceImpl(AccesorioMapper accesorioMapper, AccesorioRepository accesorioRepository) {
        this.accesorioMapper = accesorioMapper;
        this.accesorioRepository = accesorioRepository;
    }

    @Override
    public List<Accesorio> listarAccesorios() {
        return accesorioMapper.accesorioEntityToAccesorio(accesorioRepository.findAll());
    }

    @Override
    public Accesorio obtenerAccesorio(Long id) {
        return null;
    }

    @Override
    public Accesorio crearAccesorio(Accesorio Accesorio) {
        return null;
    }

    @Override
    public Accesorio eliminarAccesorio(Accesorio Accesorio) {
        return null;
    }
}
