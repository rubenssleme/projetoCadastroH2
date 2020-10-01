package br.com.bg.siscad.cadastramento.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bg.siscad.cadastramento.api.Usuario;
import java.util.Optional;
import org.springframework.stereotype.Repository;
@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findByEmail(String email);

}
