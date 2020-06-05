package com.cesumar.eventosweb.web;

import com.cesumar.eventosweb.usuario.Usuario;
import com.cesumar.eventosweb.usuario.UsuarioRN;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import javax.inject.Named;

@Named("usuarioBean")
@RequestScoped
public class UsuarioBean {
    private Usuario usuario = new Usuario();
    private String confirmarSenha;
    
    public String novo(){
        this.usuario = new Usuario();
        this.usuario.setAtivo(true);
        return "publico/usuario";
    }
    
    public String salvar(){
        FacesContext context = FacesContext.getCurrentInstance();
        String senha = this.usuario.getSenha();
        if(!senha.equals(this.confirmarSenha)){
            FacesMessage facesMessage = 
                    new FacesMessage("A senha não foi confirmada corretamente");
            context.addMessage(null, facesMessage);
            return null;
        }
        UsuarioRN usuarioRN = new UsuarioRN();
        usuarioRN.salvar(this.usuario);
        return "usuariosucesso";
    }

    public Usuario getUsuario() {return usuario;}
    public void setUsuario(Usuario usuario) {this.usuario = usuario;}
    public String getConfirmarSenha() {return confirmarSenha;}
    public void setConfirmarSenha(String confirmarSenha) {this.confirmarSenha = confirmarSenha;}
}
