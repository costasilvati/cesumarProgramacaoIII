/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cesumar.eventosweb.util;

/**
 *
 * @author julianacostasilva
 */
public class DAOException extends Exception{
    public DAOException(){}
    
    public DAOException(String message){super(message);}
    
    public DAOException(String message, Throwable cause){
        super(message, cause);
    }
    
    public DAOException(String message, 
            Throwable cause,
            boolean enableSupression,
            boolean writableStackTrace){
        super(message, cause, enableSupression, writableStackTrace);
    }
}
