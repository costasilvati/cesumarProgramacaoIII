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
public class ParticipanteDao {
    private Session sessao;
    
    public ParticipanteDao(Session sessao){
        this.sessao = sessao;
    }
    
    public void salvar(Participante participante){
        sessao.save(participante);
    }
    
    public void atualizar(Participante participante){
        sessao.update(participante);
    }
    
    public void excluir (Participante participante){
        sessao.delete(participante);
    }
    
    public List<Participante> listar(){
        Query consulta = sessao.createQuery("from Participante");
        return consulta.list();
    }
    
    public Participante buscar(int valor){
        Query consulta = sessao.createQuery("from Participante where cod_participante = :parametro");
        consulta.setInteger("parametro", valor);
        return (Participante) consulta.uniqueResult();
    }
    
}

