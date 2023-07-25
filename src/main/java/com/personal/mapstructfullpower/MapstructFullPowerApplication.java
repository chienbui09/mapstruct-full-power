package com.personal.mapstructfullpower;

import com.personal.mapstructfullpower.dto.ShelveDto;
import com.personal.mapstructfullpower.entity.ShelveEntity;
import com.personal.mapstructfullpower.mapper.StorageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class MapstructFullPowerApplication {
    @Autowired
    StorageMapper storageMapper;

    public static void main(String[] args) {
        SpringApplication.run(MapstructFullPowerApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }
            ShelveDto dto = new ShelveDto()
                    .setGroupName("group")
                    .setMaxWeight("100");
            ShelveEntity map = storageMapper.map(dto);
            System.out.println(map);
        };
    }
}
