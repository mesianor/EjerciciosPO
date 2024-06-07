import java.util.Scanner;

public class ScannerEjercicio6 {
    //Escribe un programa que ordene tres números enteros introducidos por teclado.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce 3 números enteros, vamos con el primer número:");
        int num1 = scanner.nextInt();

        System.out.println("Introduce el segundo número:");
        int num2 = scanner.nextInt();

        System.out.println("Introduce el tercer número:");
        int num3 = scanner.nextInt();


        if (num1 > num2 && num2 > num3) {
            System.out.printf("el orden de tus numeros es " + num3 + num2 + num1);
        } else if (num2 > num1 && num3 > num2) {
            System.out.printf("el orden de tus numeros es " + num1 + num2 + num3);
        } else System.out.printf("el orden de tus numeros es " + num2 + num3 + num1);
    }

}
