import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args){
        Scanner lector=new Scanner(System.in);
        int numero,numero2;
        System.out.print("Escribe dos numeros: ");
        numero=lector.nextInt();
        numero2=lector.nextInt();
        if (numero>numero2){
            System.out.println("El numero 1 que es: "+numero+" es mayor que numero 2 que es: "+numero2);
        }else if(numero<numero2){
            System.out.println("El numero 2 que es: "+numero2+" es mayor que numero 1 que es: "+numero);
        }else{
            System.out.println("El numero 1 que es: "+numero+" es igual que numero 2 que es: "+numero2);
        }
    }
}
