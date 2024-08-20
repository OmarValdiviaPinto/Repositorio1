/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programas;
//Paquete de datos e/s datos por consola
import java.util.Scanner;
public class Programa01 {
//Método principal
        public static void main(String[] args) {
        //Declaración de variables
        String empleado,cargo;
        double ingreso,gasto,ahorrom,ahorroa;
        //creando el objeto lectura
        Scanner lectura=new Scanner (System.in);
        //Entrada de datos
        System.out.print("Nombre de empleado: ");
        empleado=lectura.next();
        System.out.print("Cargo del empleado: ");
        cargo=lectura.next();
        System.out.print("Ingresos del empleado: ");
        ingreso=lectura.nextDouble();
        System.out.print("Gastos del empleado: ");
        gasto=lectura.nextDouble();
        //Proceso de datos
        ahorrom=ingreso-gasto;
        ahorroa=ahorrom*12;
        //Salida de datos
        System.out.println("Ahorro Mensual: "+ahorrom);
        System.out.println("Ahorro Anual: "+ahorroa);
        //Fin del programa
    }
    
}

//prueba push1
