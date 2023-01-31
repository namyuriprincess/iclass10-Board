package org.iclass.dao;

import org.apache.ibatis.session.SqlSession;
import org.iclass.vo.Community;

import mybatis.SqlSessionBean;

public class CommunityDao {
	private static final CommunityDao dao = new CommunityDao();
	private CommunityDao() {}
	public static CommunityDao getinstance() {
		return dao;
		
	}
	public int insert(Community vo) {
	SqlSession mapper = SqlSessionBean.getSession();
	int result=mapper.insert("community.insert",vo);  //두번째 인자 vo는 insert에 필요한 파라미터
	//마이바티스는 autocommit 아닙니다.
	mapper.commit();
	mapper.close();
	return result;
}

public int update(Community vo) {
	SqlSession mapper = SqlSessionBean.getSession();
	int result = mapper.update("community.update",vo);
	mapper.commit();
	mapper.close();
	return result;
}

public int delete(String id) {
	SqlSession mapper = SqlSessionBean.getSession();
	int result = mapper.delete("community.delete",id);
	mapper.commit();
	mapper.close();
	return result;
}
public Community selectByIdx(int idx) {
	SqlSession mapperSession = SqlSessionBean.getSession();
	Community vo = mapperSession.selectOne("community.selectByIdx",idx);
	mapperSession.close();
	return vo;
}
}
