package br.com.bg.siscad.service;

import java.util.List;
import java.util.Optional;
import br.com.bg.siscad.repository.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import br.com.bg.siscad.model.entities.Usuario;


@Service
public class UsuarioServico {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    private PasswordEncoder passwordEncoder;

    public UsuarioServico(@Lazy PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }



    public List<Usuario> findAll() {
        return usuarioRepositorio.findAll();
    }

    public Usuario findById(Long id) {
        Optional<Usuario> obj = usuarioRepositorio.findById(id);
        return obj.get();
    }

    public Usuario findByEmail(String email) {
        return usuarioRepositorio.findByEmail(email).orElse(null);
    }

    public Usuario insert(Usuario obj) {
        return usuarioRepositorio.save(obj);
    }

    public Usuario autenticar(String email, String senha) {
        Usuario usuario = findByEmail(email);
        if (usuario != null && passwordEncoder.matches(senha, usuario.getSenha())) {
            return usuario;
        }
        return null;
    }
}
