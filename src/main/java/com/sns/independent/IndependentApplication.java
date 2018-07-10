package com.sns.independent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.sns.independent.property.FileStorageProperties;

@SpringBootApplication
@EnableConfigurationProperties({
    FileStorageProperties.class
})
public class IndependentApplication {

	public static void main(String[] args) {
		SpringApplication.run(IndependentApplication.class, args);
	}
}
