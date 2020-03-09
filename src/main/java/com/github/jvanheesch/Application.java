package com.github.jvanheesch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Application {
    @Autowired
    private EnginePartRepository enginePartRepository;
    @Autowired
    private EngineRepository engineRepository;
    @Autowired
    private CarRepository carRepository;

    public static void main(String... args) {
        SpringApplication.run(Application.class, args);
    }

    @PostConstruct
    public void init() {
        EnginePart enginePart = new EnginePart();
        enginePart.setName("enginePartName");
        enginePart = this.enginePartRepository.save(enginePart);
        Engine engine = new Engine();
        engine.setName("engineName");
        engine.setEnginePart(enginePart);
        engine = this.engineRepository.save(engine);
        Car car = new Car();
        car.setName("carName");
        car.setEngine(engine);
        this.carRepository.save(car);
    }
}
