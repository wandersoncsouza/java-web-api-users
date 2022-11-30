package dio.myfirstwebapi.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

import dio.myfirstwebapi.handler.BusinessException;
import dio.myfirstwebapi.model.Usuario;

@Repository
public class UsuarioRepository {
    
    public void save(Usuario usuario){

        if(usuario.getLogin() == null){
            throw new BusinessException("O Campo login é obrigatório");
        }

        if(usuario.getId() == null){
            System.out.println("Save - Recebendo usuário na camada de repositorio");
        }
        else{
            System.out.println("Update - Recebendo usuário na camada de repositorio");
        }
    }

    public void deleteById(Integer id){
        System.out.println(String.format("Delete/Id - Recebendo o id: %d para excluir", id));
        System.out.println(id);
    }

    public List<Usuario> findAll(){
        System.out.println("List - Listando os usuários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("gleyson", "password"));
        usuarios.add(new Usuario("frank", "masterpass"));
        usuarios.add(new Usuario("marcolino", "marc_password"));
        usuarios.add(new Usuario("aline", "siedro3243"));
        usuarios.add(new Usuario("Maria", "mari@123"));
        usuarios.add(new Usuario("sharktanq", "postulusSiedro"));
        return usuarios;
    }

    public Usuario findById(Integer id){
        System.out.println(String.format("FIND/Id - Recebendo o id: %d para ", id));
        return new Usuario("gleyson", "password");
    }

    public Usuario findByUsername(String username){
        System.out.println(String.format("Find/Username - Recebendo o username", username));
        return new Usuario("gleyson", "password");
    }
}
