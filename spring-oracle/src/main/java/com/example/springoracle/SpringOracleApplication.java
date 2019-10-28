package com.example.springoracle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.springoracle.repository.TeamRepository;


@SpringBootApplication

public class SpringOracleApplication implements CommandLineRunner{

	@Autowired
	TeamRepository t;

    public static void main(String[] args) {

        SpringApplication.run(SpringOracleApplication.class, args);

    }

    @Override

    public void run(String... arg0) throws Exception {

    	System.out.println(t.findById(1L));
    }

}




    
