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
public class Metodo {
    public String id;
    public boolean haveReturn;
    public List<String> parametros;
    public String tipoRetorno;
    public String valor;
    public List<Instruccion> instrucciones;

    public Metodo(String id, boolean haveReturn, List<String> parametros, List<Instruccion> instrucciones, String tipoRetorno, String valor) {
        this.id = id;
        this.haveReturn = haveReturn;
        this.parametros = parametros;
        this.tipoRetorno = tipoRetorno;
        this.valor = valor;
        this.instrucciones = instrucciones;
    }
    
}
