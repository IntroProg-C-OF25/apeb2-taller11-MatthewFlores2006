
import java.util.Scanner;

/**
 *### Problema 05
 * Generar las funciones/métodos que devuelvan las suma, 
 * resta y multiplicación de un arreglo bidimensional cuadrado; mismo que se lo recibe como parámetro.
 * @author Matthew Flores
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de las matrices (un valor): ");
        n = in.nextInt();
         double[][] arr1 = new double[n][n], arr2 = new double[n][n];
         arrgen(arr1, arr2);
         System.out.println("Matrices generadas");
         arrDraw(arr1);
         System.out.println("Matriz 1 impresa");
         arrDraw(arr2);
         System.out.println("Matriz 2 impresa");
         arrDraw(sum(arr1, arr2));
        System.out.println("Matriz suma");
         arrDraw(subt(arr1, arr2));
        System.out.println("Matriz resta");
        arrDraw(mult(arr1, arr2));
        System.out.println("Matriz multiplicacion");
    }
     public static void arrgen(double arr1[][], double arr2[][]) {
        for (int i = 0; i < arr1.length; i++) {
             for (int j = 0; j < arr1.length; j++) {
                 arr1[i][j] = (int) (Math.random() * 10);
                 arr2[i][j] = (int) (Math.random() * 10);
            }
        }
    }
     public static void arrDraw(double arr[][]) {
        for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j < arr.length; j++) {
                 System.out.print(arr[i][j] + " ");
            }
             System.out.println("");
        }
     }
    public static double[][] sum(double arr1[][], double arr2[][]) {
        double[][] sum = new double [arr1.length][arr2[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return sum;
    }
     public static double[][] subt(double arr1[][], double arr2[][]) {
        double[][] subt = new double [arr1.length][arr2[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                subt[i][j] = arr1[i][j] - arr2[i][j];
            }
        }
        return subt;
    }
      public static double[][] mult(double arr1[][], double arr2[][]) {
        double[][] mult = new double [arr1.length][arr2[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                mult[i][j] = arr1[i][j] * arr2[i][j];
            }
        }
        return mult;
    }
}
/**
 * run:
Ingrese el tama�o de las matrices (un valor): 3
Matrices generadas
3.0 9.0 8.0 
5.0 1.0 5.0 
2.0 8.0 8.0 
Matriz 1 impresa
5.0 7.0 5.0 
1.0 3.0 3.0 
0.0 1.0 8.0 
Matriz 2 impresa
8.0 16.0 13.0 
6.0 4.0 8.0 
2.0 9.0 16.0 
Matriz suma
-2.0 2.0 3.0 
4.0 -2.0 2.0 
2.0 7.0 0.0 
Matriz resta
15.0 63.0 40.0 
5.0 3.0 15.0 
0.0 8.0 64.0 
Matriz multiplicacion
BUILD SUCCESSFUL (total time: 2 seconds)
 */