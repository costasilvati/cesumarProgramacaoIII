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
public class RNException extends Exception{
    public RNException(){}
    
    public RNException(String message){super(message);}
    
    public RNException(String message, Throwable cause){
        super(message, cause);
    }
    
    public RNException(String message, 
            Throwable cause,
            boolean enableSupression,
            boolean writableStackTrace){
        super(message, cause, enableSupression, writableStackTrace);
    }
}
