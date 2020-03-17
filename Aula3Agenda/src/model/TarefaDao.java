package model;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author julianacostasilva
 */
public class TarefaDao {
    EntityManagerFactory factory;
    
    public TarefaDao(String unity){
        factory = Persistence.
               createEntityManagerFactory(unity);
    }
    
    public void inserir(Tarefa t){
        EntityManager manager = factory.createEntityManager();
        manager.getTransaction().begin();
        manager.persist(t);
        manager.getTransaction().commit();
        manager.close();
    }
    
    public List<Tarefa> listar(){
        EntityManager manager = factory.createEntityManager();
        List<Tarefa> lista = manager.createQuery(
                "select t from Tarefa as t").getResultList();
        manager.close();
        return lista;
    }
    
    public Tarefa buscar(Long id){
        EntityManager manager = factory.createEntityManager();
        Tarefa encontrada = manager.find(Tarefa.class, id);
        manager.close();
        return encontrada;
    }
    
    public void editar(Tarefa editada){
        EntityManager manager = factory.createEntityManager();
        manager.getTransaction().begin();
        manager.merge(editada);
        manager.getTransaction().commit();
        manager.close();
    }
}
