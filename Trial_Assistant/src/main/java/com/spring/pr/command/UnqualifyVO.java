package com.spring.pr.command;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
CREATE TABLE Unqualify (
	JOIN_ID	VARCHAR2(20)	NOT NULL,
	UNQ_REASON	VARCHAR2(500)	NOT NULL
	);
*/

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UnqualifyVO {
	
	private String UnqReason;	//부적격사유
	private String JoinId;	//아이디
	
	//. 추가된 변수
	private int AppNumSeq;	//신청번호
	private String AppClassification; //신청구분
	private Date AppDate;	//신청날짜
	private String JoinName;	//신청인

}
