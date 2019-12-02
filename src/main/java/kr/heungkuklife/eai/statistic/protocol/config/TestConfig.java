package kr.heungkuklife.eai.statistic.protocol.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties(prefix = "test")
@Data
public class TestConfig {
	private String key;	
}
