package br.com.projetoweb.crud.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetoweb.crud.entidades.User;

@RestController
@RequestMapping(value = "/users")

public class UsuarioResource {
	
	@GetMapping
	public ResponseEntity<User> FindAll(){
		
		User usuario = new User(1L, "Ana", "ana@exemplo.com", "99999999", "123");
		return ResponseEntity.ok().body(usuario);
		
		
	}
}
