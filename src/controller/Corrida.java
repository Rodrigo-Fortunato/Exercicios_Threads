package controller;

import java.util.Random;

public class Corrida extends Thread {

    private static int colocacao=0;
    private int puloMax = 100;
    private int id;
    private int tamanhoPercurso = 1000;

    public Corrida(int id){
        this.id = id;
    }
    @Override
    public void run() {
        sapo(id);
    }
    public void sapo(int id){
        Random random = new Random();
        int distanciaPercorrida = 0;
        int pulo=0;
        while (distanciaPercorrida < tamanhoPercurso){
            pulo = random.nextInt(puloMax);
            distanciaPercorrida += pulo;
            System.out.println("O sapo " + id + " Pulou: "+ pulo+" e percorreu um total de: "+ distanciaPercorrida + " Metros");
        }
        colocacao++;
        System.out.println("O sapo "+ id+ " terminou a corrida em "+ colocacao + " Colocado.");

    }
}
