public class Ejercicio8 {
    public enum MesesAño{ENERO,FEBRERO,MARZO,ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE,NOVIEMBRE,DICIEMBRE}
    public enum NotasMusicales{DO,RE,MI,FA,SOL,LA,SI}
    public enum CalificacionAlumno{INSUFICIENTE,SUFICIENTE,BIEN,NOTABLE,EXCELENTE}
    public static void main(String[] args){
        for(MesesAño m: MesesAño.values()){
			System.out.print(m.toString() + " - ");
		}
		System.out.println();
		for(NotasMusicales nM: NotasMusicales.values()){
			System.out.print(nM.toString() + " - ");
		}
		System.out.println();
		for(CalificacionAlumno cA: CalificacionAlumno.values()){
			System.out.print(cA.toString() + " - ");
		}        
        System.out.println();
    }
}
