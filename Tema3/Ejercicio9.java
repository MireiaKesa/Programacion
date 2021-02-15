import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args){
        Scanner lector=new Scanner(System.in);
        int numero;
        int numero2;
        System.out.print("Introduce un numero: ");
        numero=lector.nextInt();
        System.out.println();
        System.out.println("Introduce otro numero: ");
        numero2=lector.nextInt();
        int resultado=numero-numero2;
        System.out.println("El resultado de la resta "+numero+"-"+numero2+" es: "+resultado);
    }
}