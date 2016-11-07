package com.itraveled.entities;

public class User
{

	private int userId;
	private String userName;
	private String password;

	public User()
	{
		userId = 0;
		userName = null;
		password = null;
	}

	public User(int id, String name, String pass)
	{
		userId = id;
		userName = name;
		password = pass;
	}

	public int getId()
	{
		return userId;
	}
}