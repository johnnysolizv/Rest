package com.kb.dao;

import java.sql.Statement;
import java.sql.*;
import com.kb.model.User;
import conexion.Conexion;

public class UserDAO {

	private String ID;

	public String getID() {
		return ID;
	}

	public void setID(String ID) {
		this.ID = ID;
	}

	private String Transcripcion;

	public String getTranscripcion() {
		return Transcripcion;
	}

	public void setTranscripcion(String Transcripcion) {
		this.Transcripcion = Transcripcion;
	}

	/*
	 * private String Ani;
	 * 
	 * public String getAni() { return Ani; }
	 * 
	 * public void setAni(String Ani) { this.Ani = Ani; }
	 */
	private String causa;

	public String getcausa() {
		return causa;
	}

	public void setcausa(String causa) {
		this.causa = causa;
	}

	private String fecha;

	public String getfecha() {
		return causa;
	}

	public void setfecha(String fecha) {
		this.fecha = fecha;
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public User getUserForID(String ID) {
		User user = new User();
		Conexion cn = new Conexion();
		Statement stm = null;
		ResultSet fila = null;
		try {
			stm = cn.getConexion().createStatement();
			fila = stm.executeQuery("Select * from Transcription_UNIMRCP where UniqueID= '" + ID + "'");

			while (fila.next()) {
				user.setID(fila.getString("UniqueID"));
				user.setTranscripcion(fila.getString("Transcription"));
				// setAni(fila.getString("Ani"));
				user.setCausa(fila.getString("cause"));
				user.setFecha(fila.getString("Fecha"));
			}
			stm.close();
			
			
			} catch (Exception e) {
			}
		
		

		return user;
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public String createUser(User user) {

		ID = user.getID();
		Transcripcion = user.getTranscripcion();
		causa = user.getCausa();
		fecha = user.getFecha();
		// Ani = user.getAni();

		Statement stm = null;
		Conexion cn = new Conexion();

		try {

			String sql = "INSERT INTO Transcription_UNIMRCP " + "(UniqueID, Transcription, cause, Fecha) " + "VALUES ('"
					+ ID + "','" + Transcripcion + "','" + causa + "','" + fecha + "');";
			stm = cn.getConexion().createStatement();
			stm.executeUpdate(sql);
			stm.close();

		} catch (Exception e) {

		}

		return "OK";
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}