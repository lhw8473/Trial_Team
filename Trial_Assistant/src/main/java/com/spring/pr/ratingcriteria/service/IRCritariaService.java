package com.spring.pr.ratingcriteria.service;

import com.spring.pr.command.RatingCriteriaVO;
import com.spring.pr.command.UserBasicVO;

public interface IRCritariaService {

	//등록
	void regist(RatingCriteriaVO rc);
	
	//상세보기
	RatingCriteriaVO getContent(String JoinId);
	
	//수정
	void update(RatingCriteriaVO rc);
	
}
