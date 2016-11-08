package com.itraveled;

import com.itraveled.entities.*;
import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;

public class ITraveled implements SparkApplication
{
	public static void main(String[] args)
	{	
		staticFileLocation("/public");
		SparkApplication iTraveled = new ITraveled();

		String port = System.getenv("PORT");
        if (port != null) {
            port(Integer.valueOf(port));
        }

        iTraveled.init();
	}

	@Override
    public void init()
    {
    	post("/loginUser", (req, res) ->
    	{
    		User user = new User();

    		final String userName = req.queryParams("userName");
    		final String userPass = req.queryParams("userPass");

    		user.setId(1);
    		user.setName(userName);
    		user.setPassword(userPass);

    		res.status(200);

    		return res;
    	});
    }	
}
