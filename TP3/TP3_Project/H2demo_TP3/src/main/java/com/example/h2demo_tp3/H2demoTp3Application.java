package com.example.h2demo_tp3;

import com.example.h2demo_tp3.entities.Adherent;
import com.example.h2demo_tp3.repository.AdherentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class H2demoTp3Application {

    public static void main(String[] args) {
        SpringApplication.run(H2demoTp3Application.class, args);
    }

    @Bean
    CommandLineRunner runner(AdherentRepository repository)
    {
        return args ->
        {
            repository.save(new Adherent(null, "A", "B",29));
            repository.save(new Adherent(null, "A", "B",29));
            repository.save(new Adherent(null, "A", "B",29));
            repository.save(new Adherent(null, "A", "B",29));

        };

    }

}
