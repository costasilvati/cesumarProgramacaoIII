
import connection.HibernateUtil;
import java.sql.Date;
import java.text.DateFormat;
import java.util.HashSet;
import java.util.Set;
import model.Cliente;
import model.ClienteDao;
import model.Contato;
import model.ContatoDao;
import model.Evento;
import model.EventoDao;
import model.Participante;
import model.ParticipanteDao;
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

        DateFormat dateFormat = DateFormat.getDateInstance();
        // Cadastra Cliente
        ClienteDao clienteDao = new ClienteDao(session);
//        Cliente cliente = new Cliente();
//        cliente.setNome("Juliana");
//        cliente.setSobrenome("Costa");
//        cliente.setCpf("000000000");
//        cliente.setData_cadastro(new Date(System.currentTimeMillis()));
//
//        clienteDao.salvar(cliente);
//        //Cadastra Contato
//        ContatoDao contatoDao = new ContatoDao(session);
//        Contato contato = new Contato();
//        contato.setCliente(cliente);
//        contato.setNome("comercial");
//        contato.setData_cadastro(new Date(System.currentTimeMillis()));
//        contato.setEmail("email@email.com");
//        contato.setFone("232323232");
//        contatoDao.salvar(contato);
//        
//        Set<Participante> inscritos = new HashSet<>();
//        
//        //Cadastra Participante
//        ParticipanteDao pDao = new ParticipanteDao(session);
//        Participante participante = new Participante();
//        participante.setNome("Maria");
//        participante.setSobrenome("Moraes Silva");
//        participante.setCpf("09090909090");
//        participante.setEmail("mariasouza@email.com");
//        participante.setEmpresa("Unicesumar");
//        participante.setWhatsapp("43984033333");
//        pDao.salvar(participante);
//        
//        inscritos.add(participante);
//        
//        //Cadastra Participante 2
//        Participante participante2 = new Participante();
//        participante2.setNome("Joselia");
//        participante2.setSobrenome("Sanches Silva");
//        participante2.setCpf("09090909091");
//        participante2.setEmail("joseliasilva@email.com");
//        participante2.setEmpresa("Unicesumar");
//        participante2.setWhatsapp("43984031122");
//        pDao.salvar(participante2);
//        inscritos.add(participante2);
//        
//        // Cadastra Eventos
//        EventoDao eventoDao = new EventoDao(session);
//        Evento evento = new Evento();
//        evento.setCliente(cliente);
//        evento.setNome("Semana tecnológica");
//        int dia = 10;
//        int mes = 01;
//        int ano = 2020;
//        evento.setInicio(new Date(mes, dia, ano));
//        dia = 20;
//        evento.setFim(new Date(mes, dia, ano));
//        evento.setEdicao(2);
//        evento.setParticipante(inscritos);
//        eventoDao.salvar(evento);
//        
//        // ----- 2
//        Evento evento2 = new Evento();
//        evento2.setCliente(cliente);
//        evento2.setNome("Semana tecnológica");
//        dia = 10;
//        mes = 03;
//        ano = 2021;
//        evento2.setInicio(new Date(mes, dia, ano));
//        dia = 20;
//        evento2.setFim(new Date(mes, dia, ano));
//        evento2.setEdicao(2);
//        eventoDao.salvar(evento2);
        
        transacao.commit();
        //System.out.println("Total de registros < 2: " + clienteDao.buscarFiltro().size());
        //System.out.println("Total de registros: " + clienteDao.listar().size());
        System.out.println("Total de registros: " + clienteDao.testeNamed().size());
        session.close();
        System.exit(0);
    }

}
