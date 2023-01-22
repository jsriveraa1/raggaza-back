package com.co.ragazza.backend.ragazza.infrastructure.rest.spring.resources;

import com.co.ragazza.backend.ragazza.application.service.ProductoLogic;
import com.co.ragazza.backend.ragazza.infrastructure.rest.spring.dbo.ProductoDto;
import com.co.ragazza.backend.ragazza.infrastructure.rest.spring.mapper.ProductoRestMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("producto")
@CrossOrigin(value = "*", origins = "*")
public class ProductoController {

    private final ProductoLogic productoLogic;
    private final ProductoRestMapper productoRestMapper;

    public ProductoController(ProductoLogic productoLogic, ProductoRestMapper productoRestMapper) {
        this.productoLogic = productoLogic;
        this.productoRestMapper = productoRestMapper;
    }

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<ProductoDto>> listarProducto() {
        return new ResponseEntity<>(
                productoRestMapper.productoToProductoDto(productoLogic.listar()),
                HttpStatus.CREATED);
    }

    @PostMapping(value = "crear", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<ProductoDto> crearProducto(@RequestBody ProductoDto productoDto) {
        return new ResponseEntity<>(
                productoRestMapper.productoToProductoDto(
                        productoLogic.crear(productoRestMapper.productoDtoToProducto(productoDto))),
                HttpStatus.CREATED);
    }


}
