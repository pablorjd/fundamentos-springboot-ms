package cl.curso.springboot.api;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.curso.springboot.entity.UsuarioEntity;
import cl.curso.springboot.service.interfaces.IUsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private IUsuarioService iUsuarioService;
	
	@GetMapping(value = "/getAll")
	public List<UsuarioEntity> getAll() {
		return this.iUsuarioService.getAllUser();
	}
	
	
	@DeleteMapping(value = "/delete/{id}")
	public void deleteUser(@PathVariable("id") Integer id) {
		this.iUsuarioService.deleteUser(id);
	}
	
	@PostMapping(value = "/save")
	public void saveUser(@RequestBody() UsuarioEntity user) {
		this.iUsuarioService.addUser(user);
	}
	
	@PutMapping(value = "/update")
	public UsuarioEntity updateUser(@RequestBody() UsuarioEntity user) {
		return this.iUsuarioService.updateUser(user);
	}
	
	@PostMapping(value = "/getApellido/{apellido}")
	public List<UsuarioEntity> getByApellido(@PathVariable("apellido") String apellido) {
		return this.iUsuarioService.findByApellido(apellido);
	}
	
	@PostMapping(value = "/getEmail/{email}")
	public UsuarioEntity getByEmail(@PathVariable("email") String email) {
		return this.iUsuarioService.findByEmail(email);
	}

}
