package com.lti.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lti.model.User;

@Repository("urepository")
public class UserRepositoryImpl implements UserRepository
{

	@Override
	public User addUser(User u) 
	{
		
		return null;
	}

	@Override
	public void updateUser(User u)
	{
	
		
	}

	@Override
	public void deleteUser(User u)
	{
	
		
	}

	@Override
	public User findUserById(int id) 
	{
	
		return null;
	}

	@Override
	public User findUserByEmail(String email)
	{
		User u=new User(1,"Meghana","megh@gmail.com","megh123");
		return u;
	}

	@Override
	public List<User> findAllUsers() 
	{
	
		return null;
	}

}
