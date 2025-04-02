package com.humber.Week11SpringProfiles.configs;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevConfig implements DBConfig {

    @Override
    public void setupDBConnection() {
        System.out.println("Setting up default Dev connection");
    }
}