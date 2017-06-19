package com.chip.LoginServices;

import java.util.List;

import com.chip.ProductServices.Product;
import com.chip.ProductServices.ProductDao;

public class LoginBusinessServices {

	LoginDao loginDao = new LoginDao();

	public LoginUser checkAuthentication(org.json.simple.JSONObject loginUser) {
		LoginUser User = null;
		try
		{
			User = loginDao.checkAuthentication(loginUser);
		}
		catch(Exception ex)
		{
			User = null;
		}
		
		return User;
	}

	
}
