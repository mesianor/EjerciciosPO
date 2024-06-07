import java.util.Scanner;

public class ScannerEjercicio5 {
    //Escribe un programa que dada una hora determinada (horas y minutos),
    // calcule los segundos que faltan para llegar a la medianoche.
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.printf("ingrese una hora de 0 a 23");
        int hora= scanner.nextInt();
        System.out.printf("ingrese los minutos de 0 a 59");
        int minutos= scanner.nextInt();

        if (hora<0 || hora>23 || minutos<0 || minutos>59) {
            System.out.printf("Por favor, ingrese una hora y minutos validos");
        }else{
            int totalSegundos = (hora*3600)+ (minutos*60);
            int segundosEnUnDia= 24*3600;
            int segundosFaltantesMedianoche= (segundosEnUnDia-totalSegundos);

            System.out.printf("Faltan "+segundosFaltantesMedianoche+" segundos para llegar a medianoche");
        }
    }
}
