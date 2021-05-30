package cn.yzccz.springbootsimple;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.yzccz.springbootsimple.mapper")
public class SpringbootSimpleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSimpleApplication.class, args);
    }

}
