/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author JOSEPH TALENTOS
 */
public class Usuario extends persona {
    //atributos
    private String email;
     private String password;
      private String rol;
      
//constructores

    public Usuario(String email, String password, String rol, String nombre, String apellido, String edad, String sexo, String identidad) {
        super(nombre, apellido, edad, sexo, identidad);
        this.email = email;
        this.password = password;
        this.rol = rol;
    }
   
//getter and setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
      
      

  
    
    
    
}
