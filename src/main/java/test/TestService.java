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
	
	public void regist(BoardVO board) throws Exception {
		// TODO Auto-generated method stub
		dao.create(board);
	}

	public BoardVO read(Integer bno) throws Exception {
		// TODO Auto-generated method stub
		return dao.read(bno);
	}

	public void modify(BoardVO board) throws Exception {
		// TODO Auto-generated method stub
		dao.update(board);
	}

	public void remove(Integer bno) throws Exception {
		// TODO Auto-generated method stub
		dao.delete(bno);
	}

	public List<BoardVO> listAll() throws Exception {
		// TODO Auto-generated method stub
		return dao.listAll();
	}
	
}
