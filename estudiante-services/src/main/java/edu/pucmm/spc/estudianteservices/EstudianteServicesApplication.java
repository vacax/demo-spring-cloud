package edu.pucmm.spc.estudianteservices;

import edu.pucmm.spc.estudianteservices.entidades.Estudiante;
import edu.pucmm.spc.estudianteservices.repositorios.EstudianteRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class EstudianteServicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(EstudianteServicesApplication.class, args);
    }


    @Bean
    public CommandLineRunner demo(EstudianteRepo repository) {
        return args -> {
           repository.save(new Estudiante(20011136, "Carlos Camacho", "asd@asd.com", "telemático"));
           repository.save(new Estudiante(20011137, "Domingo Jiménez", "asd@asd.com", "telemático"));
           repository.save(new Estudiante(20011287, "Carlos Estévez", "asd@asd.com", "telemático"));
        };
    }
}
