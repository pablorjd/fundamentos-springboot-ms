package cl.curso.springboot.service.interfaces;

import java.util.List;

import cl.curso.springboot.entity.UsuarioEntity;

public interface IUsuarioService {

		public List<UsuarioEntity> getAllUser();
		public void deleteUser(Integer id);
		public void addUser(UsuarioEntity usr);
		public List<UsuarioEntity> findByApellido(String apellido);
		public UsuarioEntity updateUser(UsuarioEntity usr);
		public UsuarioEntity findById(Integer id);
		public UsuarioEntity findByEmail(String email);
}
