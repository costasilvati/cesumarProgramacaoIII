package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Date;
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
public class Contato {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer codigo;
    @Column(length=50, nullable=true)
    private String nome;
    @Column(length=50, nullable=true)
    private String fone;
    @Column(length=50, nullable=true)
    private String email;
    @Column(nullable=true)
    private Date data_cadastro;
    @Column(nullable=true)
    private String observacao;
    
    
}
