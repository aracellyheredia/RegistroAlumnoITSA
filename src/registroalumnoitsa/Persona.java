/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registroalumnoitsa;

/**
 *
 * @author RUDI
 */
public class Persona {
    
    String Nombre, Apellidos,Matricula;
    int Telefono;

    public Persona(String Nombre, String Apellidos, String Matricula, int Telefono) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Matricula = Matricula;
        this.Telefono = Telefono;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }
    
    
    
    
    
}
