package com.spring.pr.ratingcriteria.mapper;

import com.spring.pr.command.RatingCriteriaVO;
import com.spring.pr.command.UserBasicVO;

public interface IRCriteriaMapper {
	//���
		void regist(RatingCriteriaVO rc);
		
		//�󼼺���
		RatingCriteriaVO getContent(String JoinId);
		
		//����
		void update(RatingCriteriaVO rc);
}
