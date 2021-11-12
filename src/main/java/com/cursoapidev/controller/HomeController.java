package com.cursoapidev.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cursoapidev.repos.LibroRepository;
import com.cursoapidev.repos.PrestamoRepository;
import com.cursoapidev.repos.UsuarioRepository;

import com.cursoapidev.entities.*;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class HomeController {
	
	@Autowired
	LibroRepository repositoryLibro;
	@Autowired
	UsuarioRepository repositoryUsuario;
	@Autowired
	PrestamoRepository repositoryPrestamo;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);
	
	@GetMapping(value="/libros/")
	public List<Libro> getLibros(){
		
		return repositoryLibro.findAll();
	}
		
	@GetMapping(value="/libros/{id}")
	public Libro getLibro(@PathVariable("id") int id) {
		LOGGER.info("Encontrando el libro con el id: "+id);
		return repositoryLibro.findById(id).get();
	}
		
	@PostMapping(value="/libros/")
	public Libro createLibro(@RequestBody Libro libro) {
		return repositoryLibro.save(libro);
	}
	
	@PutMapping(value="/libros/")
	public Libro updateLibro(@RequestBody Libro libro) {
		return repositoryLibro.save(libro);
		
	}
	
	@DeleteMapping(value="/libros/{id}")
	public void deleteLibro(@PathVariable("id") int id) {
		repositoryLibro.deleteById(id);
	}
	
	@GetMapping(value="/usuarios/")
	public List<Usuario> getUsuarios(){
		
		return repositoryUsuario.findAll();
	}
		
	@GetMapping(value="/usuarios/{id}")
	public Usuario getUsuario(@PathVariable("id") int id) {
		LOGGER.info("Encontrando el usuario con el id: "+id);
		return repositoryUsuario.findById(id).get();
	}
		
	@PostMapping(value="/usuarios/")
	public Usuario createUsuario(@RequestBody Usuario usuario) {
		return repositoryUsuario.save(usuario);
	}
	
	@PutMapping(value="/usuarios/")
	public Usuario updateUsuario(@RequestBody Usuario usuario) {
		return repositoryUsuario.save(usuario);
		
	}
	
	@DeleteMapping(value="/usuarios/{id}")
	public void deleteUsuario(@PathVariable("id") int id) {
		repositoryUsuario.deleteById(id);
	}
	
	@GetMapping(value="/prestamos/")
	public List<Prestamo> getPrestamos(){
		
		return repositoryPrestamo.findAll();
	}
		
	@GetMapping(value="/prestamos/{id}")
	public Prestamo getPrestamo(@PathVariable("id") int id) {
		LOGGER.info("Encontrando el prestamo con el id: "+id);
		return repositoryPrestamo.findById(id).get();
	}
		
	@PostMapping(value="/prestamos/")
	public Prestamo createPrestamo(@RequestBody Prestamo prestamo) {
		return repositoryPrestamo.save(prestamo);
	}
	
	@PutMapping(value="/prestamos/")
	public Prestamo updatePrestamo(@RequestBody Prestamo prestamo) {
		return repositoryPrestamo.save(prestamo);
		
	}
	
	@DeleteMapping(value="/prestamos/{id}")
	public void deletePrestamo(@PathVariable("id") int id) {
		repositoryPrestamo.deleteById(id);
	}

}
