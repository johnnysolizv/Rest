package rest.bot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import rest.bot.model.*;
import rest.bot.service.*;


@Controller
@RequestMapping("/crearsesion")
public class RestController {
	
	
	
	@Autowired
	private CrearSesionService crearsesionService;
		
	@ResponseBody @RequestMapping(method = RequestMethod.POST)
	public CrearSesionModel CrearSesion (@RequestBody CrearSesionModel llega ){
		
		
		CrearSesionModel result = new CrearSesionModel();
		result = crearsesionService.CrearSesion(llega);
		
		return result;
		
	}
	

}
