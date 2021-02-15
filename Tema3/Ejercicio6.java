import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args){
        Scanner lector=new Scanner(System.in);
        int edad;
        System.out.println("Introduce tu edad: ");
        edad=lector.nextInt();
        int numeroDias=edad*365;
        System.out.println("El numero de dias de "+edad+" años es: "+numeroDias);
    }
}
