import java.nio.DoubleBuffer;
import java.util.Scanner;

public class ScannerEjercicio7 {
    //Escribe un programa que genere el sueldo (bien desglosado) de un empleado según las siguientes condiciones:
    // Se pregunta el cargo del empleado
    // (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe de proyecto),
    // los días que ha estado de viaje visitando clientes durante el mes
    // y su estado civil (1 - Soltero, 2 - Casado).
    //El sueldo base según el cargo es de 950, 1200 y 1600 euros
    // según si se trata de un prog. junior, un prog. senior o un jefe de proyecto respectivamente.
    //Por cada día de viaje visitando clientes se pagan 30 euros extra en concepto de dietas.
    // Al sueldo neto hay que restarle el IRPF, que será de un 25% en caso de estar soltero
    // y un 20% en caso de estar casado.

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.printf("Por favor ingrese el numero correspondiente a su cargo: 1-Prog. junior, 2 - Prog. senior, 3 - Jefe de proyecto");
        int cargo= scanner.nextInt();
        System.out.printf("Por favor ingrese el numero de dias que ha estado de viaje visitando clientes durante el mes");
        int dias= scanner.nextInt();
        System.out.printf("Por favor ingrese su estado civil 1-soltero, 2-casad0");
        String estadoCivil= scanner.next();

        Integer sueldoBase=0;

        switch (cargo) {
            case 1:
                sueldoBase=950;
                break;
            case 2:
                sueldoBase= 1200;
                break;
            case 3:
                sueldoBase= 1600;
                break;
            default:
                System.out.printf("Por favor ingrese un numero de cargo valido");
                return;
        }

        int extraPorViajes= dias*30;
        int sueldoTotal= sueldoBase+extraPorViajes;
        double sueldoNeto=0.0;


        if (estadoCivil=="soltero"){
             double sueldoNeto= (sueldoTotal *25)/100;
        } else if (estadoCivil=="casado") {
            double sueldoNeto= (sueldoTotal *20)/100;


        }
        System.out.printf("Desglose del sueldo: ");
        System.out.printf("su sueldo base es: " + sueldoBase+" euros.");
        System.out.printf("Usted obtuvo un pago extra por dias de viaje de: "+ extraPorViajes+" euros.");
        System.out.printf("su sueldo bruto es de: "+sueldoTotal+" euros.");
        System.out.printf("su sueldo neto con descuento de IRPF es de: "+sueldoNeto+ " euros.");

    }
}
