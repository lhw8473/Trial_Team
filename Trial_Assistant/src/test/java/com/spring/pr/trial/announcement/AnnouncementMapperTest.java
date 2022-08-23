package com.spring.pr.trial.announcement;

import java.sql.Timestamp;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.pr.announcement.mapper.IAnnouncementMapper;
import com.spring.pr.command.AncmtVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class AnnouncementMapperTest {
	
	@Autowired
	private IAnnouncementMapper mapper; 
	
	@Test
	public void registTest() {
		/*
		 * Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		 * System.out.println(timestamp);
		 */
		/*
		 * for(int i = 0; i<=50; i++) { AncmtVO ancmt = new AncmtVO();
		 * ancmt.setAnmNum(i); ancmt.setAnmUploadDate(timestamp); ancmt.setAnmTitle(i +
		 * "제목"); ancmt.setAnmContent(i +"내용"); ancmt.setAnmFileLoca("location");
		 * ancmt.setAnmViewCnt(i); ancmt.setManagerId(i+"id"); ancmt.setAnmDegree(i +
		 * "차"); ancmt.setAnmStart(timestamp); ancmt.setAnmEnd(timestamp);
		 * ancmt.setAnmYear("2022년"); ancmt.setAnmDivision("기관추천조력자");
		 * mapper.regist(ancmt); }
		 */
	}
	
	
//	@Test
//	public void getListTest() {
//		System.out.println(mapper.getList());
//	}
//	
//	@Test
//	public void getTotal() {
//		System.out.println(mapper.getTotal());
//	}
//	
	
	@Test
	public void updateTest() {
		
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println(timestamp);
        
		AncmtVO ancmt = new AncmtVO();
		ancmt.setAnmTitle("����������");
		ancmt.setAnmContent("�����ȳ���");
		ancmt.setAnmYear("2022��");
		ancmt.setAnmDegree("���� ����");
		
		ancmt.setAnmDivision("���� ������");
		ancmt.setAnmFileLoca("�������ϰ��");
		mapper.update(ancmt);
	}
	
	@Test
	public void deleteTest() {

		mapper.delete(50);
	}
	
	

}
