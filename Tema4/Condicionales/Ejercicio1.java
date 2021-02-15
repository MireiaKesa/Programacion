import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args){
        Scanner lector=new Scanner(System.in);
        int numero;
        System.out.println("Introduce el numero a comprobar si es par");
        numero=lector.nextInt();
        if (numero%2==0){
            System.out.println("Es par");
        }else{
            System.out.println("Es impar");
        }
    }
}
