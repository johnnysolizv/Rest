package rest.bot.service;



import rest.bot.dao.*;
import rest.bot.model.*;


public class CrearSesionService {
	CrearSesionDao crearsesionDao = new CrearSesionDao();
	
	public CrearSesionModel CrearSesion (CrearSesionModel llega){
		
	CrearSesionModel CrearSesionResponse = crearsesionDao.CrearSesion(llega);
				
		return CrearSesionResponse;
	}
	
	

}
