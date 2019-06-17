package com.kb.model;

public class User {
	private String ID; // se encuentra como UniqueIDa en MySQL
	private String Transcripcion;//se encuentra como Transcription en MySQL
	private String causa; //se encuentra como cause en MySQL
	private String fecha; //se encuentra como Fecha en MySQL
//	private String Ani; //se encuentra como Ani en MySQL
	
		
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getTranscripcion() {
		return Transcripcion;
	}
	public void setTranscripcion(String transcripcion) {
		Transcripcion = transcripcion;
	}
	public String getCausa() {
		return causa;
	}
	public void setCausa(String causa) {
		this.causa = causa;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
/*
	public String getAni() {
		return Ani;
	}
	public void setAni(String ani) {
		Ani = ani;
	}
*/	
}
