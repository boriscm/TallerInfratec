package Parte1;

public class ImparesThread extends Thread {
    private String name;
    
    private Integer i;

    public ImparesThread(String name, Integer i){ 
        this.name = name;
        this.i = i;
        System.out.println("Extendiendo: "+ this.name);

    }
    
    public void run(){

        try {
            for( int i = 1; i <= this.i; i+=2 ){
                System.out.println(i);
                Thread.sleep(100);
            }

        }
        catch(Exception e){
            System.out.println("Saliendo: "+ e);
        }

    }


}
