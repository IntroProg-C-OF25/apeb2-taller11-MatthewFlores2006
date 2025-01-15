
import java.util.Scanner;

/**
 * Generar una función que tenga 4 parámetros de tipo decimal y devuelva 
 * el promedio cualitativo de los parámetros.
 * Si el promedio es:
 * De 0 a 5 el promedio cualitativo es Regular
 * De 5.1 a 8 el promedio es Bueno
 * De 8.1 a 9 el promedio es Muy Bueno
 * De 9.1 a 10 el promedio es Sobresaliente.
 * A la función se la debe llamar desde un método principal. Los parámetros necesarios para
 * llamar a la función, deben ser ingresados solicitados al usuario. 
 * @author Matthew Flores
 */
public class Ejercicio3_Promedios {
    
    public static void main(String[] args) {
        short s1, s2, s3, s4;
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese los puntajes del estudiante: ");
        s1 = in.nextShort();
        s2 = in.nextShort();
        s3 = in.nextShort();
        s4 = in.nextShort();
        System.out.println(avg(s1, s2, s3, s4));
    }
    public static String avg(short s1, short s2, short s3, short s4) {
        int avgS = (s1 + s2 + s3 + s4) / 4;
        String score = null;
        if(avgS <= 5)
            score = "Regular";
        if(avgS > 5 || avgS <= 8)
            score = "Bueno";
        if(avgS > 8 || avgS <= 9)
            score = "Muy Bueno";
        if(avgS > 9 || avgS <= 10)
            score = "Sobresaliente";
        return score;
    }
}
/**
 * run:
Ingrese los puntajes del estudiante: 10 9 8 7
Sobresaliente
BUILD SUCCESSFUL (total time: 9 seconds)
 */