package services.depart;

import java.util.List;

import persistences.depart.DepartDAO;
import dto.department.DepartDTO;

public class Depart {
	
	public List<DepartDTO> getAllDeparts(){
		List<DepartDTO> allDeparts = null;
		
		allDeparts = new DepartDAO().getAllDeparts();
		
		return allDeparts;
	}
	
	public DepartDTO getDepartById(String id){
		DepartDTO depart = null;
		
		depart = new DepartDAO().getDepartById(id);
		return depart;
	}
	
	public int getDepartcount(){
		return new DepartDAO().getDepartCount();
	}

}
