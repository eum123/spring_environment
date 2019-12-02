package kr.heungkuklife.eai.statistic.protocol.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import kr.heungkuklife.eai.statistic.protocol.entity.ChannelInfoEntity;

@RunWith(SpringRunner.class)
public class ChannelInfoServiceTest {

	@MockBean
	private ChannelInfoService service;
	
	@Test
	public void test() {
		Optional<List<ChannelInfoEntity>> list = service.searchChannelByBocId("111");	
		
		assertEquals(true, list.isEmpty());
		
		System.out.println(list.get());
	}
}
