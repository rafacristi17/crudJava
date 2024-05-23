package br.com.projetoweb.crud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.projetoweb.crud.entidades.User;
import br.com.projetoweb.crud.repositories.UserRepository;

public class UserService {
	@Autowired
	private UserRepository repository;
	
	public List<User>findAll(){
		return repository.findAll();
	}
}
