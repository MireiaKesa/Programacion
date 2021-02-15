import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args){
        Scanner lector=new Scanner(System.in);
        float numero;
        System.out.print("Indique la nota: ");
        numero=lector.nextFloat();
        if (numero>=0 && numero<5){
            System.out.println("INSUFICIENTE");
        }else if (numero>=5 && numero<6){
            System.out.println("SUFICIENTE");
        }else if (numero>=6 && numero<7){
            System.out.println("BIEN");
        }else if (numero>=7 && numero<9){
            System.out.println("NOTABLE");
        }else if (numero>=9 && numero<=10){
            System.out.println("SOBRESALIENTE");
        }else{
            System.out.println("ERROR");
        }
    }
}
