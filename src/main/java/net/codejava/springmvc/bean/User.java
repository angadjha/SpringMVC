package net.codejava.springmvc.bean;

public abstract class User {

	private int u_id;
	private String u_first_name;
	private String u_last_name;
	private String u_gender;
	private String u_address;
	private long u_contact_number;
	private String u_country;
	private String u_postcode;
	private String u_date_of_birth;
	private String u_email;
	
public String getU_email() {
		return u_email;
	}

	public void setU_email(String u_email) {
		this.u_email = u_email;
	}

private static int u_current_id =1;
	
	public User(){
		u_id = u_current_id++;
	}
	
	
public String getU_first_name() {
		return u_first_name;
	}

	public String getU_last_name() {
		return u_last_name;
	}

	public String getU_gender() {
		return u_gender;
	}

	public String getU_address() {
		return u_address;
	}

	public long getU_contact_number() {
		return u_contact_number;
	}

	public String getU_country() {
		return u_country;
	}

	public String getU_postcode() {
		return u_postcode;
	}

	public String getU_date_of_birth() {
		return u_date_of_birth;
	}

	public void setU_first_name(String u_first_name) {
		this.u_first_name = u_first_name;
	}

	public void setU_last_name(String u_last_name) {
		this.u_last_name = u_last_name;
	}

	public void setU_gender(String u_gender) {
		this.u_gender = u_gender;
	}

	public void setU_address(String u_address) {
		this.u_address = u_address;
	}

	public void setU_contact_number(long u_contact_number) {
		this.u_contact_number = u_contact_number;
	}

	public void setU_country(String u_country) {
		this.u_country = u_country;
	}

	public void setU_postcode(String u_postcode) {
		this.u_postcode = u_postcode;
	}

	public void setU_date_of_birth(String u_date_of_birth) {
		this.u_date_of_birth = u_date_of_birth;
	}



}
