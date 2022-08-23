package com.spring.pr.unqualify.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.pr.command.UnqualifyVO;
import com.spring.pr.unqualify.mapper.IUnqualifyMapper;
import com.spring.pr.util.PageVO;
import com.spring.pr.util.SearchVO;

@Service
public class UnqualifyService implements IUnqualifyService {

	@Autowired
	private IUnqualifyMapper mapper;
	
	@Override
	public List<UnqualifyVO> getList(SearchVO search) {
		// TODO Auto-generated method stub
		return mapper.getList(search);
	}

	@Override
	public int getTotal(PageVO vo) {
		// TODO Auto-generated method stub
		return mapper.getTotal(vo);
	}

	@Override
	public UnqualifyVO getContent(int uno) {
		// TODO Auto-generated method stub
		return mapper.getContent(uno);
	}

	@Override
	public void update(UnqualifyVO board) {
		// TODO Auto-generated method stub
		mapper.update(board);

	}

	@Override
	public void delete(int uno) {
		// TODO Auto-generated method stub
		mapper.delete(uno);
	}

}
