package com.spring.pr.ratingcriteria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.pr.command.RatingCriteriaVO;
import com.spring.pr.command.UserBasicVO;
import com.spring.pr.ratingcriteria.mapper.IRCriteriaMapper;

@Service
public class RCriteriaService implements IRCritariaService {

	@Autowired
	private IRCriteriaMapper mapper;
	
	@Override
	public void regist(RatingCriteriaVO rc) {
		// TODO Auto-generated method stub
		mapper.regist(rc);
	}

	@Override
	public RatingCriteriaVO getContent(String JoinId) {
		// TODO Auto-generated method stub
		return mapper.getContent(JoinId);
	}

	@Override
	public void update(RatingCriteriaVO rc) {
		// TODO Auto-generated method stub
		mapper.update(rc);
	}

}
