import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args){
        Scanner lector=new Scanner(System.in);
        int cuota,cuotaBase,descuento,descuentoPersonasMayores,personasMayores,descuentoPersonasMenores,personasMenores,descuentoPersonasMePadrSocio,personasMePadrSocio;
        System.out.print("Cuota a abonar: ");
        cuota=lector.nextInt();
        cuotaBase=500;
        personasMayores=50;
        personasMenores=25;
        personasMePadrSocio=35;
        System.out.print("La cuota base es: "+cuotaBase);
        if (descuentoPersonasMayores=cuotaBase*personasMayores/100){
            System.out.print("Las personas mayores con su descuento, pagarán: "+descuentoPersonasMayores+"€");
        }else if (descuentoPersonasMenores=cuotaBase*personasMenores/100){
            System.out.print("Las personas menores de 18 años, que los padres no son socios, pagarán: "+descuentoPersonasMenores+"€");
        }else if (descuentoPersonasMePadrSocio=cuotaBase*personasMePadrSocio/100){
            System.out.print("Las personas menores de 18 años, que los padres son socios, pagarán: "+descuentoPersonasMePadrSocio+"€");
        }
    }
}
