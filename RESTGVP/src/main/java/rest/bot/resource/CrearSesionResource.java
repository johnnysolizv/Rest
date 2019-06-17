package rest.bot.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import rest.bot.model.*;
import rest.bot.service.*;



@Path("/crearsesion")
public class CrearSesionResource {
	
	CrearSesionService crearsesionService = new CrearSesionService();
		
	@POST
	@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
	@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")

	public CrearSesionModel CrearSesion(CrearSesionModel llega){
		
		
		CrearSesionModel result = new CrearSesionModel();
		result = crearsesionService.CrearSesion(llega);
		
		return result;
	}

}
