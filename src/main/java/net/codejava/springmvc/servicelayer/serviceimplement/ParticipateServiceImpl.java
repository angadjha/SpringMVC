package net.codejava.springmvc.servicelayer.serviceimplement;

import net.codejava.springmvc.DAO.ParticipateDAO;
import net.codejava.springmvc.bean.Participate;
import net.codejava.springmvc.servicelayer.servicemthod.IParticipateService;

public class ParticipateServiceImpl implements IParticipateService{
	
	ParticipateDAO participateDAO;

	@Override
	public Participate showParticipate(int p_id) {
		
		return participateDAO.showParticipate(p_id);
	}

	@Override
	public Participate insertParticipate() {
		
		return participateDAO.insertParticipate();
	}

	@Override
	public Participate deleteParticipate(int p_id) {
		
		return participateDAO.deleteParticipate(p_id);
	}

	@Override
	public Participate updateParticipate(int p_id) {
		
		return participateDAO.updateParticipate(p_id);
	}

	/*@Override
	public Participate saveParticipateData(Participate participate) {
		
		//return participateDAO.saveParticipateData(participate);
	}*/

}
