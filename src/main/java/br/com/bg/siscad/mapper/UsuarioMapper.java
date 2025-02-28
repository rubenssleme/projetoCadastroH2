package br.com.bg.siscad.mapper;

import br.com.bg.siscad.model.dto.UsuarioDTO;
import br.com.bg.siscad.model.entities.Usuario;
import br.com.bg.siscad.model.response.UsuarioResponse;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {
    UsuarioResponse map(UsuarioDTO value);
    Usuario usuarioDtoToUsuario(UsuarioDTO usuarioDTO);
    List<UsuarioResponse> usuarioDtoToList(List<UsuarioDTO> usuario);
}
