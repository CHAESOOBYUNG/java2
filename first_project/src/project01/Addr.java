package project01;

public class Addr {
	private String name;
	private String phoneNo;
	private String email;
	private String address;
	private String group;

	public Addr(String name, String phoneNo, String email, String address, String group) {
		this.name = name;
		this.phoneNo = phoneNo;
		this.email = email;
		this.address = address;
		this.group = group;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}
	
	public void printInfo() {
		System.out.println("이름: " + getName());
		System.out.println("전화번호: " + getPhoneNo());
		System.out.println("이메일: " + getEmail());
		System.out.println("주소: " + getAddress());
		System.out.println("그룹: " + getGroup());
	}
}
