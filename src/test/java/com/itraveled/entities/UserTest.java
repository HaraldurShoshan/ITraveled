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
}