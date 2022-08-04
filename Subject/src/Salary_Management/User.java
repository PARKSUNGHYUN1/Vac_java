package Salary_Management;

class User {
	private String name;
	private String phone;
	private String account;
	
	public User() {};
	public User(String name, String phone, String account) {
		this.name = name;
		this.phone = phone;
		this.account = account;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone() {
		return phone;
	}	
	public void setAccount(String account) {
		this.account = account;
	}
	public String getAccount() {
		return account;
	}
}

class Password {
	private int password;
	
	public Password( ) {};
	public Password(int password) {
		this.password = password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public int getPassword() {
		return password;
	}
}