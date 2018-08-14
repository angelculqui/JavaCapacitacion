
package pe.eggc.app.prueba2;
import pe.eggc.app.service2.MateService;

public class Prueba01 {
     public static void main(String[] args) {
        //Datos
        int n1=56;
        int n2=13;
        //proceso
        MateService mateService = new MateService();
        int suma =mateService.sumar(n1,n2);
        int resta =mateService.restar(n1,n2);
        //Reporte
        System.out.println("Numero 1 :" + n1);
        System.out.println("Numero 2 :" + n2);
        System.out.println("Suma :" + suma);
        System.out.println("Resta :" + resta);
    } 
}
