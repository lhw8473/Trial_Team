package com.spring.pr.unqualify.mapper;

import java.util.List;

import com.spring.pr.command.UnqualifyVO;
import com.spring.pr.util.PageVO;
import com.spring.pr.util.SearchVO;

public interface IUnqualifyMapper {
	
	// 글 목록
	List<UnqualifyVO> getList(SearchVO search);
	
	//총 게시물 수
	int getTotal(PageVO vo);
	
	// 상세보기 
	UnqualifyVO getContent(int uno);
	
	// 수정 
	void update(UnqualifyVO board);
	
	// 삭제 
	void delete(int uno);
}
