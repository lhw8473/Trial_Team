package com.spring.pr.announcement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.pr.announcement.mapper.IAnnouncementMapper;
import com.spring.pr.command.AncmtVO;
import com.spring.pr.util.PageVO;
import com.spring.pr.util.SearchVO;

@Service
public class AnnouncementService implements IAnnouncementService {

	@Autowired
	private IAnnouncementMapper mapper; 
	
	@Override
	public void regist(AncmtVO ancmt) {
		// TODO Auto-generated method stub
		
		mapper.regist(ancmt);
	}

	
	//@Override
	//public List<AncmtVO> getList(PageVO vo) {
		
		//List<AncmtVO> anmList = mapper.getList(vo);
		/*
		 * for(AncmtVO article: list) {
		 * 
		 * 현재 시간 얻어오기 long now = System.currentTimeMillis(); long regTime =
		 * article.getRegDate().getTime();
		 * 
		 * 밀리초이기 때문에 마지막에 1000을 곱해줌.
		 * 
		 * if(now - regTime < 60*60*24*2*1000) { article.setNewMark(true); }
		 * 
		 * }
		 */
		
		//return anmList;
	//}
		@Override
		public List<AncmtVO> getList(SearchVO search) {
			// TODO Auto-generated method stub
			
			//mapper에게 전달할 맵 데이터를 생성.
			//key -> xml에서 활용할 이름, value -> 값.
			
			//어떤 타입의 객체를 받든 상관없게 오브젝트 타입으로 넣는다.
			/*
			 * Map<String, Object> data = new HashMap<>(); 
			 * data.put("paging", paging);
			 * data.put("condition", condition); data.put("keyword", keyword);
			 */
			System.out.println("써치값:" + search);
			List<AncmtVO> list = mapper.getList(search);
			/*
			 * for(AncmtVO article : list) { long now = System.currentTimeMillis(); long
			 * regTime = article.getRegDate().getTime();
			 * 
			 * if(now-regTime < 60*60*24*1000) { article.setNewMark(true); } }
			 */
			
			return list;
		}

	@Override
	public int getTotal(PageVO vo) {
		return mapper.getTotal(vo);
	}
	

	@Override
	public AncmtVO getContent(int ano) {
		// TODO Auto-generated method stub
		return mapper.getContent(ano);
	}

	@Override
	public void update(AncmtVO board) {
		// TODO Auto-generated method stub
		mapper.update(board);
	}

	@Override
	public void delete(int ano) {
		// TODO Auto-generated method stub
		mapper.delete(ano);
	}

}
