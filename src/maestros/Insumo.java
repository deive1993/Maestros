/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maestros;

/**
 *
 * @author alumno
 */
public class Insumo {
    private Integer codigo;
    private String undidad_med;
    private String nombre;
    private Integer precio;
    private Envase envase;
    private Rubro_insumos rubro_insumo;

    public Integer getCodigo() {
        return codigo;
    }

    public String getUndidad_med() {
        return undidad_med;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public Envase getEnvase() {
        return envase;
    }

    public Rubro_insumos getRubro_insumo() {
        return rubro_insumo;
    }
    
}
