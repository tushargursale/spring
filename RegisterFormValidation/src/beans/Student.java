package beans;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;



public class Student {
	
	
	@NotEmpty(message="Hello I am FirstName")
	private String fname;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	@NotEmpty
	private String email;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@NotEmpty
	private String country;
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@NotEmpty
	private String gender;
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@NotEmpty
	@Size(min=4,max=6,message="User PAssword MIN=4 and Max-6")
	private String password;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	//@DateTimeFormat(pattern="MM/dd/yyyy")
	@NotEmpty
	
	private String bdate;
	public String getBdate() {
		return bdate;
	}
	public void setBdate(String bdate) {
		this.bdate = bdate;
	}
	
	
	
	
	

}
