import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args){
        Scanner lector=new Scanner(System.in);
        float euros,dolares,libras;
        System.out.print("Ponga una cantidad para Euros(€): ");
        euros=lector.nextFloat();
        System.out.println();
        dolares=euros*1.20f;
        libras=euros*0.88f;
        System.out.printf("Sus euros en dolares son: "+"%.2f\n"+"Sus euros en libras son: "+"%.2f\n",dolares,libras);
    }
    
}
