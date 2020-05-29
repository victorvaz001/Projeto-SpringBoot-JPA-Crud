package curso.api.rest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import curso.api.rest.model.Usuario;

@Repository //trabalhar com o banco de dados
public interface UsuarioRepository extends CrudRepository<Usuario, Long>{

}
