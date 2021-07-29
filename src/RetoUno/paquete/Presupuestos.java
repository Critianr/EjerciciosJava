package paquete;
import java.text.DecimalFormat;
public class Presupuestos {
    private int pTim;
    private double pMon, pInt;
    double intereSim, interesCom, compararIntereses;
    public Presupuestos(int pTiempo, double pMonto, double pInteres){
        this.pInt = pInteres/100;
        this.pMon = pMonto;
        this.pTim = pTiempo;
        intereSim = (pMon * pInt) * pTim;
        interesCom = pMonto * (Math.pow(1 + pInt, pTim)-1);

    }
    public void compararProyectos(){
        compararIntereses =  interesCom - intereSim;
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("interes compuesto: " + df.format(interesCom) + " interes simple: " + df.format(intereSim));
        System.out.println("La diferencia entre interes compuesto a interes simple es: " + df.format(compararIntereses) + "$"); 
    }
}
