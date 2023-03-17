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
public class Estudiante extends Persona{
    
    //Atributos de la clase
    String carnet;
    double promedioNotas;
    int numeroMateria;
    
    //Contructor de la clase
    public Estudiante() {
    }
    
    //Constructor sobreCargado
    public Estudiante(String carnet, double promedioNotas, int numeroMateria, String nombre, String apellido, int edad, double peso) {
        super(nombre, apellido, edad, peso);
        this.carnet = carnet;
        this.promedioNotas = promedioNotas;
        this.numeroMateria = numeroMateria;
    }
    
    
    //Encapsulamiento de los atributos
    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public double getPromedioNotas() {
        return promedioNotas;
    }

    public void setPromedioNotas(double promedioNotas) {
        this.promedioNotas = promedioNotas;
    }

    public int getNumeroMateria() {
        return numeroMateria;
    }

    public void setNumeroMateria(int numeroMateria) {
        this.numeroMateria = numeroMateria;
    }
    
    //Metodos de la subClase Estudiante
    public double calcularPromedio(){
            promedioNotas = leerNotasEstudiante() / numeroMateria;
            return promedioNotas;
    }
    
    public double leerNotasEstudiante(){
        
        double nota = 0.0;
        double suma = 0.0;
        for(int i = 0; i < numeroMateria; i++){
            do{
                nota = leerDatoTipoEntero("Ingrese la nota "+(i+1)+" del estudiante" );
                if(nota < 0.0 || nota > 5.0){
                    JOptionPane.showMessageDialog(null, "Ingreso una nota incorrecta");
                } 
            }while(nota < 0.0 || nota > 5.0);
            suma = nota + suma;
        }
        return suma;
    }
    
    public Estudiante ingresarDatosEstudiante(){
        Estudiante nuevoEstudiante = new Estudiante();
        String nombre = "";
        String apellido = "";
        int edad = 0;
        double peso = 0.0;
        double promedioNotas = 0.0;
        int numeroMaterias = 0;
        String carnet = "";
        carnet = leerDatoTipoCadena("Ingrese el carnet del estudiante: ");
        nombre = leerDatoTipoCadena("Ingrese el nombre del estudiante: ");
        apellido = leerDatoTipoCadena("Ingrese el apellido del estudiante: ");
        edad = leerDatoTipoEntero("Ingrese la edad del estudiante: ");
        peso = leerDatoTipoEntero("Ingrese el peso del estudiante: ");
        numeroMaterias = leerDatoTipoEntero("Ingrese el numero de materias: ");
        
        nuevoEstudiante.setNombre(nombre);
        nuevoEstudiante.setApellido(apellido);
        nuevoEstudiante.setCarnet(carnet);
        nuevoEstudiante.setEdad(edad);
        nuevoEstudiante.setPeso(peso);
        nuevoEstudiante.setNumeroMateria(numeroMaterias);
        nuevoEstudiante.setPromedioNotas(promedioNotas);
        //Retorna los valores del Objeto
        return nuevoEstudiante;
    }
    
    public void imprimirReporteNotasEstudiante(){
        imprimirDatosPersona();
        //Imprimimos los datos propios del estudiante
        JOptionPane.showMessageDialog(null, "El carnet del estudiante es "+carnet);
        JOptionPane.showMessageDialog(null, "El numero de materias  es: "+numeroMateria);
        JOptionPane.showMessageDialog(null, "El promedio de notas del estudiantes es: "+calcularPromedio());
    }
}
