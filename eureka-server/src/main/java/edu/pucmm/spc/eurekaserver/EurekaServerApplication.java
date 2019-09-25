package edu.pucmm.spc.eurekaserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

    

    public static void main(String[] args) throws Exception {
        Thread.sleep(10000);
        SpringApplication.run(EurekaServerApplication.class, args);
    }


}
