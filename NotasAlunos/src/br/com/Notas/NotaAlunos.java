package br.com.Notas;

import java.util.Scanner;

public class NotaAlunos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String melhoraluno = "";
        String pioraluno = "";
        double melhormedia = -1;
        double piormedia = 10;
        
        for (int Qantaluno = 1; Qantaluno <= 10; Qantaluno++ ) {
        	System.out.println("Digite o nome do aluno" + Qantaluno + ":");
        	String nome = sc.nextLine();
        	
        	 double somaNotas = 0;
             for (int n = 1; n <= 4; n++) {
                 System.out.print("Digite a nota " + n + " de " + nome + ": ");
                 double nota = sc.nextDouble();
                 somaNotas += nota;
    		   }
    		   sc.nextLine();
    		   
    		  double media = somaNotas / 4;
    		  if (media >=7) {
    			  System.out.printf("Aluno %s Aprovado com %.2f", nome,media);
    			} else if ((media >=5) && (media < 7)) {
    				System.out.printf("Aluno %s esta de Recuperação com %.2f", nome,media);
    			} else {
    				System.out.printf("Aluno %s esta reprovado com %.2f",nome,media);
    			}
    		  System.out.println("");
       if (media > melhormedia) {
    	   melhormedia = media;
    	   melhoraluno = nome;
       }
       if (media < piormedia) {
    	   piormedia = media;
    	   pioraluno = nome;   
       }

     }
        System.out.println("\nMelhor aluno: " + melhoraluno + " com media " + melhormedia);
        System.out.println("Pior aluno: " + pioraluno + " com media " + piormedia);
        
        sc.close();
  }
 }



