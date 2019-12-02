package kr.heungkuklife.eai.statistic.protocol.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.heungkuklife.eai.statistic.protocol.entity.ChannelInfoEntity;
import kr.heungkuklife.eai.statistic.protocol.repository.ProtocolUsageRepository;

@Service
@Transactional
public class ChannelInfoService {
	
	//@Autowired
	private ProtocolUsageRepository repository;
	
	public Optional<List<ChannelInfoEntity>> searchChannelByBocId(String bocId) {
		
		return Optional.of(repository.findAllByBocId(bocId));
	}
}
