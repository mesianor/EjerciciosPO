import java.util.Scanner;

public class ScannerEjercicio2 {
    //Realiza un programa que pida una hora por teclado
    // y que muestre luego buenos días, buenas tardes o buenas noches según la hora.
    // Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente.
    // Sólo se tienen en cuenta las horas, los minutos no se deben introducir por teclado.
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.printf("intoduce una hora entre las 0 y 23");
        int hora= scanner.nextInt();

        if(hora<0||hora>23){
            System.out.printf("hora ivalida, por favor ingrese una hora entre las 0 y las 23");
        }else {
            if(hora>= 6 && hora<= 12){
                System.out.printf("Buenos dias");
            } else if (hora>=13 && hora<= 20) {
                System.out.printf("Buenas tardes");

            }else {
                System.out.printf("Buenas noches");
            }
        }

    }
}
