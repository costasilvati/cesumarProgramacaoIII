/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Query;

/**
 *
 * @author julianacostasilva
 */
public class ContatoDao {
    private Session sessao;
    
    public ContatoDao(Session sessao){
        this.sessao = sessao;
    }
    
    public void salvar(Contato contato){
        sessao.save(contato);
    }
    
    public void atualizar(Contato contato){
        sessao.update(contato);
    }
    
    public void excluir (Contato contato){
        sessao.delete(contato);
    }
    
    public List<Contato> listar(){
        Query consulta = sessao.createQuery("from Contato");
        return consulta.list();
    }
    
    public Contato buscar(int valor){
        Query consulta = sessao.createQuery("from Contato where codigo = :parametro");
        consulta.setInteger("parametro", valor);
        return (Contato) consulta.uniqueResult();
    }
    
}
