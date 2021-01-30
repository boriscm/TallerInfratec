package Parte1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Taller1Thread {
    public static void main(String[] args) {
        try {
            BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Numero tope"); 
            Integer val = Integer.parseInt(obj.readLine());  

            ParesThread t1 = new ParesThread("t1", val);
            ImparesThread t2 = new ImparesThread("t2", val);
            t2.start();
        
            Thread.sleep(30);
            t1.start();
        }
        catch(Exception e){
            System.out.println("Saliendo: "+ e);
        }      
    }
}

