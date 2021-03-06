package com.spring.akn.repositories;

import com.spring.akn.entities.user.User;

public interface UserRespositories {
	public int userRegister(User user);
	public User userLogin(String email,String password);
	public int enableUser(int id);
	public int updateUser(User user);
	public User getUser(int id);
	public int changePassword(String newpass,int id);
    public User getCurrentPass(int id);
}
