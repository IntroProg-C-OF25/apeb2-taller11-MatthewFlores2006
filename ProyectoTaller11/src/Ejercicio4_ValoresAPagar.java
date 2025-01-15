
import java.util.Scanner;

/**
 * Generar un procedimiento para calcular el valor de la planilla de luz y otro procedimiento 
 * para calcular el valor del predio de un bien inmueble.
* Cada procedimiento debe tener 2 parámetros (tipo cadena para nombre del cliente, cédula del cliente). 
* En el procedimiento de planilla de luz se debe pedir los siguiente datos valor del kilowatio y el número de kilowatios del mes. 
* Y se genera en pantalla el siguiente reporte: 
* Cliente Ana Contreras con cédula 1100112233 debe cancelar el valor de $10
*
* En el procedimiento del predio se debe pedir el valor de inmueble y el para obtener el valor del predio se saca el 2% del valor del inmueble. Y se genera el siguiente reporte:

* Cliente Ana Contreras con cédula 1100112233 tiene un bien inmueble valorado en $30000 y tiene que pagar de predio $ 600.

* En el método principal; si el usuario ingresa 1 se llama al procedimiento calcularValorLuz; 2 se  llama al procedimiento calcularPredio. Los datos que se necesita en cada procedimiento se los debe ingresar por teclado.
* @author Matthew Flores
*/
public class Ejercicio4_ValoresAPagar {
     Scanner in = new Scanner(System.in);
     int prop;
    public void main(String[] args) {
        String name;
        int id; 
        byte select;
        System.out.print("Ingrese su nombre: ");
        name = in.next();
        System.out.print("Ingrese su numero de cedula: ");
        id = in.nextInt();
        System.out.println("Ingrese el valor a calcular, seleccione 1 o 2: ");
        select = in.nextByte();
        switch(select){
            case 1:
                System.out.print("Cliente " + name + " con cedula " + id + " debe cancelar el valor de " + "$" + calcLight());
                System.out.println("");
                break;
            case 2:
                System.out.print("Cliente " + name + " con cedula " + id + "tiene un inmueble valorado en " + "$" + prop + " y tiene que pagar un predio de " + "$" + calcTax());
                System.out.println("");
                break;
            default:
                System.out.println("Valor invalido, intente nuevamente");
                break;
        }  
    }
    public int calcLight() {
        short kilo, nKilo;
        System.out.print("Ingrese el valor del kilovatio: ");
        kilo = in.nextShort();
        System.out.print("Ingrese el numero de kilovatios mensuales: ");
        nKilo = in.nextShort();
        int price = kilo * nKilo;
        return price;
    }
    public double calcTax() {
         System.out.println("Ingrese el valor de inmueble");
         prop = in.nextInt();
         double tax = prop * 0.02;
         return tax;
    }
}
/**
 * run:
Ingrese su nombre: Matthew
Ingrese su numero de cedula: 1106732612
Ingrese el valor a calcular, seleccione 1 o 2: 
1
Ingrese el valor del kilovatio: 10
Ingrese el numero de kilovatios mensuales: 13
Cliente Matthew con cedula 1106732612 debe cancelar el valor de $130
* BUILD SUCCESSFUL (total time: 21 seconds)
 */