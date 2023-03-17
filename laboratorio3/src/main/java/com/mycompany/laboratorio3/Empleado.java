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
public class Empleado extends Persona{
    
    //Atributos de la subclase
    private double salario;
    private String codigoLaboral;
    private boolean esEmpleadoFijo;
    
    //Metodo Constructor
    public Empleado() {
    }
    
    //Metdo Constructor sobreCargado

    public Empleado(double salario, String codigoLaboral, boolean esEmpleadoFijo, String nombre, String apellido, int edad, double peso) {
        super(nombre, apellido, edad, peso);
        this.salario = salario;
        this.codigoLaboral = codigoLaboral;
        this.esEmpleadoFijo = esEmpleadoFijo;
    }
    
    //Encapsulamiento de los atributos

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCodigoLaboral() {
        return codigoLaboral;
    }

    public void setCodigoLaboral(String codigoLaboral) {
        this.codigoLaboral = codigoLaboral;
    }

    public boolean isEsEmpleadoFijo() {
        return esEmpleadoFijo;
    }

    public void setEsEmpleadoFijo(boolean esEmpleadoFijo) {
        this.esEmpleadoFijo = esEmpleadoFijo;
    }
    
    //Metodos de la subClase Empleado
    
    //Metodo para calcular el salario del empleado
    public double calcularSalario(boolean esEmpleadoFijo, double valorHora, int numeroHorasTrabajadas){
        double salario = 0.0;
        double bono = 0.0;
        if(esEmpleadoFijo == true){
            bono = 5200.00;
        }else{
            bono = 1200.00;
        }
        salario = numeroHorasTrabajadas*valorHora+bono;
        return salario;
    }
    
    //Metodo para imprimir el salario del empleado
    public void imprimirAsignacionSalario(String mensaje, double sueldo){
        JOptionPane.showMessageDialog(null, "El empleado "+nombre+" recibe un salario de"+sueldo);
    }
    
    //Metodo para ingresar los datos del empleado
    public Empleado ingresarDatosEmpleado(){
        Empleado nuevoEmpleado = new Empleado();
        
        String nombre = "";
        String apellido = "";
        int edad = 0;
        double peso = 0.0;
        int numeroHoras = 0;
        double valorHora = 0.0;
        double salario = 0.0;
        boolean esEmpleadoFijo = false;
        String codigo = "";
        codigo = leerDatoTipoCadena("Ingrese el codigo del empleado:");
        nombre = leerDatoTipoCadena("Ingrese el nombre del empleado:");
        apellido = leerDatoTipoCadena("Ingrese el apellido del empleado:");
        edad = leerDatoTipoEntero("Ingrese la edad del empleado:");
        peso = leerDatoTipoEntero("Ingrese el peso del empleado:");
        
        //Obtenemos los datos que no hacen parte de la clase
        numeroHoras = leerDatoTipoEntero("Ingrese el numero de horas trabajadas por el empleado: ");
        valorHora = leerDatoTipoReal("Ingrese el valor de la hora: ");
        esEmpleadoFijo = leerDatoTipoBooleano("¿El empleado es fijo (true/false)?: ");
        
        //Calculamos el salario
        salario = calcularSalario(esEmpleadoFijo, valorHora, numeroHoras);
        //Definimos los datos para el cotructor
        nuevoEmpleado.setNombre(nombre);
        nuevoEmpleado.setApellido(apellido);
        nuevoEmpleado.setCodigoLaboral(codigoLaboral);
        nuevoEmpleado.setEdad(edad);
        nuevoEmpleado.setPeso(peso);
        nuevoEmpleado.setSalario(salario);
        nuevoEmpleado.setEsEmpleadoFijo(esEmpleadoFijo);
        
        //Retorna los valores del Objeto
        return nuevoEmpleado;
    }
    
    //Metodos para imprimir el reporte de status del empleado
    public void imprimirReporteEstadoEmpleado(){
        //Se hace uso de la herencia para llamar los metodos
        //que imprimen los datos del empleados
        imprimirDatosPersona();
        //Ahora Imprimimos los datos propios del empleado
        JOptionPane.showMessageDialog(null, "El codigo laboral del empleado es: "+codigoLaboral);
        //Asignacion del salario
        imprimirAsignacionSalario(nombre, salario);
        if (esEmpleadoFijo == true) {
            JOptionPane.showMessageDialog(null, "El empleado es trabajador fijo de la empresa");
        }else{
            JOptionPane.showMessageDialog(null, "El empleajo es trabajador contratado de la empresa");
        }
    }
    
    //Metodo sobreescrito para definir el estado del empleado
    public void definirEstadoPersona(int edad){
        String estado = "";
        if (edad < 21) {
            estado = "Menor de edad legal";
        }else{
            estado = "Mayor de edad Legal";
        }
        JOptionPane.showMessageDialog(null, "La persona "+ nombre+" "+apellido+" es "+estado);
    }
    
}