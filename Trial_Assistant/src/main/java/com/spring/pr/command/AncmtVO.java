package com.spring.pr.command;





import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class AncmtVO {
	
	/*
	CREATE TABLE Announcement (
		anm_no_seq NUMBER(10), 
		anm_upload_date DATE  DEFAULT sysdate NOT NULL, 
		anm_title VARCHAR2(100) NOT NULL, 
		anm_content VARCHAR2(1000) NOT NULL, 
		anm_file_loca VARCHAR2(100) NOT NULL, 
		anm_view_cnt NUMBER  DEFAULT 0 , 
		mngr_id VARCHAR2(20) NOT NULL, 
		anm_degree VARCHAR2(50) NOT NULL,
		anm_start DATE NOT NULL, 
		anm_end DATE NOT NULL
		anm_year VARCHAR2(10) NOT NULL,
		anm_division VARCHAR2(10) NOT NULL
		);	
	
	CREATE SEQUENCE anm_no_seq_name
	    START WITH 1
	    INCREMENT BY 1 
	    MAXVALUE 1000
	    NOCYCLE 
	    NOCACHE; 
	*/
	
	//
	private int AnmNum;	//공고 번호
	private Date AnmUploadDate;	//공고 작성 날짜
	private String AnmTitle;	//공고 제목
	private String AnmContent;	//공고 내용
	private String AnmFileLoca;	//공고 파일 경로
	private int AnmViewCnt;	//공고 조회수
	private String ManagerId;	//공고 작성자
	private String AnmDegree;	//공고 차수
	private Date AnmStart; //공고 시작일
	private Date AnmEnd;	//공고 마감일
	private String AnmDivision; //공고 조력자 구분
	private String AnmYear; //공고 년도
	
}


















