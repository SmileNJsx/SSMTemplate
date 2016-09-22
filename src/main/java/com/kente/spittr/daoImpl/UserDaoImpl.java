package com.kente.spittr.daoImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.kente.spittr.dao.UserDao;
import com.kente.spittr.model.User;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao
{
	public List<User> getAllUsers()
	{
		// TODO Auto-generated method stub
		SqlSession sqlSession = this.getSqlSession();
		
		List<User> users = sqlSession.selectList("mapping.UserMapper.getUser");
		
		return users;
	}
}
