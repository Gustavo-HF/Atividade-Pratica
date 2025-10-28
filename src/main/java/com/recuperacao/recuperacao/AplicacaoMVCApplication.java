package com.recuperacao.recuperacao;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AplicacaoMVCApplication {

	public static void main(String[] args) {
		SpringApplication.run(AplicacaoMVCApplication.class, args);

		System.out.println("Sistema funcionando!!!");
		System.out.println("Acesse: http://localhost:8080");
	}

}
