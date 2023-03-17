/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polimorfismo;

import javax.swing.JOptionPane;

/**
 *
 * @author Maria Camila Guzman Bello, Johan Alexander Herrera Morales
 * 
 */
public class Polimorfismo {

    public static void main(String[] args) {
        int choose;
        do{
            choose=Integer.parseInt(JOptionPane.showInputDialog(null, "Eliga una opción: \n1.Calculadora Normal.\n2.Calculadora Especial.\n3.Salir."));
            if(choose==1){
                JOptionPane.showMessageDialog(null, "Calculadora Normal");
                CalculadoraNormal ClienteCalculadoraNormal=new CalculadoraNormal(); 
                ClienteCalculadoraNormal.setNumero1(ClienteCalculadoraNormal.leerDatos("Digite el numero 1"));
                do{
                    ClienteCalculadoraNormal.setNumero2(ClienteCalculadoraNormal.leerDatos("Digite el numero 2")); 
                }while(ClienteCalculadoraNormal.getNumero2()==0);
                ClienteCalculadoraNormal.imprimir("La suma es: "+ClienteCalculadoraNormal.sumarEnteros(ClienteCalculadoraNormal.getNumero1(),ClienteCalculadoraNormal.getNumero2()));
                ClienteCalculadoraNormal.imprimir("La resta es: "+ClienteCalculadoraNormal.restarEnteros(ClienteCalculadoraNormal.getNumero1(),ClienteCalculadoraNormal.getNumero2()));
                ClienteCalculadoraNormal.imprimir("La multiplicación es: "+ClienteCalculadoraNormal.multiplicarEnteros(ClienteCalculadoraNormal.getNumero1(),ClienteCalculadoraNormal.getNumero2()));
                ClienteCalculadoraNormal.imprimir("La división es: "+ClienteCalculadoraNormal.dividirEnteros(ClienteCalculadoraNormal.getNumero1(),ClienteCalculadoraNormal.getNumero2()));
                ClienteCalculadoraNormal.imprimir("La raiz Cuadrada "+ClienteCalculadoraNormal.getNumero1()+" es: "+ClienteCalculadoraNormal.calcularRaizCuadrada(ClienteCalculadoraNormal.getNumero1()));
            }if(choose==2){
                JOptionPane.showMessageDialog(null, "                           Calculadora especial\n Recuerde que sus funciones dividen el resultado entre 2 ");
                CalculadoraEspecial ClienteCalculadoraEspecial=new CalculadoraEspecial(); 
                ClienteCalculadoraEspecial.setNumero1(ClienteCalculadoraEspecial.leerDatos("Digite el numero 1"));
                do{
                    ClienteCalculadoraEspecial.setNumero2(ClienteCalculadoraEspecial.leerDatos("Digite el numero 2")); 
                }while(ClienteCalculadoraEspecial.getNumero2()==0);
                ClienteCalculadoraEspecial.imprimir("La suma es: "+ClienteCalculadoraEspecial.sumarEnteros(ClienteCalculadoraEspecial.getNumero1(),ClienteCalculadoraEspecial.getNumero2()));
                ClienteCalculadoraEspecial.imprimir("La resta es: "+ClienteCalculadoraEspecial.restarEnteros(ClienteCalculadoraEspecial.getNumero1(),ClienteCalculadoraEspecial.getNumero2()));
                ClienteCalculadoraEspecial.imprimir("La multiplicación es: "+ClienteCalculadoraEspecial.multiplicarEnteros(ClienteCalculadoraEspecial.getNumero1(),ClienteCalculadoraEspecial.getNumero2()));
                ClienteCalculadoraEspecial.imprimir("La división es: "+ClienteCalculadoraEspecial.dividirEnteros(ClienteCalculadoraEspecial.getNumero1(),ClienteCalculadoraEspecial.getNumero2()));
                ClienteCalculadoraEspecial.imprimir("La raiz Cuadrada "+ClienteCalculadoraEspecial.getNumero1()+" es: "+ClienteCalculadoraEspecial.calcularRaizCuadrada(ClienteCalculadoraEspecial.getNumero1()));
            }
            if(choose!=1&&choose!=2&&choose!=3){
                JOptionPane.showMessageDialog(null, "Opción Invalida");
            }
        }while(choose==1|choose==2|choose!=3);
        JOptionPane.showMessageDialog(null, "Gracias por utilizar nuestros servicios");
    }
    
    
}
