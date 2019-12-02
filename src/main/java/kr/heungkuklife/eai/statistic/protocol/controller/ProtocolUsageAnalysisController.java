package kr.heungkuklife.eai.statistic.protocol.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kr.heungkuklife.eai.statistic.common.response.ApiResponseMessage;
import kr.heungkuklife.eai.statistic.protocol.service.ChannelInfoService;

/**
 * 전문 사용 채널
 * 
 * @author jin
 *
 */
@RestController
public class ProtocolUsageAnalysisController {
	@Autowired
	private ChannelInfoService channelInfoService;

	@RequestMapping(value = "/analysis/channels", method = RequestMethod.GET)
	public ResponseEntity<ApiResponseMessage> searchChannelIdByBocID(@RequestParam("bocid") String bocId) {
		Optional result = channelInfoService.searchChannelByBocId(bocId);
		
		
		ApiResponseMessage message = null; 
		if(result.isEmpty()) {
			message = new ApiResponseMessage(HttpStatus.OK,
					"" , "", "");
		} else {
			message = new ApiResponseMessage(HttpStatus.OK,
				channelInfoService.searchChannelByBocId(bocId), "", "");
		}
		return new ResponseEntity<ApiResponseMessage>(message, message.getStatus());

	}
}
