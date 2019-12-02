package kr.heungkuklife.eai.statistic.protocol.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.heungkuklife.eai.statistic.protocol.entity.ChannelInfoEntity;

@Repository
public interface ProtocolUsageRepository extends JpaRepository<ChannelInfoEntity, String> {
	public List<ChannelInfoEntity> findAllByBocId(String bocId);
}
