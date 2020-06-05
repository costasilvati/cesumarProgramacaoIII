package com.cesumar.eventosweb.web;

import com.cesumar.eventosweb.usuario.Usuario;
import com.cesumar.eventosweb.usuario.UsuarioRN;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import javax.inject.Named;

@Named("usuarioBean")
@RequestScoped
public class UsuarioBean {
    private Usuario usuario = new Usuario();
    private String confirmarSenha;
    private List<Usuario> lista;// 04/06/2020
    private String destinoSalvar;// 04/06/2020
    
    // 04/06/2020
    public List<Usuario> getLista(){
        if(this.lista == null){
            UsuarioRN usuarioRN = new UsuarioRN();
            this.lista = usuarioRN.listar();
        }
        return this.lista;
    }
    //04/06/2020
    public String ativar(){
        if(this.usuario.isAtivo()){
            this.usuario.setAtivo(false);
        }else{
            this.usuario.setAtivo(true);
        }
        UsuarioRN usuarioRN = new UsuarioRN();
        usuarioRN.salvar(this.usuario);
        return null;// não sai da página atual
    }
    

    public String novo(){
        this.destinoSalvar = "usuariosucesso";
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
    public void setLista(List<Usuario> lista) {this.lista = lista;}
    public String getDestinoSalvar() {return destinoSalvar;}
    public void setDestinoSalvar(String destinoSalvar) {this.destinoSalvar = destinoSalvar;}
}
