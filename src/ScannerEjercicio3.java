import java.util.Scanner;

public class ScannerEjercicio3 {
    //Escribe un programa en que dado un número del 1 a 7
    // escriba el correspondiente nombre del día de la semana.

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.printf("ingrese un numero del 1 al 7");
        int dia= scanner.nextInt();
        String nombreDia = "";

        switch (dia){
            case 1:
                nombreDia= "lunes";
                break;
            case 2:
                nombreDia= "martes";
                break;
            case 3:
                nombreDia="miercoles";
                break;
            case 4:
                nombreDia= "jueves";
                break;
            case 5:
                nombreDia="viernes";
                break;
            case 6:
                nombreDia= "sabado";
                break;
            case 7:
                nombreDia="domingo";
                break;
            default:
                System.out.printf("numero invalido, por favor introduce un numero del 1 al 7");
                break;

        }
        System.out.printf(nombreDia);


    }
}
