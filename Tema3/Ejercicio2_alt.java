public class Ejercicio2 {
    public static void main(String[] args){
        float precioZapato=85f;
        float descuento=15f;
        float resultado=precioZapato-(precioZapato*descuento/100f);
        System.out.println("Precio Original: "+precioZapato+"\nEl descuento ofrecido es: "+descuento+"%\nPrecio final: "+resultado+"€");
    }
}