package com.co.ragazza.backend.ragazza.infrastructure.config.spring;

import com.co.ragazza.backend.ragazza.application.interfaces.AccesorioInterface;
import com.co.ragazza.backend.ragazza.application.interfaces.InventarioInterface;
import com.co.ragazza.backend.ragazza.application.interfaces.MaterialInterface;
import com.co.ragazza.backend.ragazza.application.interfaces.ProductoInteface;
import com.co.ragazza.backend.ragazza.application.service.AccesorioLogic;
import com.co.ragazza.backend.ragazza.application.service.InventarioLogic;
import com.co.ragazza.backend.ragazza.application.service.MaterialLogic;
import com.co.ragazza.backend.ragazza.application.service.ProductoLogic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBootServiceConfig {

    @Bean
    public ProductoLogic productoService(ProductoInteface productoInteface){
        return new ProductoLogic(productoInteface);
    }

    @Bean
    public InventarioLogic inventarioService(InventarioInterface inventarioInterface){
        return new InventarioLogic(inventarioInterface);
    }

    @Bean
    public MaterialLogic materialLogic(MaterialInterface materialInterface){
        return new MaterialLogic(materialInterface);
    }

    @Bean
    public AccesorioLogic accesorioLogic(AccesorioInterface accesorioInterface){
        return new AccesorioLogic(accesorioInterface);
    }
}
