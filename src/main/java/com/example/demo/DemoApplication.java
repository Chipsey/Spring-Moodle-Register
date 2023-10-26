package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/letter")
	public String Letter(
			@RequestParam(name = "fullName") String fullName,
			@RequestParam(name = "indexNumber") String indexNumber,
			@RequestParam(name = "batch") int batch,
			@RequestParam(name = "semesterNumber") int semesterNumber,
			@RequestParam(name = "registeredName") String registeredName
	)
	{
		return ("Dear Sir/Madam, <br><br><br>I am " + fullName
				+ " of index number " + indexNumber
				+ ". I am from batch " + batch
				+ ". This is regarding the " + semesterNumber
				+ " module registration.<br>Please find my registration pdf in the attachment.<br>"
				+ "Thank You.<br><br>Best Regards,<br>"
				+ registeredName
		);
	}
}
