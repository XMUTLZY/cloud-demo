package jake.cloudview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @EnableDiscoveryClient 用于发现eureka注册中心的微服务
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class CloudViewApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudViewApplication.class, args);
    }

}
