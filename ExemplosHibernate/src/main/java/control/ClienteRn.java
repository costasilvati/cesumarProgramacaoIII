/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Date;
import javax.swing.JOptionPane;
import model.Cliente;
import model.ClienteDao;

/**
 *
 * @author julianacostasilva
 */
public class ClienteRn {
    
    public Cliente criaCliente(){
        Cliente cliente = new Cliente();
        cliente.setNome(JOptionPane.showInputDialog(null, "Digite o nome do cliente:"));
        cliente.setSobrenome(JOptionPane.showInputDialog(null, "Digite o sobrenome do cliente:"));
        cliente.setCpf(JOptionPane.showInputDialog(null, "Digite o CPF do cliente:"));
        cliente.setData_cadastro(new Date(System.currentTimeMillis()));
        return cliente;
    }

}
