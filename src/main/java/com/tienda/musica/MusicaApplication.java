package com.tienda.musica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = {"com.tienda.musica"})

public class MusicaApplication {

	public static void main(String[] args) {
		System.out.println("Hola, haciendo pruebas a la tienda");
		SpringApplication.run(MusicaApplication.class, args);
	}

}
