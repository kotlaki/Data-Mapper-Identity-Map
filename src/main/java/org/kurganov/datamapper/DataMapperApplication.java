package org.kurganov.datamapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DataMapperApplication implements CommandLineRunner {

    @Autowired
    private InfoMapperImpl infoMapper;

    public static void main(String[] args) {
        SpringApplication.run(DataMapperApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


        System.out.println("FIND BY ID = 1 :: " + infoMapper.findById(1).getName());
        System.out.println("FIND BY ID = 2 :: " + infoMapper.findById(2).getName());
        System.out.println("FIND BY ID NEW = 1 :: " + infoMapper.findById(1).getName());



        List<Info> list = infoMapper.findAll();

        for (Info o: list) {
            System.out.println(o.getId() + " || " + o.getName());
        }

    }
}
