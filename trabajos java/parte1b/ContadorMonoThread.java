package parte1b;

public class ContadorMonoThread {
    private int contador = 0;

    public void increment() {
        for(int i = 0; i < 10000; i++){
            contador++;
        }
    }

    public int getContador () {
        return contador;
    }

    public static void main(String[] args) {
        ContadorMonoThread c = new ContadorMonoThread();
        for(int i = 0; i < 1000; i++){
            c.increment();
        }
        System.out.println(c.getContador());
        
    }
}
