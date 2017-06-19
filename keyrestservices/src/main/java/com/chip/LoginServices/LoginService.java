package com.chip.LoginServices;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.chip.ProductServices.ProductResourceService;


@Path("/LoginServices")
public class LoginService {
	// ProductBusinessServices serviceImpl = new ProductBusinessServices();

	LoginBusinessServices pResService = new LoginBusinessServices();

	@POST
	@Path("/Login")
	@Produces(MediaType.APPLICATION_JSON)
	public org.json.simple.JSONObject addProduct(org.json.simple.JSONObject json) {

		LoginUser User;
		org.json.simple.JSONObject outputJsonObj = new org.json.simple.JSONObject();
		
		Object result_true=true;
		Object result_flase=false;
		//String username = (String)json.get("username");
		User = pResService.checkAuthentication(json);
		
		if(User!=null)
		{
			String userFullName = User.getFullname();
			outputJsonObj.put("authenticated", result_true);
			outputJsonObj.put("userfullname", userFullName.toString());
			//json.setString("name", "celery");
			//outputJsonObj.to
			
		}
		else
		{
			outputJsonObj.put("authenticated", result_flase);
			outputJsonObj.put("userfullname", "");
		}
			
         return outputJsonObj;
	}

	
}
