package kr.heungkuklife.eai.statistic.protocol.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import kr.heungkuklife.eai.statistic.protocol.service.ChannelInfoService;


@RunWith(SpringRunner.class)
@WebMvcTest(ProtocolUsageAnalysisController.class)
@ActiveProfiles("dev")
public class ProtocolUsageAnalysisControllerTest {

	@Autowired(required=true)
	private MockMvc mockMvc;
	
	@MockBean
	private ChannelInfoService service;
	
	
	@Test
	public void analysisChannelTest() throws Exception {
		
		Map<String, String> urlVariables = new HashMap();
		urlVariables.put("bocid", "111");
	
		mockMvc.perform(get("/analysis/channels").param("bocid", "111"))
			.andDo(print()).andExpect(status().isOk());
		
	}
}
