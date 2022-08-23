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
			rcrit.setJoinId("���");
			rcrit.setRcAjmJdgeScore(30);
			rcrit.setRcApcName("�����");
			rcrit.setRcAppraiserScore(2);
			rcrit.setRcCeritificationName1("����� ������");
			rcrit.setRcCeritificationName2("����� �ڵ���");
			rcrit.setRcCeritificationName3("����� �����");
			rcrit.setRcCeritificationName4("����� �����");
			rcrit.setRcInterviewEvaluation("���");
			rcrit.setRcPersonalyEvaluation("����");
			rcrit.setRcTotalCareer("5~10��");
			rcrit.setRcLocalCareer("5��̸�");
			rcrit.setRcOfficeLoca("��⵵ ��õ");
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
//		return mapper.getContent("�����");
		
	}
	
	@Test
	public void update() {} 
}
