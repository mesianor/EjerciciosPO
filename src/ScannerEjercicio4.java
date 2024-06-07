import java.util.Scanner;

public class ScannerEjercicio4 {
    //Realiza un programa que calcule la media de tres notas.

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.printf("ingrese 3 notas separadad por un espacio");
        Double nota1= scanner.nextDouble();
        Double nota2= scanner.nextDouble();
        Double nota3= scanner.nextDouble();
        Double promedio= (nota1+ nota2+ nota3)/ 3;

        System.out.printf("la media de sus notas es: "+ promedio);

    }
}
