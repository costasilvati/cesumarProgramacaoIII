/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author julianacostasilva
 */
@Entity
public class Participante implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Column(name="cod_participante")
    private Integer codigo;
    @Column(length=50, nullable=false)
    private String nome;
    private String sobrenome;
    @Column(length=11, nullable=false, unique=true)
    private String cpf;
    @Column(nullable=false, unique=true)
    private String email;
    @Column(length=11, nullable=false)
    private String whatsapp;
    private String empresa;
    private String matricula;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Participante{" + "codigo=" + codigo + ", nome=" + nome + ", sobrenome=" + sobrenome + ", cpf=" + cpf + ", emal=" + email + ", whatsapp=" + whatsapp + ", empresa=" + empresa + ", matricula=" + matricula + '}';
    }
    
    
}
