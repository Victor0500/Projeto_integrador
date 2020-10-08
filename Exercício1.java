
package Aula5;

import java.util.Scanner;

public class Exercício1 {
    public static void main(String args []){
        Scanner digite = new Scanner(System.in);
        String nomeAluno;
        double n1, n2, media;
        double p1 = 0.4, p2 = 0.6;
        int faltas, TOTAL_FALTAS=18;
        System.out.println("Cálculo media Algoritmos-TADS--");
        System.out.println("Nome: ");
        nomeAluno = digite.next();
        System.out.println("N1: ");
        n1=digite.nextDouble();
        System.out.println("N2: ");
        n2=digite.nextDouble();
        System.out.println("Faltas: ");
        faltas=digite.nextInt();
        
        media= (n1*p1) + (n2*p2);
        if ((media>=6.0) && (faltas<=TOTAL_FALTAS)){
            System.out.println(nomeAluno+" você está aprovado(a) com média " + media);
        }
        else if ((media<=6.0) && (faltas<=TOTAL_FALTAS)){
            System.out.println(nomeAluno + " você está reprovado devido a sua média de " + media);
       
        }
        else if((faltas>= TOTAL_FALTAS) && (media>=6.0)){
            System.out.println(nomeAluno + " você está reprovado(a) devido ao seu número de faltas: " + faltas);
         }

        else{
            System.out.println(nomeAluno + " você está reprovado(a) com média "+ media + " e com " + faltas + " faltas");      
        }
        
    }
    
}
