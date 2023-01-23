package cn.itcast.order;

import com.ithuipu.config.DefaultFeignConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(defaultConfiguration = DefaultFeignConfiguration.class,basePackages ="com.ithuipu.client" )  //开启feign的功能
@MapperScan("cn.itcast.order.mapper")
@SpringBootApplication
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }

    /**注册RestTemplate*/
    //@Bean
    //@LoadBalanced  //负载均衡--轮循
    //public RestTemplate restTemplate(){
    //    return new RestTemplate();
    //}
}