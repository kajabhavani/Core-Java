package basics;

public class Sample {
	
	private int userid;
	private String username;
	private String email;
	
	public Sample()
	{
		System.out.println("this is default cinstructor");
	}
	public Sample(int userid,String username,String email)
	{
		this.userid=userid;
		this.username=username;
		this.email=email;
	}
	@Override
	public String toString() {
		return "userid=" + userid + " username=" + username + ", email=" + email;
	}
	

}
