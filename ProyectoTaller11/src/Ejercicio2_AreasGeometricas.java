
/**
 ** Generar una solución que implemente 3 procedimientos. Que permitan calcular el área de un cuadrado,
 * área de un triángulo y área de un rectángulo. Cada procedimiento/función debe recibir los datos necesarios
 * y generar el valor correspondiente. Se debe invocar a los procedimientos desde un método principal;
 * Si el usuario ingresa 1 se llama al procedimiento obtenerAreaCuadrado; 2 se llama al procedimiento obtenerAreaTriangulo;
 * 3 se llama al procedimiento obtenerAreaCuadrado.
 * El área del cuadrado es igual a lado x lado x lado x lado
 * El área del triángulo es igual a (base x altura)/2
 * El área del rectángulo es igual a base x altura
 *
 * @author Matthew Flores
 */

import java.util.Scanner;

public class Ejercicio2_AreasGeometricas {

    public static void main(String[] args) {
        int l, b, h, bR, hR; 
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese la longitud de los lados del cuadrado: ");
        l = in.nextInt();
        System.out.print("Ingrese la longitud de la base del triangulo: ");
        b = in.nextInt();
        System.out.print("Ingrese la longitud de la altura del triangulo: ");
        h = in.nextInt();
        System.out.print("Ingrese la longitud de la base del rectangulo: ");
        bR = in.nextInt();
        System.out.print("Ingrese la longitud de la altura del rectangulo: ");
        hR = in.nextInt();
        sqr(l);
        tri(b, h);
        rect(bR, h);
        System.out.println("El area del cuadrado es: " + sqr(l));
        System.out.println("El area del triangulo es: " + tri(b, h));
        System.out.println("El area del circulo es: " + rect(bR,hR));
   
    }
    public static int sqr(int l) {
        l = l * 4;
        return l;
    }

    public static int tri(int b, int h) {
        b = (b * h) / 2;
        return b;
    }

    public static int rect(int bR, int hR) {
        bR = (bR * hR);
        return bR;
    }
}
/**
 * run:
Ingrese la longitud de los lados del cuadrado: 4
Ingrese la longitud de la base del triangulo: 3
Ingrese la longitud de la altura del triangulo: 5
Ingrese la longitud de la base del rectangulo: 6
Ingrese la longitud de la altura del rectangulo: 3
El area del cuadrado es: 16
El area del triangulo es: 7
El area del circulo es: 18
BUILD SUCCESSFUL (total time: 13 seconds)
 */