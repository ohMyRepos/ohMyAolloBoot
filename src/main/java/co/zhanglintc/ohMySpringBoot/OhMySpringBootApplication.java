package co.zhanglintc.ohMySpringBoot;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * Server:
 *  - http://localhost:8080
 *
 * Apollo servers:
 *  - http://192.168.33.100:8070 Apollo-Portal(Apollo)
 *  - http://192.168.33.100:8080 Apollo-Config(Eureka)
 *  - http://192.168.33.100:8090 Apollo-Admin
 */

@SpringBootApplication
@ServletComponentScan
@EnableApolloConfig
public class OhMySpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(OhMySpringBootApplication.class, args);
    }

}
