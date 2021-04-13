package com.niit.OnlineCollaboration.dao;

import java.util.List;

import com.niit.OnlineCollaboration.model.User;

public interface IUserDao {

	List<User> userListbyStatus(String status);
	List<User> getAllUsers();
	User getUserById(int userId);
	User getUserByUsername(String username);
	User validateUser(User user);
	boolean addUser(User user);
	boolean updateUser(User user);
	boolean deleteUser(int userId);
	boolean deactivateUser(int userId);
	List<User> getAllInactivateUsers();
	boolean activeUser(int userId);
	boolean updateUserProfile(String file, Integer userId);
}
