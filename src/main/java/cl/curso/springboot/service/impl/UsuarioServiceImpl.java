package cl.curso.springboot.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.curso.springboot.entity.UsuarioEntity;
import cl.curso.springboot.repository.inteface.IUsuariosRepositoryJPA;
import cl.curso.springboot.service.interfaces.IUsuarioService;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

	@Autowired
	private IUsuariosRepositoryJPA iUsuariosRepositoryJPA;
	
	public List<UsuarioEntity> getAllUser() {
		// TODO Auto-generated method stub
		return this.iUsuariosRepositoryJPA.findAll();
	}

	@Override
	public void deleteUser(Integer id) {
		this.iUsuariosRepositoryJPA.deleteById(id);
	}

	@Override
	public void addUser(UsuarioEntity usr) {
		this.iUsuariosRepositoryJPA.save(usr);
	}

	@Override
	public List<UsuarioEntity> findByApellido(String apellido) {
		// TODO Auto-generated method stub
		return this.iUsuariosRepositoryJPA.findByApellido(apellido);
	}

	@Override
	public UsuarioEntity updateUser(UsuarioEntity usr) {
		// TODO Auto-generated method stub
		return this.iUsuariosRepositoryJPA.save(usr);
	}

	@Override
	public UsuarioEntity findById(Integer id) {
		// TODO Auto-generated method stub
		return null;//this.iUsuariosRepositoryJPA.findById(id);
	}

	@Override
	public UsuarioEntity findByEmail(String email) {
		// TODO Auto-generated method stub
		return this.iUsuariosRepositoryJPA.findByEmail(email);
	}
	

}
