import java.util.Scanner;
public class Ejercicio12_modificado {
    public static void main(String[] args){
        Scanner lector=new Scanner(System.in);
        float radioCircunferencia,longitud,area;
        System.out.println("Indique el radio de la circunferencia");
        radioCircunferencia=lector.nextFloat();
        System.out.println();
        float numeropi=3.14f;
        area=numeropi*radioCircunferencia;
        longitud=2*numeropi*radioCircunferencia;
        System.out.printf("El area de la circunferencia es: "+"%.2f\n"+"La longitud es: "+"%.2f \n",area,longitud);
    }
}
