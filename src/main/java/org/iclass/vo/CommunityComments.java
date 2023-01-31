package org.iclass.vo;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CommunityComments {
	private int idx;
	private int mref;
	private String writer;
	private String content;
	private Timestamp createAt;
	private String ip;
	private int heart;

}