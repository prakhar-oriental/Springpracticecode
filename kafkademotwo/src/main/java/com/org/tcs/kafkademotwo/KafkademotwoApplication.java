package com.org.tcs.kafkademotwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class KafkademotwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkademotwoApplication.class, args);
	}

}
