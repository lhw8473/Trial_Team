package com.spring.pr.announcement.mapper;

import java.util.List;

import com.spring.pr.command.AncmtVO;
import com.spring.pr.util.PageVO;
import com.spring.pr.util.SearchVO;

public interface IAnnouncementMapper {
	
	// 글 등록 
	void regist(AncmtVO board);
	
	// 글 목록
	List<AncmtVO> getList(SearchVO search);
	
	//총 게시물 수
	int getTotal(PageVO vo);
	
	// 상세보기 
	AncmtVO getContent(int ano);
	
	// 수정 
	void update(AncmtVO board);
	
	// 삭제 
	void delete(int ano);

}
