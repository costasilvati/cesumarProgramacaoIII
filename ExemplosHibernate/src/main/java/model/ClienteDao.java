/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import org.hibernate.Criteria;

import org.hibernate.Session;
import org.hibernate.Query;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author julianacostasilva
 */
public class ClienteDao {
    private Session sessao;
    
    public ClienteDao(Session sessao){
        this.sessao = sessao;
    }
    
    public void salvar(Cliente cliente){
        sessao.save(cliente);
    }
    
    public void atualizar(Cliente cliente){
        sessao.update(cliente);
    }
    
    public void excluir (Cliente cliente){
        sessao.delete(cliente);
    }
    
    public List<Cliente> listar(){
        Query consulta = sessao.createQuery("from Cliente");
        
        return consulta.list();
    }
    
    public Cliente buscar(int valor){
        Query consulta = sessao.createQuery("from Cliente where cod_cliente = :parametro");
        consulta.setInteger("parametro", valor);
        return (Cliente) consulta.uniqueResult();
    }
    
    public List<Cliente> buscarFiltro(){
        Criteria crit = sessao.createCriteria(Cliente.class); // SELECT * FROM cliente
        Criterion filtro = Restrictions.lt("codigo", 2); 
        crit.add(filtro);//+ WHERE codigo < 2;
        //crit.add(Restrictions.lt("codigo", 2)); // idem as linhas 52 e 53
        return (List<Cliente>) crit.list();
    }
    
    public List<Cliente> testeNamed(){
        return sessao.getNamedQuery("findAll").list();
    }
    
}

