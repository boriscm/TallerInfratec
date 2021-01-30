package Parte1;

public class ParesRunnable implements Runnable {
    private String name;
    
    private Integer i;

    public ParesRunnable(String name, Integer i){ 
        this.name = name;
        this.i = i;
        System.out.println("Implement: "+ this.name);

    }

    public void run() {
        try {
            for( int i = 2; i <= this.i; i+=2 ){
                System.out.println(i);
                Thread.sleep(100);
            }

        }
        catch(Exception e){
            System.out.println("Saliendo: "+ e);
        }

    }

   
}
