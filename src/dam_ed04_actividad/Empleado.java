/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam_ed04_actividad;

/**
 *
 * @author Albbe
 */

//inserto comentarios para el siguiente commit
public class Empleado {
    private String nombre;
    private String apellidos;
    private String Dni;
    
    //variables privadas de tipo string llamadas nombre,apellidos,dni

    public String getNombre() {
        return nombre;
        //getNombre
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        //setNombre
    }

    public String getApellidos() {
        return apellidos;
        //getApellidos
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
        //setApellidos
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }
    
    
}
