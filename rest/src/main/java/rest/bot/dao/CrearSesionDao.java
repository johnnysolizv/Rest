package rest.bot.dao;

import org.springframework.stereotype.Repository;
import rest.bot.model.*;

import org.json.JSONException;
import org.json.JSONObject;

import bot.FunctionsBot;

@Repository
public class CrearSesionDao {

	private String ConnID;
	public String getConnID() {
		return ConnID;
	}
	public void setConnID(String connID) {
		ConnID = connID;
	}
	public String getANI() {
		return ANI;
	}
	public void setANI(String aNI) {
		ANI = aNI;
	}
	public String getIdLlamada() {
		return idLlamada;
	}
	public void setIdLlamada(String idLlamada) {
		this.idLlamada = idLlamada;
	}
	public String getRut_Cliente() {
		return Rut_Cliente;
	}
	public void setRut_Cliente(String rut_Cliente) {
		Rut_Cliente = rut_Cliente;
	}
	public String getMonto_Deuda() {
		return Monto_Deuda;
	}
	public void setMonto_Deuda(String monto_Deuda) {
		Monto_Deuda = monto_Deuda;
	}
	public String getFecha_Vencimiento() {
		return Fecha_Vencimiento;
	}
	public void setFecha_Vencimiento(String fecha_Vencimiento) {
		Fecha_Vencimiento = fecha_Vencimiento;
	}
	public String getNombre_Cliente() {
		return Nombre_Cliente;
	}
	public void setNombre_Cliente(String nombre_Cliente) {
		Nombre_Cliente = nombre_Cliente;
	}
	public String getApellido_Cliente() {
		return Apellido_Cliente;
	}
	public void setApellido_Cliente(String apellido_Cliente) {
		Apellido_Cliente = apellido_Cliente;
	}
	private String ANI;
	private String idLlamada;
	private String Rut_Cliente;
	private String Monto_Deuda;
	private String Fecha_Vencimiento;
	private String Nombre_Cliente;
	private String Apellido_Cliente;
	
	
	public CrearSesionModel CrearSesion (CrearSesionModel llega){
		
			CrearSesionModel resultado = new CrearSesionModel();
			JSONObject input = new JSONObject();
			JSONObject result = new JSONObject();
			
			FunctionsBot fGVP = new FunctionsBot("src/main/resources/FunctionsGVP.IVR_Bot_Falabella.properties");
			
			try {
				
				//Obtener datos de entrada		
						ConnID = llega.getConnID();
						ANI = llega.getANI();
						idLlamada = llega.getIdLlamada();
						Rut_Cliente =  llega.getRut_Cliente();
						Monto_Deuda = llega.getMonto_Deuda();
						Fecha_Vencimiento = llega.getFecha_Vencimiento();
						Nombre_Cliente = llega.getNombre_Cliente();
						Apellido_Cliente = llega.getApellido_Cliente();
						
				// Añadir datos a objeto input					
						input.put("ConnID", ConnID );
						input.put("ANI", ANI);
						input.put("idLlamada", idLlamada);
						input.put("Rut_Cliente", Rut_Cliente);
						input.put("Monto_Deuda", Monto_Deuda);
						input.put("Fecha_Vencimiento", Fecha_Vencimiento);
						input.put("Nombre_Cliente", Nombre_Cliente);
						input.put("Apellido_Cliente", Apellido_Cliente);
									
				//	Establecer inicio de sesion	
						JSONObject response_create_session = fGVP.createSessionBot(input);
						result.put("BotClientId", response_create_session.getString("bot_clientId"));
						result.put("BotSessionId", response_create_session.getString("bot_sessionId"));
						result.put("trx_response", "OK");

						input.put("bot_sessionId", result.getString("BotSessionId"));
						input.put("bot_clientId", result.getString("BotClientId"));

						
				//Enviar resultados a objeto "resultado" (muestreo den Json)		
						resultado.setConnID(input.getString("ConnID"));
						resultado.setANI(input.getString("ANI"));
						resultado.setIdLlamada(input.getString("idLlamada"));
						resultado.setRut_Cliente(input.getString("Rut_Cliente"));
						resultado.setMonto_Deuda(input.getString("Monto_Deuda"));
						resultado.setFecha_Vencimiento(input.getString("Fecha_Vencimiento"));
						resultado.setNombre_Cliente(input.getString("Nombre_Cliente"));
						resultado.setApellido_Cliente(input.getString("Apellido_Cliente"));
						resultado.setBot_sessionId(input.getString("bot_sessionId"));
						resultado.setBot_clientId(input.getString("bot_clientId"));
						
						
						
						
					} catch (JSONException e) {

						e.printStackTrace();
					}
		
		return resultado;
	}
	
}
