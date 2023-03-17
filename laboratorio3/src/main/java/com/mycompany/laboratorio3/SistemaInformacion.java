/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.laboratorio3;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
/**
 *
 * @author Maria Camila Guzman Bello, Johan Alexander Herrera Morales
 */
public class SistemaInformacion {
    
    //Constructor de la clase
    public SistemaInformacion() {
    }
    
    //Meto main
    public static void main(String[] args) {
        int opcion =0;
        //Elabora un metodo
        Persona sistemaInformacion = new Persona();
        try{
            //Usamos la herencia de la superClase para acceder a los metodos de lectura de datos
            do{
                opcion = sistemaInformacion.leerDatoTipoEntero("Seleccione la opción:\n1)Procesar los datos del empleado\n2)Procesar los datos del estudiante\n3)Salir");
            if (opcion == 1) {
                JOptionPane.showMessageDialog(null, "Procesando datos del empleado");
                Empleado manejadorEmpleado = new Empleado();
                //Leemos los datos
                manejadorEmpleado = manejadorEmpleado.ingresarDatosEmpleado();
                //Mostramos el reporte de datos
                manejadorEmpleado.imprimirReporteEstadoEmpleado();
            }else{
                if (opcion == 2) {
                    JOptionPane.showMessageDialog(null, "Procesando datos del estudiante");
                    Estudiante manejadorEstudiante = new Estudiante();
                    manejadorEstudiante = manejadorEstudiante.ingresarDatosEstudiante();
                    manejadorEstudiante.imprimirReporteNotasEstudiante();
                }else{
                    if (opcion == 3) {
                        JOptionPane.showMessageDialog(null, "Saliendo del sistema");
                    break;
                    }else{
                        JOptionPane.showMessageDialog(null, "Opcion invalida");
                    }
                }
            }
            }while(opcion <= 1 || opcion >= 3);//Fin do-while
        }
        catch(HeadlessException errorMain){
            JOptionPane.showMessageDialog(null, "Error en la digitacion");
        }
    }
    
    
}
