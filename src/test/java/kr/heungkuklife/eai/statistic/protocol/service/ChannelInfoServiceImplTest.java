package kr.heungkuklife.eai.statistic.protocol.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Optional;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import kr.heungkuklife.eai.statistic.protocol.entity.ChannelInfoEntity;
import kr.heungkuklife.eai.statistic.protocol.repository.ProtocolUsageRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("dev")
public class ChannelInfoServiceImplTest {

	@Autowired
	private ChannelInfoService service;
	
	@Autowired
	private ProtocolUsageRepository repo;
	
	@Test
	public void test() {
		Optional<List<ChannelInfoEntity>> list = service.searchChannelByBocId("111");	
		
		assertEquals(false, list.isEmpty());
		
		if(!list.isEmpty()) {
			assertEquals(0, list.get().size());
		}
	}
	
	@Test
	public void selectTest() {
		ChannelInfoEntity e = new ChannelInfoEntity(0L, "HKMAIN", "AAAAAA", "2222222");
		repo.save(e);
		
		ChannelInfoEntity e1 = new ChannelInfoEntity(1L, "HKMSAOK", "AAAAAA", "2222222");
		repo.save(e1);
		
		ChannelInfoEntity e2 = new ChannelInfoEntity(2L, "HKTM", "AAAAA1", "2222222");
		repo.save(e2);
		
		Optional<List<ChannelInfoEntity>> list = service.searchChannelByBocId("AAAAAA");
		if(!list.isEmpty()) {
			assertEquals(2, list.get().size());
		}
		
	}
	
	@Before
	public void init() {
		repo.deleteAll();
	}
	
	@After
	public void tearDown() {
		repo.deleteAll();
	}
}
