package kr.heungkuklife.eai.statistic.protocol.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.heungkuklife.eai.statistic.protocol.entity.ChannelInfoEntity;


public interface ProtocolUsageRepository extends JpaRepository<ChannelInfoEntity, String> {
	public List<ChannelInfoEntity> findAllByBocId(String bocId);
}
