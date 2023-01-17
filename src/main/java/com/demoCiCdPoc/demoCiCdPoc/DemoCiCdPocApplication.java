package com.demoCiCdPoc.demoCiCdPoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoCiCdPocApplication {

	@GetMapping("/get")
	public String getMsg() {
		return "Testing Done!!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoCiCdPocApplication.class, args);
	}

}
