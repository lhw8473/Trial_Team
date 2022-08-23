package com.spring.pr.approval.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.pr.approval.mapper.IApprovalMapper;
import com.spring.pr.command.SlctnVO;
import com.spring.pr.util.PageVO;
import com.spring.pr.util.SearchVO;

@Service
public class ApprovalService implements IApprovalService {

	@Autowired
	private IApprovalMapper mapper;
	
	@Override
	public List<SlctnVO> getList(SearchVO vo) {
		
		return mapper.getList(vo);
	
	}

	@Override
	public SlctnVO getContent(int ano) {
		
		return mapper.getContent(ano);
	}
	
	@Override
	public int getTotal(PageVO vo) {
		return mapper.getTotal(vo);
	}

	@Override
	public void delete(int ano) {
		mapper.delete(ano);

	}

}
