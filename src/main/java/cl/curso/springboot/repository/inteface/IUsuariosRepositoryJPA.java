package cl.curso.springboot.repository.inteface;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.curso.springboot.entity.UsuarioEntity;

public interface IUsuariosRepositoryJPA extends JpaRepository<UsuarioEntity, Integer> {
	public List<UsuarioEntity> findByApellido(String appellido);
	public UsuarioEntity findByEmail(String email);
}
