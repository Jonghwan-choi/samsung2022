package iocexam.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import iocexam.domain.User;

@Repository("userDAO")
public class UserDAOImpl implements UserDAO {

	@Override
	public User getUser(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addUser(User user) {
		System.out.println(user + "의 정보가 잘 저장 되었습니다^^");
	}

}
