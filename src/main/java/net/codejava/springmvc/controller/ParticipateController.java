package net.codejava.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.codejava.springmvc.DAO.ParticipateDAO;
import net.codejava.springmvc.bean.Participate;
import net.codejava.springmvc.servicelayer.serviceimplement.ParticipateServiceImpl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ParticipateController {

    private ParticipateServiceImpl participateService;
    private Participate participate;
    private ParticipateDAO participateDAO;

    @RequestMapping(value ="/showParticipate.do", method = RequestMethod.POST)
	public String showParticipate(@ModelAttribute("model") ModelMap model , HttpServletRequest request , HttpServletResponse response){
		
    	String username= request.getParameter("username");
    	String password = request.getParameter("password");
    	String user = "user";
    	String pass ="pass";
    	if(username.equals(user) && password.equals(pass)){
    		return "participate";
    	}
		return "home";	
	}
	
    @RequestMapping(value="/insertParticipate.do" , method= RequestMethod.POST)
	public String insertParticipate(){
		
		return "participate";	
	}
	
    @RequestMapping(value="/deleteParticipate.do", method = RequestMethod.POST)
	public String deleteParticipate(){
		
		return "participate";
	}
	
    @RequestMapping(value="/updateParticipate.do" , method = RequestMethod.POST)
	public String updateParticipate(){
		
		return "participate";
		
     }
	
    @RequestMapping(value ="/registrationParticipate.do", method = RequestMethod.GET)
   	public String registrationParticipate(@ModelAttribute("model") ModelMap model , HttpServletRequest request , HttpServletResponse response){
   		System.out.println("registration participate is calling ");
   		return "profile/registrationParticipate";	
   	}
    
    @RequestMapping(value ="/saveParticipate.do", method = RequestMethod.POST)
   	public String saveParticipate(@ModelAttribute("model") ModelMap model , HttpServletRequest request , HttpServletResponse response){
   		/*List list = new ArrayList();
    	System.out.println("save participate is calling ");
   		String firstname = request.getParameter("firstname");
   		String lastname = request.getParameter("lastname");
   		String email = request.getParameter("email");
   		String address = request.getParameter("address");
   		String country = request.getParameter("country");
   		String postcode = request.getParameter("postcode");
   		String dob = request.getParameter("dob");
   		String gender = request.getParameter("gender");
   		String contactnumber = request.getParameter("contactnumber");
   		Long lcontactnumber = Long.parseLong(contactnumber);
   		participate.setU_first_name(firstname);
   		participate.setU_last_name(lastname);
   		participate.setU_gender(gender);
   		participate.setU_email(email);
   		participate.setU_address(address);
   		participate.setU_contact_number(lcontactnumber);
   		participate.setU_postcode(postcode);
   		participate.setU_country(country);
   		participate.setU_date_of_birth(dob);
   		list.add(participate);
   		String id = null;*/
   		/*id = participateService.saveParticipateData(participate);*/
   		
   		return "profile/successParticipate";	
   	}
    
}
