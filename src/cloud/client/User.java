public class User {
	
	public final String userName;
	public final String userID;
	
	User(String userName, String userID) {
		this.userName = userName;
		this.userID = userID;
	}
	
	public String getUserName()
	{
		return this.userName;
	}
	
	public String getUserID()
	{
		return this.userID;
	}
	
}
