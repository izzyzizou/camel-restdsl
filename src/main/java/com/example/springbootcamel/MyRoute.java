package com.example.springbootcamel;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyRoute extends RouteBuilder {

    @Override
    public void configure(){
//        rest("/")
//                .produces("text/plain")
//                .get("hello")
//                .to("direct:hello");
//        from("direct:hello")
//                .to("geocoder:latlng:40.714224,-73.961452")
//                .transform().simple("Hello from Spring boot and Camel. Location: ${header.CamelGeocoderAddress} and the lat/lng is ${header.CamelGeocoderLatlng} and country is ${header.CamelGeoCoderCountryShort}");
        restConfiguration().component("restlet").host("localhost").port("8383");
        rest("/api/names").get().route().setBody(constant("Blake, John, Rob"));


    }
}
