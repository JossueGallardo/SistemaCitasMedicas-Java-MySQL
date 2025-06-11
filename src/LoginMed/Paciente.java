/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LoginMed;

/**
 *
 * @author Jossue
 */
import java.util.Date;
import java.util.LinkedList;


public class Paciente {
    private String username;
    private String contrasena;
    private String nombreCompleto;
    private String direccion;
    private String telefono;

    // Constructor
    public Paciente(String username, String contrasena, String nombreCompleto, String direccion, String telefono) {
        this.username = username;
        this.contrasena = contrasena;
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    // Métodos getter
    public String getUsername() {
        return username;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }
}

