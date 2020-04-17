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
public class EventoDao {
    private Session sessao;
    
    public EventoDao(Session sessao){
        this.sessao = sessao;
    }
    
    public void salvar(Evento evento){
        sessao.save(evento);
    }
    
    public void atualizar(Evento evento){
        sessao.update(evento);
    }
    
    public void excluir (Evento evento){
        sessao.delete(evento);
    }
    
    public List<Evento> listar(){
        Query consulta = sessao.createQuery("from Evento");
        return consulta.list();
    }
    
    public Evento buscar(int valor){
        Query consulta = sessao.createQuery("from Evento where cod_evento = :parametro");
        consulta.setInteger("parametro", valor);
        return (Evento) consulta.uniqueResult();
    }
    
}

