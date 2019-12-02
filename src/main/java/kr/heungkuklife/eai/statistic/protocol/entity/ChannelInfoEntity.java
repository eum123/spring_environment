package kr.heungkuklife.eai.statistic.protocol.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Entity
@Data
@Table(name="REQSYS_BOCIDLIST")
public class ChannelInfoEntity {
	@Id
	@Column(name = "ID", nullable = false)
	private int id;
	
	@JsonProperty
	@Column(name = "HDR_REQ_SYS_ID", nullable = true)
	private String channelId;

	@JsonProperty
	@Column(name = "HDR_DEST_PROG", nullable = true)
	private String bocId;

	@JsonProperty
	@Column(name = "LISTTIMESTAMP", nullable = true)
	private String timestamp;
	
	public ChannelInfoEntity() {
		
	}
	
	public ChannelInfoEntity(int id, String channelId, String bocId, String timestamp) {
		this.id = id;
		this.channelId = channelId;
		this.bocId = bocId;
		this.timestamp = timestamp;
	}
}
