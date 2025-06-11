/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LoginMed;

/**
 *
 * @author Jossue
 */
public class Usuario {
    private String contrasena;
    private String nombre;
    private String direccion;
    private String telefono;

    public Usuario(String contrasena, String nombre, String direccion, String telefono) {
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }
}