package view;
import controller.ThreadId;

public class Main {
    public static void main(String[] args) {
        //EX01
        for (int cont=0; cont < 5;cont++){
            ThreadId threadId = new ThreadId(cont);
            threadId.start();
        }

    }
}
