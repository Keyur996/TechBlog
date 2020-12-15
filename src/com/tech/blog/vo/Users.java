package com.tech.blog.vo;

public class Users {
	private String user_id;
	private String user_name;
	private String user_pass;
	private String user_email;
	private String user_gender;
	private String user_about;
	private String created;
	
	public Users() {
		super();
	}

	public Users(String user_id, String user_name, String user_pass, String user_email, String user_gender,
			String user_about, String created) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_pass = user_pass;
		this.user_email = user_email;
		this.user_gender = user_gender;
		this.user_about = user_about;
		this.created = created;
	}

	public Users(String user_name, String user_pass, String user_email, String user_gender, String user_about) {
		super();
		this.user_name = user_name;
		this.user_pass = user_pass;
		this.user_email = user_email;
		this.user_gender = user_gender;
		this.user_about = user_about;
	}

	@Override
	public String toString() {
		return "Users [user_id=" + user_id + ", user_name=" + user_name + ", user_pass=" + user_pass + ", user_email="
				+ user_email + ", user_gender=" + user_gender + ", user_about=" + user_about + ", created=" + created
				+ "]";
	}

	public String getUser_id() {
		return user_id;
	}
	
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	
	public String getUser_name() {
		return user_name;
	}
	
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	
	public String getUser_pass() {
		return user_pass;
	}
	
	public void setUser_pass(String user_pass) {
		this.user_pass = user_pass;
	}
	
	public String getUser_email() {
		return user_email;
	}
	
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	
	public String getUser_gender() {
		return user_gender;
	}
	
	public void setUser_gender(String user_gender) {
		this.user_gender = user_gender;
	}
	
	public String getUser_about() {
		return user_about;
	}
	
	public void setUser_about(String user_about) {
		this.user_about = user_about;
	}
	
	public String getCreated() {
		return created;
	}
	
	public void setCreated(String created) {
		this.created = created;
	}	
}
