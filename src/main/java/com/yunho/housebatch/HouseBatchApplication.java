package com.yunho.housebatch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableBatchProcessing
@SpringBootApplication
public class HouseBatchApplication {

    public static void main(String[] args) {
        SpringApplication.run(HouseBatchApplication.class, args);
    }

}
