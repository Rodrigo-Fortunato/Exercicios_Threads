package controller;

public class SomaLinha extends Thread {

    private int[] vet;
    private int linha;
    public SomaLinha(int[] vet, int linha){
        this.vet= vet;
        this.linha = linha;
    }

    @Override
    public void run() {
        soma(vet);
    }
    private void soma(int[]vet){
        int somaVet=0;
        for (int i : vet) {
            somaVet += i;
        }
        System.out.println( "Soma da linha "+ linha+ " da Matriz: "+ somaVet);
    }
}
