package controller;

public class ThreadVetor extends Thread {

    private int num;
    private int[] vetor;

    public ThreadVetor(int num, int[] vetor) {
        this.num = num;
        this.vetor = vetor;
    }

    @Override
    public void run() {
        tempoVet(num,vetor);
    }
    private void tempoVet(int num, int[]vetor){
        if (num%2==0){
            long tempoini = System.nanoTime();
            for (int i=0;i < vetor.length;i++){

            }
            long tempofim = System.nanoTime();
            System.out.println("O tempo para percorrer o vetor com For foi de: " + (tempofim-tempoini)/Math.pow(10,9)+" segundos");
        }else {

            long tempoini = System.nanoTime();
            for (int i: vetor ) {

            }
            long tempofim = System.nanoTime();
            System.out.println("O tempo para percorrer o vetor com Foreach foi de: " + (tempofim-tempoini)/Math.pow(10,9)+" segundos");
        }
    }
}
