package com.example.demo_drools;

import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.internal.io.ResourceFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class DemoDroolsApplication  {
	public static void main(String[] args) {
		SpringApplication.run(DemoDroolsApplication.class, args);
	}
}
