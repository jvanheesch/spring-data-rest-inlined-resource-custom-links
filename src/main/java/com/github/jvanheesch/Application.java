package com.github.jvanheesch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Application {
    @Autowired
    private EngineRepository engineRepository;
    @Autowired
    private CarRepository carRepository;

    public static void main(String... args) {
        SpringApplication.run(Application.class, args);
    }

    @PostConstruct
    public void init() {
        Engine engine = new Engine();
        engine.setName("engineName");
        engine = this.engineRepository.save(engine);
        Car car = new Car();
        car.setName("carName");
        car.setEngine(engine);
        this.carRepository.save(car);
    }
}
