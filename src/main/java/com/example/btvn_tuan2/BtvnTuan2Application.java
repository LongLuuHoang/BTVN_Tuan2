package com.example.btvn_tuan2;
import com.example.btvn_tuan2.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BtvnTuan2Application {

    public static void main(String[] args) {
        SpringApplication.run(BtvnTuan2Application.class, args);
    }
    @Bean
    public CommandLineRunner run(StudentRepository studentRepository) {
        return (args -> {
            System.out.println(studentRepository.findAll());
        });
    }
}
