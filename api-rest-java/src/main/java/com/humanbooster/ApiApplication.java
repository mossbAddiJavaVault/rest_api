package com.humanbooster;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.jackson.JacksonFeature;

public class ApiApplication extends ResourceConfig {
    public ApiApplication() {
        packages("com.humanbooster");
        register(JacksonFeature.class);
    }
} 