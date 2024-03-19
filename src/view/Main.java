package view;
import controller.*;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        //EX01
     /*   for (int cont=0; cont < 5;cont++){
            ThreadId threadId = new ThreadId(cont);
            threadId.start();
        }*/

        //EX02
     /*   int[][] matriz = new int[3][5];

        for (int i=0;i <3;i++){
            System.out.println();
            for (int j=0;j <5;j++){
                matriz[i][j] = random.nextInt(50);
               // System.out.print(matriz[i][j]+ " ");
            }
        }

        for (int cont=0;cont <3;cont++){
            SomaLinha somaLinha = new SomaLinha(matriz[cont],cont);
            somaLinha.start();
        }*/


        //EX03

  /*      int[]vetor= new int[1000];
        for (int cont=0;cont< vetor.length;cont++){
            vetor[cont] = random.nextInt(101);
        }
        for (int i=1;i<=2;i++) {
            ThreadVetor threadVetor = new ThreadVetor(i, vetor);
            threadVetor.start();
        }*/


        //EX04

        for (int cont=1;cont<= 5;cont++){
            Corrida corrida = new Corrida(cont);
            corrida.start();
        }




    }
}
