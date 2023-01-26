package com.example.implementation;

import com.example.superclass.AbstractClass;
import io.quarkus.logging.Log;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.StartupEvent;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.event.Observes;

public class ImplementationClass extends AbstractClass {

    @PostConstruct
    void setup() {
        Log.info("PostConstruct method executed");
    }

    void onStartup(@Observes StartupEvent event) {
        Log.info("Startup executed.");
        Quarkus.asyncExit();
    }

}
