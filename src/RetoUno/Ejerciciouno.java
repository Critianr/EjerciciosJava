import java.text.DecimalFormat;
import java.util.Scanner;
import paquete.Presupuestos;


public class Ejerciciouno {
     public static void main(String[] args) throws Exception {  
        
        System.out.println("Hello, Reto 1");
        System.out.println("Ingresa el capital de presupusto");
        Scanner in = new Scanner(System.in);
        double pMonto = in.nextDouble();
        System.out.println("ingrese la Tasa de interes");
        double pInteres = in.nextDouble();
        System.out.println("Ingrese el total de periodos(meses) de la inversion");
        int pTiempo = in.nextInt();
        Presupuestos valores = new Presupuestos(pTiempo, pMonto, pInteres);
        valores.compararProyectos();
                
     } 
}
