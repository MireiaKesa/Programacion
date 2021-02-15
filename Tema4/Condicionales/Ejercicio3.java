import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args){
        Scanner lector=new Scanner(System.in);
        int edad;
        System.out.print("Que edad tiene: ");
        edad=lector.nextInt();
        if (edad>=18){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
    }
}
