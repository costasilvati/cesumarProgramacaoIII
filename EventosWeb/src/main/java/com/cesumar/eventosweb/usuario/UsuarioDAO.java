package com.cesumar.eventosweb.usuario;

import java.util.List;

/**
 *
 * @author julianacostasilva
 */
public interface UsuarioDAO {
    
    public void salvar(Usuario usuario);
    public void atualizar(Usuario usuario);
    public void excluir(Usuario usuario);
    public Usuario carregar(Integer codigo);
    public Usuario buscaPorLogin(String login);
    public List<Usuario> listar();
    
}
