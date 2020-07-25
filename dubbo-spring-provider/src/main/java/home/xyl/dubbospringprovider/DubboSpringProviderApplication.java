package home.xyl.dubbospringprovider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableDubbo
@SpringBootApplication
public class DubboSpringProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboSpringProviderApplication.class, args);
    }

}
