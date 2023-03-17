/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfismo;
    import javax.swing.JOptionPane;
/**
 *IMPLEMENTADORA 2
 * @author Maria Camila Guzman Bello, Johan Alexander Herrera Morales
 */
public class CalculadoraEspecial implements InterfazCalculadora{
    private int numero1; 
    private int numero2; 
    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
        if (this.numero2==0){
            JOptionPane.showMessageDialog(null, "E R R O R! No es valido el 0!");
        }
    }
    @Override
    public int sumarEnteros(int numero1, int numero2) {
        return (numero1+numero2)/2; 
    }

    @Override
    public int restarEnteros(int numero1, int numero2) {
        return (numero1-numero2)/2; 
    }

    @Override
    public int multiplicarEnteros(int numero1, int numero2) {
        return (numero1*numero2)/2;
    }

    @Override
    public double dividirEnteros(int numero1, int numero2) {
        return (numero1/numero2)/2; 
    }

    @Override
    public double calcularRaizCuadrada(int numero1) {
        return (Math.sqrt(numero1))/2;
    }
    public int leerDatos(String mensaje){
        return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
    }
    public void imprimir(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
