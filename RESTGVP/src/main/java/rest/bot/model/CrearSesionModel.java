package rest.bot.model;

public class CrearSesionModel {

	private String ConnID;
	private String ANI;
	private String idLlamada;
	private String Rut_Cliente;
	private String Monto_Deuda;
	private String Fecha_Vencimiento;
	private String Nombre_Cliente;
	private String Apellido_Cliente;
	private String bot_sessionId;
	private String bot_clientId;
	
	
	public String getBot_sessionId() {
		return bot_sessionId;
	}
	public void setBot_sessionId(String bot_sessionId) {
		this.bot_sessionId = bot_sessionId;
	}
	public String getBot_clientId() {
		return bot_clientId;
	}
	public void setBot_clientId(String bot_clientId) {
		this.bot_clientId = bot_clientId;
	}
	
	
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
	
	
}
