package kr.heungkuklife.eai.statistic.protocol.config;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import kr.heungkuklife.eai.statistic.RestApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestApplication.class)
@TestConfiguration
@ActiveProfiles("dev")
public class TestConfigTest {
	@Autowired
	private TestConfig config;
	
	@Test
	public void test() {
		assertEquals("dev", config.getKey());
	}
}
