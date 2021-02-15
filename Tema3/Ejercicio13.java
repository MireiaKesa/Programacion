import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args){
        Scanner lector=new Scanner(System.in);
        double gradosCentigrados,gradosKelvin,gradosFahrenheit;
        System.out.println("Ponga los grados Cº: ");
        gradosCentigrados=lector.nextDouble();
        System.out.println();
        gradosKelvin=273.15+gradosCentigrados;
        gradosFahrenheit=gradosCentigrados*(9/5) +32;
        System.out.println("Grados Cº: "+gradosCentigrados+"\nGrados Kelvin: "+gradosKelvin+"\nGrados Fahrenheit: "+gradosFahrenheit);
    }

}
