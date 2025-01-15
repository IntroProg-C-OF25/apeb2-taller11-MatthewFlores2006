
/**
 *Generar los procedimientos y/o funciones que impriman los valor pares,
 * impares y el promedio de un arreglo bidimensional. El (los) procedimiento(s) o método(s)
 * deben ser invocados desde el método principal (quien es el único responsable de gestionar las entradas/salidas);
 * además el método debe recibir como parámetro un arreglo bidimensional.
 *
 * @author Matthew Flores
 */
import java.util.Scanner;

public class Ejercicio1_ProcesodeArreglo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int limRws = 0, limCol = 0;
        System.out.println("Ingrese el limite de filas y columnas: ");
        limRws = in.nextInt();
        limCol = in.nextInt();
        int array[][] = new int[limRws][limCol];
        arrGen(array);
        arrPrnt(array);
        evenArrPrnt(array);
        oddArrPrnt(array);
        arrAv(array);
    }

    public static void arrGen(int array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public static void arrPrnt(int array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void arrAv(int array[][]) {
        int arrAc = 0, arrAv;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                arrAc += array[i][j];
            }
        }
        arrAv = arrAc / (array.length * array[0].length);
        System.out.println("Promedio de la matriz: " + arrAv);
    }

    public static void evenArrPrnt(int array[][]) {
        System.out.print("Elementos pares de la matriz: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(((array[i][j]) % 2 == 0) ? array[i][j] + (" ") : "");
            }
        }
        System.out.println("");
    }

    public static void oddArrPrnt(int array[][]) {
        System.out.print("Elementos impares de la matriz: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(((array[i][j]) % 2 != 0) ? array[i][j] + (" ") : "");
            }
        }
        System.out.println("");
    }
}
/**
 * run:
Ingrese el limite de filas y columnas: 
3 3
4 1 5 
6 2 8 
0 9 4 
Elementos pares de la matriz: 4 6 2 8 0 4 
Elementos impares de la matriz: 1 5 9 
Promedio de la matriz: 4
BUILD SUCCESSFUL (total time: 6 seconds)
 */