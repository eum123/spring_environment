package kr.heungkuklife.eai.statistic.protocol.service;

import java.util.List;
import java.util.Optional;

import kr.heungkuklife.eai.statistic.protocol.entity.ChannelInfoEntity;

public interface ChannelInfoService {
	public Optional<List<ChannelInfoEntity>> searchChannelByBocId(String bocId);
}
