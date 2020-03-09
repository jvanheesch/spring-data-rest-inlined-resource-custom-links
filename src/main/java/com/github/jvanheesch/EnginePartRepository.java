package com.github.jvanheesch;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EnginePartProjection.class)
public interface EnginePartRepository extends CrudRepository<EnginePart, Long> {
}
