package in.ashokit.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.dao.UserDao;

@Service
public class UserService 
{
	private UserDao userDao=null;
	
	@Autowired
	public UserService(UserDao userDao)
	{
		this.userDao=userDao;
	}
	public void registerUSer()
	{
		boolean isSaved=userDao.SaveUser("vamsi", "vamsiraju927@gmail.com", "vamsi@143");
		
		if(isSaved)
		{
			System.out.println("Record Was Saved Successfullyy....");
		}
		else
		{
			System.out.println("Record Was Failed To Save..");
		}
	}
	
}
