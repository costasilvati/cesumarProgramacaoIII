/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Calendar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import model.Tarefa;
import model.TarefaDao;

/**
 *
 * @author julianacostasilva
 */
public class Sistema {

    public static void main(String[] args) {
        String texto = "----------------\n"
                + "1 - Criar Tarefa\n"
                + "2 - Ver Tarefas\n"
                + "3 - Editar Tarefa\n"
                + "4 - Excluir Tarefa\n"
                + "0 - Sair";
        TarefaDao tarefaDao = new TarefaDao("Aula3AgendaPU");
        String mensagens = "";
        int op = 0;
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog(null,texto));
            switch(op){
                case 1: 
                    Tarefa t = new Tarefa();
                    t = lerTarefa(t, "");
                    tarefaDao.inserir(t);
                    break;
                case 2:
                    List<Tarefa> lista = tarefaDao.listar();
                    mensagens = "";
                    for(Tarefa tf : lista){
                       mensagens = mensagens + tf.toString() + "\n";
                    }
                    JOptionPane.showMessageDialog(null, mensagens);
                    break;
                case 3:
                    Long idEdit = Long.parseLong(
                            JOptionPane.showInputDialog(null,
                            "Digite o ID da Tarefa a ser editada"));
                    Tarefa editTarefa = tarefaDao.buscar(idEdit);
                    if (editTarefa != null){
                        mensagens = "EDITAR TAREFA\n";
                        editTarefa = lerTarefa(editTarefa, mensagens);
                        tarefaDao.editar(editTarefa);
                    }
                    break;
                case 4: 
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    
            }
            
        }while(op != 0);
    }
    
    
    
    public static Tarefa lerTarefa(Tarefa tarefa, String mensagem){
        tarefa.setDescricao(JOptionPane.showInputDialog(null, 
                mensagem + "Digite a descição da tarefa:"));
        int op = JOptionPane.showConfirmDialog(null,"Finalizada?");
        if(op == 0){
            tarefa.setFinalizado(true);
        }else if(op == 1){
            tarefa.setFinalizado(false);
        }else{
            JOptionPane.showMessageDialog(null, "Opção CANCELAR é inválida. Tarefa registrada com situação finalzada");
            tarefa.setFinalizado(true);
        }
        tarefa.setDataFinalizado(Calendar.getInstance());
        return tarefa;
    }
    
}
