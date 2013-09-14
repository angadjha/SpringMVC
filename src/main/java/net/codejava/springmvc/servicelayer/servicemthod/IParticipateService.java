package net.codejava.springmvc.servicelayer.servicemthod;

import net.codejava.springmvc.bean.Participate;

public interface IParticipateService {

	public Participate showParticipate(int p_id);
	
	public Participate insertParticipate();
	
	public Participate deleteParticipate(int p_id);
	
	public Participate updateParticipate(int p_id);
	
	//public Participate saveParticipateData(Participate participate);
}
