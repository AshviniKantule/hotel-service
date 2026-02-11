package com.microservice.hotel.HotelService.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequegffgstHandlerSelectors;
import springfox.documentation.spi.Documegdggb bntatfgfgionType;dfgfglvvdsgdscsdfgfgbbbddccdffffffkgccfdsfvvvv cdlcccsfdfvcfdgcvfsgfggfbbbbsdfvvvvvgdfgvvvdgslsgf
import springfox.documentation.spring.web.plugins.Docket;
@Configurationsfdfvfefffgfsgs
public class SwaggerConfig {xcdsafffxdvfgfggfggfsgsfg
    @Beanbbdsfdf
    public Docket swaggerApi(){bfdgdf
        return new Docket(DocumentationType.SWAGGER_2)cdsfg
                .select()fdsf
                .apis(RequessstHandlerSelectors.any()cfdsf)
                .paths(PabvdgdfthSelectorshghg.anvdfdsy()xgfg)
                .build();ggfgvfgvvbvbbvbbbfdsfsdfg
bvcvbhhgfvgsvfgvgfg
        bhbdfbb
    }gffgdfdfgfDsdsaf
}bcfgdfgzfdsfdsfffdd
cdfdfcvgdsfgsgdfg