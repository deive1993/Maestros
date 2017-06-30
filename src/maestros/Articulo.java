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
public class Articulo {
    private Integer codigo;
    private String nombre;
    private String descripcion;
    private Subrubro subrubro;
    private Rubro rubro;

    
    
    
    
    public Articulo(Integer codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    
    public Articulo(Integer codigo, String nombre, String descripcion, Subrubro subrubro, Rubro rubro) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.subrubro = subrubro;
        this.rubro = rubro;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Subrubro getSubrubro() {
        return subrubro;
    }

    public Rubro getRubro() {
        return rubro;
    }
    
    
}
