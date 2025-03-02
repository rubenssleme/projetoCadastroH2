package br.com.bg.siscad.utils;

import br.com.bg.siscad.service.UsuarioServico;
import br.com.bg.siscad.view.TelaLogin_v2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class Provider {

    private static ApplicationContext context;


    private final UsuarioServico usuarioServico;

    public Provider(UsuarioServico usuarioServico) {
        this.usuarioServico = usuarioServico;
    }

    public static void initContext(ApplicationContext context) {
        Provider.context = context;
    }

    @org.jetbrains.annotations.NotNull
    public static <T> T getBean(Class<T> classeBean) {
        return context.getBean(classeBean);
    }

    @Bean
    public TelaLogin_v2 frame() {
        return new TelaLogin_v2(usuarioServico);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}