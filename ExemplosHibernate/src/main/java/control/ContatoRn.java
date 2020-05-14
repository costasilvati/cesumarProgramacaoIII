/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Date;
import javax.swing.JOptionPane;
import model.Cliente;
import model.Contato;

/**
 *
 * @author julianacostasilva
 */
public class ContatoRn {
    
    public Contato criaContato(Cliente c){
        Contato contato = new Contato();
        contato.setNome(
                JOptionPane.showInputDialog(null, "Digite o nome do contato:"));
        contato.setEmail(
                JOptionPane.showInputDialog(null, "Digite o E-mail do contato:"));
        contato.setFone(
                JOptionPane.showInputDialog(null, "Digite o Telefone do contato:"));
        contato.setCliente(c);
        contato.setData_cadastro(new Date(System.currentTimeMillis()));
        contato.setObservacao(
                JOptionPane.showInputDialog(null,"Observação","Observação: "));
        return contato;
    }
}
