package com.example.WebService;

import com.example.WebService.configuration.WebServiceConfiguration;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class Main extends Application <WebServiceConfiguration> {

    public static void main(String[] args) throws Exception {
        new Main().run(args);
    }

    @Override
    public String getName(){
        return "Web-Service";
    }

    @Override
    public void initialize(Bootstrap<WebServiceConfiguration> bootstrap){
    }
    
    @Override
    public void run(WebServiceConfiguration configuration, Environment environment){
    }
}

