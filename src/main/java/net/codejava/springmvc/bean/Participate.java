package net.codejava.springmvc.bean;

public class Participate extends User{

	private String p_team_name;
	private String p_heattime;
	
	public String getP_team_name() {
		return p_team_name;
	}
	public String getP_heattime() {
		return p_heattime;
	}
	public void setP_team_name(String p_team_name) {
		this.p_team_name = p_team_name;
	}
	public void setP_heattime(String p_heattime) {
		this.p_heattime = p_heattime;
	}
	
}
