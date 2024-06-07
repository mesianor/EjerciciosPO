import java.util.Scanner;
//Escribe un programa que pida por teclado un día de la semana
// y que diga qué asignatura toca a primera hora ese día.
public class Main {
    public static void main (String[]arg){
        Scanner scanner= new Scanner(System.in);
        System.out.printf("Por favor, ingrese un dia de la semana: ");
        String diaDelaSemana= scanner.next();
        switch (diaDelaSemana) {
            case "lunes":
                System.out.printf("A primera hora del lunes toca Matematicas");
                break;

            case "martes":
                System.out.printf("A primera hora del martes toca Lengua");
                break;

            case "miercoles":
                System.out.printf("A primera hora del miercoles toca Ingles");
                break;

            case "jueves":
                System.out.printf("A primera hora del jueves toca Geografia");
                break;

            case "viernes":
                System.out.printf("A primera hora del viernes toca Historia");
                break;
            default:
                System.out.printf("No se dictan clases");
                break;


        }


    }
}