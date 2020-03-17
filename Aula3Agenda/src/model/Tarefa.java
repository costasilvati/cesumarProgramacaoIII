/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author julianacostasilva
 */
@Entity
public class Tarefa {
    @Id
    @GeneratedValue
    private Long id;
    private String descricao;
    @Temporal(TemporalType.DATE)
    private Calendar dataFinalizado;
    private boolean finalizado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Calendar getDataFinalizado() {
        return dataFinalizado;
    }

    public void setDataFinalizado(Calendar data) {
        this.dataFinalizado = data;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }
    
    public String toString() {
        return "------ " + "Id: " + id + " ----------\n descricao: " + 
                descricao + "\n finalizado: " + 
                finalizado + "\n dataFinalizacao: " + 
                dataFinalizado.get(Calendar.DAY_OF_MONTH)+
                "/" +dataFinalizado.get(Calendar.MONTH) +
                "/"+dataFinalizado.get(Calendar.YEAR);
    }

    
}
