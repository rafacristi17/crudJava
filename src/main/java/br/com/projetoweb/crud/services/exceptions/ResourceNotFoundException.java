package br.com.projetoweb.crud.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{

	private static final long serialVersionUID=1L;

	public ResourceNotFoundException(Object id){
			super("Não localizamos o usuário com a id" + id);
	}
	
}
