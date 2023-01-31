package org.iclass.vo;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Community {
	private int idx;
	private String writer;
	private String title;
	private String content;
	private int readCount;
	private Timestamp createdat;
	private String ip;
	private int commentcount;
}
