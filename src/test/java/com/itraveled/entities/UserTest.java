package com.itraveled.entities;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class UserTest 
{
	@Test
	public void testGetId()
	{
		User user = new User(1, "Haraldur", "1234");
		assertEquals(1, user.getId());
	}

	@Test
	public void testSetId()
	{
		User user = new User();
		user.setId(1);

		assertEquals(1, user.getId());
	}

	@Test
	public void testGetName()
	{
		User user = new User(1, "Haraldur", "1234");
		assertEquals("Haraldur", user.getName());
	}

	@Test
	public void testSetName()
	{
		User user = new User();
		user.setName("Haraldur");

		assertEquals("Haraldur", user.getName());
	}

	@Test
	public void testGetPassword()
	{
		User user = new User(1, "Haraldur", "1234");
		assertEquals("1234", user.getPassword());
	}

	@Test
	public void testSetPassword()
	{
		User user = new User();
		user.setPassword("1234");

		assertEquals("1234", user.getPassword());
	}
}