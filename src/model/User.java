package model;
//Type your code here
public class User{
	String name;
	String email;
	String dob;
	String gender;
	
	public void setname(String s) {
		this.name=s;
	}
	
	public String getname() {
		return this.name;
	}
	
	public void setemail(String s) {
		this.email=s;
	}
	
	public String getemail() {
		return this.email;
	}
	
	public void setdob(String s) {
		this.dob=s;
	}
	
	public String getdob() {
		return this.dob;
	}
	
	public void setgender(String s) {
		this.gender=s;
	}
	
	public String getgender() {
		return this.gender;
	}
	
	public User(String n,String g,String d) {
		// TODO Auto-generated constructor stub
		this.name=n;this.gender=g;this.dob=d;
	}
	
}