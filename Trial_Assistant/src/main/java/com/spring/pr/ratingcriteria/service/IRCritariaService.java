package com.spring.pr.ratingcriteria.service;

import com.spring.pr.command.RatingCriteriaVO;
import com.spring.pr.command.UserBasicVO;

public interface IRCritariaService {

	//���
	void regist(RatingCriteriaVO rc);
	
	//�󼼺���
	RatingCriteriaVO getContent(String JoinId);
	
	//����
	void update(RatingCriteriaVO rc);
	
}
