public class Ejercicio2 {
    public static void main(String[] args){
        float precioZapato=85f;
        float descuento=15f;
        float resultado=85f*15f/100f;
        float precioTotal=precioZapato-resultado;
        System.out.println("Precio Original: "+precioZapato+"\nEl descuento ofrecido es: "+descuento+"%\nEl descuento calculado es: "+resultado+"\nPrecio final: "+precioTotal+"€");
    }
}
