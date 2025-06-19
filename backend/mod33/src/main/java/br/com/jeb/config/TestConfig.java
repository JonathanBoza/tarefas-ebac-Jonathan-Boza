package br.com.jeb.config;

import br.com.jeb.domain.Brand;
import br.com.jeb.domain.Car;
import br.com.jeb.repository.BrandRepository;
import br.com.jeb.repository.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {

    @Bean
    CommandLineRunner initDatabase(BrandRepository brandRepository, CarRepository carRepository) {
        return args -> {
            Brand toyota = new Brand();
            toyota.setName("Toyota");
            brandRepository.save(toyota);

            Car corolla = new Car();
            corolla.setModel("Corolla");
            corolla.setYear(2023);
            corolla.setBrand(toyota);
            carRepository.save(corolla);

            System.out.println("Database initialized successfully!");
        };
    }
}
