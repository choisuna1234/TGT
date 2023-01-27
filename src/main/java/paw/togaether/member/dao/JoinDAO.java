package paw.togaether.member.dao;

import org.springframework.stereotype.Repository;
import paw.togaether.common.dao.AbstractDAO;

import java.util.Map;

@Repository("joinDAO")
public class JoinDAO extends AbstractDAO {

	public void insertMembers(Map<String, Object> map) throws Exception {
		insert("join.insertMembers", map);	
	}

	public int checkId(String id) throws Exception {
		int result = selectOneInt("join.findId", id);
		return result;
	}


}
