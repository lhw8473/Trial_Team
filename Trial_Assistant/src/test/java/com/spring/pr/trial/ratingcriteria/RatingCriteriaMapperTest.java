package com.spring.pr.trial.ratingcriteria;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.pr.command.RatingCriteriaVO;
import com.spring.pr.ratingcriteria.mapper.IRCriteriaMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class RatingCriteriaMapperTest {
	
	@Autowired
	private IRCriteriaMapper mapper;
	
	@Test
	public void regist() {
		RatingCriteriaVO rcrit  = new RatingCriteriaVO();
		for (int i = 0; i <= 50; i++) {
			rcrit.setJoinId("Èì³Ä");
			rcrit.setRcAjmJdgeScore(30);
			rcrit.setRcApcName("±èÈì³Ä");
			rcrit.setRcAppraiserScore(2);
			rcrit.setRcCeritificationName1("Èì³ÄÀÇ ÀÚÀü°Å");
			rcrit.setRcCeritificationName2("Èì³ÄÀÇ ÀÚµ¿Â÷");
			rcrit.setRcCeritificationName3("Èì³ÄÀÇ ±¼»è±â");
			rcrit.setRcCeritificationName4("Èì³ÄÀÇ ºñÇà±â");
			rcrit.setRcInterviewEvaluation("¿ì¼ö");
			rcrit.setRcPersonalyEvaluation("º¸Åë");
			rcrit.setRcTotalCareer("5~10³â");
			rcrit.setRcLocalCareer("5³â¹Ì¸¸");
			rcrit.setRcOfficeLoca("°æ±âµµ ÀÌÃµ");
			rcrit.setRcLastTotalScore(100);
			rcrit.setRcNum(i);
			rcrit.setRcLastTotalScore(23);
			
			mapper.regist(rcrit);
		}
	}
	
	@Test
	public void getContenewet() {
		
		System.out.println(mapper.getContent("lhw8473"));
//		return mapper.getContent("lhw8473");
//		return mapper.getContent("±è°íÅë");
		
	}
	
	@Test
	public void update() {} 
}
