/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author jorge
 */
import java.util.Scanner;
public class IMC {
    // Objeto para receber dados
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Especifique a altura: ");
        double altura = Double.parseDouble(sc.nextLine());
        System.out.println("Especifique o peso: ");
        double peso = Double.parseDouble(sc.nextLine());
        double imc = peso/(altura * altura);
        System.out.println(imc);
        if(imc >= 40){
            System.out.println("Obesidade grave");}
        else if(imc > 30){
            System.out.println("Obesidade");}
        else if(imc > 25){
            System.out.println("Sobrepeso");}
        else if(imc > 18){
            System.out.println("Normal");}
        else {
            System.out.println("Magreza");}
        }
        
    }
        
    


