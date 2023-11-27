/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication9;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota, frequencia;
        
        System.out.print("Informe a nota do aluno: ");
        nota = sc.nextDouble();
        
        System.out.print("Informe a frequencia do aluno: ");
         frequencia = sc.nextDouble();
         
         sc.close();
         
         frequencia = frequencia / 100;
         
         if (nota >= 7.0 && frequencia >= 0.75) {
             System.out.println("Aprovado!");
         }else if (nota >= 4.0 && nota <= 7.0 && frequencia >= 0.75){
         }else{
             System.out.println("Reprovado");
         }
         }
    }
    

