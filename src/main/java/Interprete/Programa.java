/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interprete;

import java.util.List;

/**
 *
 * @author willi
 */
public class Programa {
    public List<Metodo> metodos;
    public List<Instruccion> principal;
    public String id;
    
    public Programa(List<Metodo> metodos, List<Instruccion> principal, String id){
        this.metodos = metodos;
        this.principal = principal;
        this.id = id;
    }

    public List<Metodo> getMetodos() {
        return metodos;
    }

    public void setMetodos(List<Metodo> metodos) {
        this.metodos = metodos;
    }

    public List<Instruccion> getPrincipal() {
        return principal;
    }

    public void setPrincipal(List<Instruccion> principal) {
        this.principal = principal;
    }

    
}
