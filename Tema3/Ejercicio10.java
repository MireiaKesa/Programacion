import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args){
        Scanner lector=new Scanner(System.in);
        int dividendo,divisor,resultado,resto;
        System.out.print("Que numero quieres dividir: ");
        dividendo=lector.nextInt();
        System.out.println();
        System.out.print("Por que numero quieres dividirlo: ");
        divisor=lector.nextInt();
        System.out.println();
        resultado=dividendo/divisor;
        resto=dividendo%divisor;
        System.out.println("El resultado es: "+resultado+" y el resto es: "+resto);
    }
}
