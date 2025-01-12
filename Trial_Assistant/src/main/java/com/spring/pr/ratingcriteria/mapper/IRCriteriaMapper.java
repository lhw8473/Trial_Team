package com.spring.pr.ratingcriteria.mapper;

import com.spring.pr.command.RatingCriteriaVO;
import com.spring.pr.command.UserBasicVO;

public interface IRCriteriaMapper {
	//등록
		void regist(RatingCriteriaVO rc);
		
		//상세보기
		RatingCriteriaVO getContent(String JoinId);
		
		//수정
		void update(RatingCriteriaVO rc);
}
