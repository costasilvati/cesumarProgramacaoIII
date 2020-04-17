/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author julianacostasilva
 */
@Entity
public class Evento implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="cod_evento")
    private Integer codigo;
    private String nome;
    private int edicao;
    Date inicio;
    private Date fim;
    @ManyToOne
    @JoinColumn(name="cod_cliente")
    private Cliente cliente;
    
    @ManyToMany
    @JoinTable(name="inscricao", 
        joinColumns = {@JoinColumn(name="cod_evento",referencedColumnName="cod_evento")},
        inverseJoinColumns = {@JoinColumn(name="cod_participante")})
    private Set<Participante> participante = new HashSet<Participante>();
    
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Integer getCodigoEvento() {
        return codigo;
    }

    public void setCodigoEvento(Integer codigoEvento) {
        this.codigo = codigoEvento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFim() {
        return fim;
    }

    public void setFim(Date fim) {
        this.fim = fim;
    }

    public Set<Participante> getParticipante() {
        return participante;
    }

    public void setParticipante(Set<Participante> participante) {
        this.participante = participante;
    }
    
    

    @Override
    public String toString() {
        return "Evento{" + "codigoEvento=" + codigo + ", nome=" + nome + ", edicao=" + edicao + ", inicio=" + inicio + ", fim=" + fim + '}';
    }
    
    
}
