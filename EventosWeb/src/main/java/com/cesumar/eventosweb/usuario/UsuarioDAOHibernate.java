/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cesumar.eventosweb.usuario;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author julianacostasilva
 */
public class UsuarioDAOHibernate implements UsuarioDAO{
    private Session session;
    
    public void setSession(Session session){
        this.session = session;
    }
    
    @Override
    public void salvar(Usuario usuario) {
        this.session.save(usuario);
    }

    @Override
    public void atualizar(Usuario usuario) {
        this.session.update(usuario);
    }

    @Override
    public void excluir(Usuario usuario) {
        this.session.delete(usuario);
    }

    @Override
    public Usuario carregar(Integer codigo) {
        return (Usuario) this.session.get(Usuario.class, codigo);
    }

    @Override
    public Usuario buscaPorLogin(String login) {
        String hql ="select u from Usuario u where u.login = :login";
        Query consulta = this.session.createQuery(hql);
        consulta.setString("login", login);
        return (Usuario) consulta.uniqueResult();
    }

    @Override
    public List<Usuario> listar() {
        return this.session.createCriteria(Usuario.class).list();
    }
    
}
