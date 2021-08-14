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
public abstract class Instruccion{
    
    public abstract void agregar(String id, String tipo, boolean esMetodo, List<Instruccion> heredadas, List<String> ids, Object valor);
    
    public abstract String getTipo();
    
    public abstract List<Instruccion> getHeredadas();
    
    public abstract String getId();
}
