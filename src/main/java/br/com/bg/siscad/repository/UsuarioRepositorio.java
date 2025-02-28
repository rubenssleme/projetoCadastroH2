package br.com.bg.siscad.repository;

import br.com.bg.siscad.model.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepositorio  extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByEmail(String email);
}
