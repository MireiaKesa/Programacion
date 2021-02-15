import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args){
        Scanner lector=new Scanner(System.in);
        float dineroOriginal,dinero,eurosUno,eurosDos,centimosUno,centimosDos,centimosCinco,centimosDiez,centimosVeinte,centimosCincuenta;
        System.out.print("Indique el dinero en euros: ");
        dinero=lector.nextFloat();
        dineroOriginal=dinero;
        System.out.print("El dinero que tienes es: "+dineroOriginal+"\nEquivale a:\n");
        if(dinero>2f){
            eurosDos=dinero/2f;
            dinero=dinero-(eurosDos*2f);
            System.out.print("Monedas de 2 Euros: "+eurosDos);
        }else if(dinero>1f){
            eurosUno=dinero/1;
            dinero=dinero-eurosUno;
            System.out.print("\nMonedas de 1 Euro: "+eurosUno);
        }else if(dinero>0.5f){
            centimosCincuenta=dinero/0.5f;
            dinero-=centimosCincuenta;
            System.out.print("\nMonedas de 50 centimos: "+centimosCincuenta);
        }else if(dinero>0.2f){
            centimosVeinte=dinero/0.2f;
            dinero-=centimosVeinte;
            System.out.print("\nMonedas de 20 centimos: "+centimosVeinte);
        }else if(dinero>0.1f){
            centimosDiez=dinero/0.1f;
            dinero-=centimosDiez;
            System.out.print("\nMonedas de 10 centimos: "+centimosDiez);
        }else if(dinero>0.05f){
            centimosCinco=dinero/0.05f;
            dinero-=centimosCinco;
            System.out.print("\nMonedas de 5 centimos: "+centimosCinco);
        }else if(dinero>0.02f){
            centimosDos=dinero/0.02f;
            dinero-=centimosDos;
            System.out.print("\nMonedas de 2 centimo: "+centimosDos);
        }else{
            centimosUno=dinero/0.01f;
            dinero-=centimosUno;
            System.out.print("\nMonedas de 1 centimo: "+centimosUno);
            
        }
    }
}
