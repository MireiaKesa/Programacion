import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args){
        Scanner lector=new Scanner(System.in);
        int dias,horas,segundos,minutos;
        System.out.print("Dime los segundos: ");
        segundos=lector.nextInt();
        System.out.println();
        minutos=segundos/60;
        horas=minutos/60;
        minutos=minutos%60;
        dias=horas/24;
        horas=horas%24;
        segundos=segundos%60;
        System.out.println("Dias "+dias+"\nHoras "+horas+"\nMinutos "+minutos+"\nSegundos "+segundos);
    }
}
