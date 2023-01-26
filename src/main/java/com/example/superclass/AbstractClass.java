package com.example.superclass;

import io.quarkus.logging.Log;
import jakarta.annotation.PreDestroy;

public abstract class AbstractClass {

    @PreDestroy
    void cleanup() {
        Log.info("PreDestroy method called");
    }

}
