package com.spring.pr.approval.service;

import java.util.List;

import com.spring.pr.command.SlctnVO;
import com.spring.pr.util.PageVO;
import com.spring.pr.util.SearchVO;

public interface IApprovalService {
	
	//승인 전체 목록
	List<SlctnVO> getList(SearchVO vo);
	
	//승인 상세 정보
	SlctnVO getContent(int ano);
	
	int getTotal(PageVO vo);
	
	//승인 삭제
	void delete(int ano);
	

}
