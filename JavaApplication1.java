/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author jorge
 */
import java.util.Scanner;
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double media, nota1, nota2;
        System.out.println("Digite nota 1: ");
        nota1 = Double.parseDouble(sc.nextLine());
        System.out.println("Digite nota 2: ");
        nota2 = Double.parseDouble(sc.nextLine());
        media = (nota1 + nota2) / 2.0;
        System.out.print("A sua média é: ");
        System.out.printf("%.2f", media);
        sc.close();      
    }
    
}
