public class Ejercicio1 {
    public static void main(String[] args){
        int numero=45,i=0;
        while (numero<=100){
            if(i%6==0){
                System.out.println();
            }
            System.out.print(numero+"\t");
            numero++;
            i++;
        }
    }
}