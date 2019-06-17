package rest.bot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rest.bot.dao.*;
import rest.bot.model.*;

@Service
public class CrearSesionService {
	
	@Autowired
	private CrearSesionDao crearsesionDao;
//	CrearSesionDao crearsesionDao = new CrearSesionDao();
	
	public CrearSesionModel CrearSesion (CrearSesionModel llega){
		
		CrearSesionModel CrearsesionResponse = crearsesionDao.CrearSesion(llega);
		
		return CrearsesionResponse;
		
	}
	
	

}
