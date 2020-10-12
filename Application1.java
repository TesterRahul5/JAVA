      // Method Overriding Example

public class Application1 // Parent Class
{
	void register() // Parent Method
	{
		System.out.println("UserName consist of 4 character");
		System.out.println("Password consist of 4 character");
	}
	void login(String un,String pass)
	{
		if(un=="Shusma" && pass=="shusma123")
		{
		System.out.println("Login Succesfully");
		}
		else
		{
			System.out.println("Invalid Username/Password");	
		}	
	}
}