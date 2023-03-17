/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio3;
import javax.swing.JOptionPane;

/**
 *
 * @author Maria Camila Guzman Bello, Johan Alexander Herrera Morales
 */
public class Persona {
    
    //Atributos
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected double peso;
    
    //Construcyor de la clase
    public Persona() {
    }
    
    //Contructos Sobrecargado
    public Persona(String nombre, String apellido, int edad, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.peso = peso;
    }
    
    
    //Encapsulamiento de los Atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public void imprimirDatosPersona(){
        String datosPersona = "";
        datosPersona = "Nombre " + nombre + "\n"+ "Apellido: " + apellido + "\n" +"Edad: " + edad + "\n" +"Peso: " + peso;
        JOptionPane.showMessageDialog(null,datosPersona);
        definirEstadoPersona(edad);
    }
    
    //Metodo para definir el estado de persona
    public void definirEstadoPersona(int edad){
        String estado = "";
        if (edad < 18){
            estado = "Menor de edad";
        }else{
            estado = "Mayor de edad";
        }
            JOptionPane.showMessageDialog(null,"La persona" + nombre+ " " + apellido + " es " + estado);            
        }
    
        //Metodo para leer un entero
        public int leerDatoTipoEntero(String mensaje){
        int valor = 0;
        try{
        valor = Integer.parseInt(JOptionPane.showInputDialog(null,mensaje));
        return (valor);
        }
        catch (Exception errorIngreso){
            errorIngreso.printStackTrace();
            return (0);
        }
        }
        
        //Metodo para leer un Double
        public double leerDatoTipoReal(String mensaje){
            double valor = 0.0;
            valor = Double.parseDouble(JOptionPane.showInputDialog(null, mensaje));
            return valor;
        }
        
        //metodo para leer un Booleano
        public boolean leerDatoTipoBooleano(String mensaje){
            boolean valor = false;
            valor = Boolean.parseBoolean(JOptionPane.showInputDialog(null, mensaje));
            return valor;
        }
        
        //Metdo para leer un String
        public String leerDatoTipoCadena(String mensaje){
            String valor = "";
            valor = JOptionPane.showInputDialog(null, mensaje);
            return valor;
        }
    
        
    
}