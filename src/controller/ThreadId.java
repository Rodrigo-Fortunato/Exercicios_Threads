package controller;

public class ThreadId extends Thread {

    public ThreadId(int idThread){

    }
    @Override
    public void run(){
        long idThread = getId();
        System.out.println(idThread);
    }




}
