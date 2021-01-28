package ChatBox;

public class CustomerDetails {
     private String name ;
     private String userId ;
     private  String userName ;
	
     public String getuserName() {
		return userName;
	}
	public void setuserName(String userName) {
		this.userName = userName;
	}
	public String getUser_id() {
		return userId;
	}
	public void setUser_id(String user_id) {
		this.userId = user_id;
	}
	public String getName() {
		return name;
	}
	public CustomerDetails(String name , String userName  , String userId) {
		this.name = name ;
		this.userName  = userName ;
		this.userId = userId ;
		
		
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	}


