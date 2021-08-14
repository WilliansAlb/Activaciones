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
public class Llamada extends Instruccion {
    String id;
    String tipo;
    List<Instruccion> heredadas;
    List<String> ids;
    boolean esMetodo;
    String valor;

    public Llamada(String id, String tipo, boolean esMetodo, List<Instruccion> heredadas, List<String> ids, Object valor) {
        this.id = id;
        this.tipo = tipo;
        this.heredadas = heredadas;
        this.ids = ids;
        this.esMetodo = esMetodo;
        this.valor = valor.toString();
    }
    @Override
    public void agregar(String id, String tipo, boolean esMetodo, List<Instruccion> heredadas, List<String> ids, Object valor) {
        this.id = id;
        this.tipo = tipo;
        this.heredadas = heredadas;
        this.ids = ids;
        this.esMetodo = esMetodo;
        this.valor = valor.toString();
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public List<Instruccion> getHeredadas() {
        return heredadas;
    }
    
    @Override
    public String getId() {
        return id;
    }
    
}
