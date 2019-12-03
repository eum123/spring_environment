package kr.heungkuklife.eai.statistic.protocol.entity;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class ChannelInfoEntityTest {

	@Test
	public void convertJson() throws Exception {
		ChannelInfoEntity entity = new ChannelInfoEntity(1L, "channelId", "bocId", "1111");
		
		ObjectMapper mapper = new ObjectMapper();
	    mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
	    String result = mapper.writeValueAsString(entity);
	    
		
		System.out.println(result.toString());
	}
}
