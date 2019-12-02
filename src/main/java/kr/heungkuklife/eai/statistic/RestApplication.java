package kr.heungkuklife.eai.statistic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class RestApplication {
	public static void main(String[] args) {
        SpringApplication.run(RestApplication.class, args);
    }
}
