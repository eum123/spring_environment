package kr.heungkuklife.eai.statistic.protocol.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import kr.heungkuklife.eai.statistic.protocol.entity.ChannelInfoEntity;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("dev")
public class ChannelInfoServiceImplTest {

	@Autowired
	private ChannelInfoService service;
	
	@Test
	public void test() {
		Optional<List<ChannelInfoEntity>> list = service.searchChannelByBocId("111");	
		
		assertEquals(false, list.isEmpty());
		
		if(!list.isEmpty()) {
			assertEquals(0, list.get().size());
		}
	}
}
