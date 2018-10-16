package com.example.camel_antexclude;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;

public class CamelRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        from("file://src/main/resources/test-files?recursive=true&antExclude=**/processed/**&move=processed")
        .routeId("file-route")
        .log("RECEIVED ${in.header."+Exchange.FILE_PARENT+"}/${in.header."+Exchange.FILE_NAME+"}");


    }

}
