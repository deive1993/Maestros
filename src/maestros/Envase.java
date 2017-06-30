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
public class Envase {
    private Integer codigo;
    private String nombre;
    private String undidad_med;
    private Integer cantidad;

    public Envase(Integer codigo, String nombre, String undidad_med, Integer cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.undidad_med = undidad_med;
        this.cantidad = cantidad;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUndidad_med() {
        return undidad_med;
    }

    public Integer getCantidad() {
        return cantidad;
    }
    
}
