import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args){
        Scanner lector=new Scanner(System.in);
        float numero,numero2;
        System.out.print("Indique dos numeros reales: ");
        numero=lector.nextFloat();
        numero2=lector.nextFloat();
        if (numero<numero2){
            System.out.println(numero+"-"+numero2);
        }else if (numero==numero2){
            System.out.println(numero+"-"+numero2);
        }else{
            System.out.println(numero2+"-"+numero);
        }
    }
}
