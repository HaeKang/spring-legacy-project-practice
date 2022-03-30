package test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.domain.BoardVO;
import com.sample.persistence.BoardDAOImpl;

@Service
public class TestService {
	@Autowired
	private BoardDAOImpl dao;
	
	public List<BoardVO> listAll() throws Exception{
		System.out.println(">>>>>>>>>>>>>>>>>TestService");
		System.out.println(dao);
		return dao.listAll();
	}
	
	public BoardVO read(Integer bno) throws Exception {
		// TODO Auto-generated method stub
		return dao.read(bno);
	}
	
}
