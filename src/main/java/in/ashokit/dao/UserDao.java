package in.ashokit.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao 
{
	public boolean SaveUser(String uname,String email,String pwd)
	{
		System.out.println("Storing Record in database");
		return true;
	}
}
