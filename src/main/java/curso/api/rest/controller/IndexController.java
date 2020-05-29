package curso.api.rest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import curso.api.rest.model.Usuario;
import curso.api.rest.repository.UsuarioRepository;


//ACEITAR METODOS REST
@RestController
@RequestMapping(value = "/usuario")
public class IndexController {
	
	@Autowired //anotando o UsuarioRepository com Spring
	private UsuarioRepository usuarioRepository;
	
	//get -> recupera, trazer para usuario
	//Post -> gravar
	
	@PostMapping(value = "/", produces = "application/json")
	public ResponseEntity<Usuario> cadastrar(@RequestBody Usuario usuario) {
		
		Usuario usuarioSalvo = usuarioRepository.save(usuario);
		
		//retorna o objeto inteiro mais a reposta/ usuarioSalvo
		return new ResponseEntity<Usuario>(usuarioSalvo, HttpStatus.OK);
	}
	
	@PutMapping(value = "/", produces = "application/json")
	public ResponseEntity<Usuario> atualizar(@RequestBody Usuario usuario) {
		
		/*Outras rotinas antes de atualizar*/
		
		Usuario usuarioSalvo = usuarioRepository.save(usuario);
		
		//retorna o objeto inteiro mais a reposta/ usuarioSalvo
		return new ResponseEntity<Usuario>(usuarioSalvo, HttpStatus.OK);
	}
	
	//pesquisa usuario
	@GetMapping(value = "/{id}", produces = "application/json")
	public ResponseEntity<Usuario> init(@PathVariable (value = "id")Long id) {
		
		Optional<Usuario> usuario = usuarioRepository.findById(id); //implementação do JPA para Spring
		
		//retorna um usuario passando o ID
		return new ResponseEntity<Usuario>(usuario.get(), HttpStatus.OK);
	}
	
	//deletando usuario por Id
	@DeleteMapping(value = "/{id}", produces = "application/text")
	public String delete(@PathVariable("id") Long id) {
		
		usuarioRepository.deleteById(id);
		
		return "ok";
	}
	
	//deletando todas as vendas
	@DeleteMapping(value = "/{id}/venda", produces = "application/text")
	public String deleteVenda(@PathVariable("id") Long id) {
		
		usuarioRepository.deleteById(id);/*Iriá deletar todas as vendas do usuário*/
		
		return "ok";
	}
	
	@GetMapping(value = "/", produces = "application/json")
	public ResponseEntity<List<Usuario>> usuario(){
		List<Usuario> list = (List<Usuario>) usuarioRepository.findAll();
		
		//retornando a lista de usuários passando o /usuario/
		return new ResponseEntity<List<Usuario>>(list, HttpStatus.OK);
	}
	
	//@RequestBody -> converte um json em um objeto
	@PostMapping(value = "/{iduser}/idvenda/{idvenda}", produces = "application/json")
	public ResponseEntity<Usuario> cadastrarVenda(@PathVariable Long iduser, 
												  @PathVariable Long idvenda){
		//salva o usuário, processo de venda
		//Usuario usuarioSalvo = usuarioRepository.save(usuario);
		//retorna o objeto inteiro salvo com ID
		return new ResponseEntity("id user : " + iduser + " idvenda : " + idvenda, HttpStatus.OK);
	}
	
	@PutMapping(value = "/{iduser}/idvenda/{idvenda}", produces = "application/json")
	public ResponseEntity<Usuario> updateVenda(@PathVariable Long iduser, 
												  @PathVariable Long idvenda){
		
		/*Outras rotinas antes de atualizar*/
		
		//Usuario usuarioSalvo = usuarioRepository.save(usuario);
		
		//retorna o objeto inteiro mais a reposta/ usuarioSalvo
		return new ResponseEntity("Venda Atualizada!", HttpStatus.OK);
	}
	
}
