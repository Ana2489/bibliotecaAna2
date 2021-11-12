package com.cursoapidev.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Prestamo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="idLibro")
	private int idLibro;
	@Column(name="idUsuario")
	private int idUsuario;
	@Column(name="fechaPrestamo")
	private String fechaPrestamo;
	@Column(name="fechaEntrega")
	private String fechaEntrega;
	
	public Prestamo() {

	}
	
	public Prestamo(int id, int idLibro, int idUsuario, String fechaPrestamo, String fechaEntrega) {
		super();
		this.id = id;
		this.idLibro = idLibro;
		this.idUsuario = idUsuario;
		this.fechaPrestamo = fechaPrestamo;
		this.fechaEntrega = fechaEntrega;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdLibro() {
		return idLibro;
	}
	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getFechaPrestamo() {
		return fechaPrestamo;
	}
	public void setFechaPrestamo(String fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}
	public String getFechaEntrega() {
		return fechaEntrega;
	}
	public void setFechaEntrega(String fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	@Override
	public String toString() {
		return "Prestamo [id=" + id + ", idLibro=" + idLibro + ", idUsuario=" + idUsuario + ", fechaPrestamo="
				+ fechaPrestamo + ", fechaEntrega=" + fechaEntrega + "]";
	}
	
	

}
