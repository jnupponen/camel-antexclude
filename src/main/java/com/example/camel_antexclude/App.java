package com.example.camel_antexclude;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Hello World!" );
        CamelContext camelContext = new DefaultCamelContext();
        RouteBuilder route = new CamelRoute();
        camelContext.start();
        camelContext.addRoutes(route);


        Thread.sleep(10000);
    }
}
