import java.util.concurrent.ThreadLocalRandom;

public class MaximoMatriz extends Thread{

    private final static int INT_MAX = 105345;

    private final static int DIM = 3;

    private static int[][] matriz = new int[DIM][DIM];

    private static int mayor = -1;

    private int mayorFila = -1;

    private int idThread;

    private int fila;

    public MaximoMatriz(int pIdThread, int pFila) {
        this.idThread = pIdThread;
        this.fila = pFila;
    }

    public static void crearMatriz() {
        for(int i = 0; i < DIM; i++){
            for(int j = 0; i < DIM; i++){
                matriz[i][j] = ThreadLocalRandom.current().nextInt(0, INT_MAX);
            }
        }

        System.out.println("MATRIZ:");
        System.out.println("=========================");
        imprimirMatriz();
    }

    public static void imprimirMatriz(){
        for(int i = 0; i < DIM; i++){
            for(int j = 0; i < DIM; i++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}