package kr.heungkuklife.eai.statistic.protocol.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import kr.heungkuklife.eai.statistic.protocol.entity.ChannelInfoEntity;
import kr.heungkuklife.eai.statistic.protocol.service.ChannelInfoService;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("dev")
public class ProtocolUsageRepositoryTest {
	
	@Autowired
	private ProtocolUsageRepository repository;
	
	@Autowired
	private ChannelInfoService service;
	
	
	@Test
	public void test() {
		assertEquals(0, repository.count());
		
		ChannelInfoEntity e = new ChannelInfoEntity(1, "HKCALL", "BOC_ID_1", "2019111111");
		repository.save(e);
		
		assertEquals(1, repository.count());
		
		List<ChannelInfoEntity> list = repository.findAllByBocId("BOC_ID_1");
		assertEquals(1, list.size());
		
		ChannelInfoEntity findedEntity = list.get(0);
		assertEquals("HKCALL", findedEntity.getChannelId());
	}
	
	@After
    public void cleanup() {
       
		repository.deleteAll();
    }

}
