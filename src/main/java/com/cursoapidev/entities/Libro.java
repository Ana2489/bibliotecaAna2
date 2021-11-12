package com.cursoapidev.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Libro {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="titulo")
	private String titulo;
	@Column(name="autor")
	private String autor;
	@Column(name="tema")
	private String tema;
	
	public Libro() {

	}
	
	public Libro(int id, String titulo, String autor, String tema) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.tema = tema;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", tema=" + tema + "]";
	}
	
	

}
