package jake.cloudservice2;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import java.util.Scanner;

@SpringBootApplication
@EnableEurekaClient
public class CloudService2Application {

    public static void main(String[] args) {
        // 模拟集群操作
        System.out.println("请输入端口号:");
        Scanner scanner = new Scanner(System.in);
        String strPort = scanner.nextLine();
        new SpringApplicationBuilder(CloudService2Application.class).properties("server.port=" + strPort).run(args);
    }

}

