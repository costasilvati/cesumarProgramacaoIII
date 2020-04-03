
import connection.HibernateUtil;
import control.ClienteRn;
import control.ContatoRn;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Cliente;
import model.ClienteDao;
import model.Contato;
import model.ContatoDao;
import org.hibernate.Session;
import org.hibernate.Transaction;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author julianacostasilva
 */
public class HibernateConnect {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transacao = session.beginTransaction();
        System.out.println("Conectou!");
        // Cadastra Cliente
        ClienteDao clienteDao = new ClienteDao(session);
        Cliente cliente = new Cliente();
        cliente.setNome("Juliana");
        cliente.setSobrenome("Costa");
        cliente.setCpf("000000000");
        cliente.setData_cadastro(new Date(System.currentTimeMillis()));
        clienteDao.salvar(cliente);
        //Cadastra Contato
        ContatoDao contatoDao = new ContatoDao(session);
        Contato contato = new Contato();
        contato.setCliente(cliente);
        contato.setNome("comercial");
        contato.setData_cadastro(new Date(System.currentTimeMillis()));
        contato.setEmail("email@email.com");
        contato.setFone("232323232");  
        contatoDao.salvar(contato);
        
        transacao.commit();
        System.out.println("Total de registros " + clienteDao.listar().size());
        session.close();
        System.exit(0);
    }

}
