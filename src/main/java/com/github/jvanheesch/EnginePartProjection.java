package com.github.jvanheesch;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "enginePartProjection", types = EnginePart.class)
public interface EnginePartProjection {
    String getName();
}
