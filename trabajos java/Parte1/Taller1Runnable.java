package Parte1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Taller1Runnable {
    public static void main(String[] args) {
        try {
            BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Numero tope"); 
            Integer val = Integer.parseInt(obj.readLine());  

            Thread t1 = new Thread(new ParesRunnable("t1", val)) ;
            Thread t2 = new Thread(new ImparesRunnable("t2", val));
            t2.start();
        
            Thread.sleep(30);
            t1.start();
        }
        catch(Exception e){
            System.out.println("Saliendo: "+ e);
        }      
    }
}
