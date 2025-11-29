package entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Details {
	
	@Id
	private String username;
	private String useremail;
	private String userpass;
	private long userphone;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public String getUserpass() {
		return userpass;
	}
	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}
	public long getUserphone() {
		return userphone;
	}
	public void setUserphone(long userphone) {
		this.userphone = userphone;
	}
	
	

}
