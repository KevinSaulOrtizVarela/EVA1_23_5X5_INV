package eva1_practica_3;

/**
 *
 * @author Kevin
 */
public class Principal {

  
    public static void main(String[] args) {
      int [][] Arre =  new int [5][5];
      //SE LLENA LA MATRIZ CON VALORES ALEATORIOS
        for (int i = 0; i < Arre.length; i++) {
            for (int j = 0; j < Arre.length; j++) {
                Arre[i][j] = (int) (Math.random()*100);
            }
        }
        //SE IMPRIME LA MATRIZ EN FORMA CUADRADA
        System.out.println("Arreglo normal");
        for (int i = 0; i < Arre.length; i++) {
            for (int j = 0; j < Arre.length; j++) {
                System.out.print(" [" +Arre[i][j] + "] ");
            }
            System.out.println("");  
        }
        //SE CREA UNA COPIA INVERSA DEL ARREGLO
        int ArreCopia[][] = new int [5][5];
        for (int i = 0, j= ArreCopia.length-1 ; i < Arre.length; i++ , j--) {
            for (int k = 0 , l= ArreCopia.length-1; k < Arre.length; k++, l--) {
              ArreCopia[i][k]= Arre[j][l];
            }
        }
        //SE IMPRIME EL ARREGLO INVERSO
        System.out.println("Arreglo inverso");
        for (int i = 0; i < ArreCopia.length; i++) {
            for (int j = 0; j < ArreCopia.length; j++) {
                System.out.print(" [" + ArreCopia[i][j] + "] ");
            }
            System.out.println("");
        }
        
    }
        
    
}
