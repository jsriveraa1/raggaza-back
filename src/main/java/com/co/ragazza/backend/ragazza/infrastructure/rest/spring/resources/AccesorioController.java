package com.co.ragazza.backend.ragazza.infrastructure.rest.spring.resources;

import com.co.ragazza.backend.ragazza.application.service.AccesorioLogic;
import com.co.ragazza.backend.ragazza.infrastructure.rest.spring.dbo.AccesorioDto;
import com.co.ragazza.backend.ragazza.infrastructure.rest.spring.dbo.MaterialDto;
import com.co.ragazza.backend.ragazza.infrastructure.rest.spring.mapper.AccesorioRestMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("accesorio")
public class AccesorioController {

    private final AccesorioLogic accesorioLogic;
    private final AccesorioRestMapper accesorioRestMapper;

    public AccesorioController(AccesorioLogic accesorioLogic, AccesorioRestMapper accesorioRestMapper) {
        this.accesorioLogic = accesorioLogic;
        this.accesorioRestMapper = accesorioRestMapper;
    }

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<AccesorioDto>> listar() {
        return new ResponseEntity<>(
                accesorioRestMapper.accesorioToAccesorioDto(accesorioLogic.listar()),
                HttpStatus.CREATED);
    }
}
