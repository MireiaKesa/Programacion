import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args){
        Scanner lector=new Scanner(System.in);
        float consumoMedio,precioLitro,totalPago,numKm,precioLitro2,totalPago2,numKm2,consumoCombustible,recorrido,consumoFinal,precioKilometro;
        System.out.print("Primera Gasolinera.\nIndica el precio/L del combustible: ");
        precioLitro=lector.nextFloat();
        System.out.println();//Para separar las cosas con un salto de linea por pantalla
        System.out.print("Indica el precio pagado: ");
        totalPago=lector.nextFloat();
        System.out.println();
        System.out.print("Indica el numero de kilometros del cuentakilometros: ");
        numKm=lector.nextFloat();
        System.out.println();
        System.out.print("Segunda Gasolinera.\nIndica el precio/L del combustible: ");
        precioLitro2=lector.nextFloat();
        System.out.println();
        System.out.print("Indica el precio pagado: ");
        totalPago2=lector.nextFloat();
        System.out.println();
        System.out.print("Indica el numero de kilometros del cuentakilometros: ");
        numKm2=lector.nextFloat();
        System.out.println();
        consumoCombustible=(totalPago/precioLitro)+(totalPago2/precioLitro2);
        recorrido=numKm2-numKm;
        consumoFinal=(consumoCombustible*100f)/recorrido;
        precioKilometro=(consumoCombustible*1f)/recorrido;
        System.out.printf("El consumo medio de este viaje seria: " +"%.2f\n"+ "Litros a los 100Km y el kilometro le cuesta: "+"%.2f"+"€/L",consumoFinal,precioKilometro); 
    }
}
