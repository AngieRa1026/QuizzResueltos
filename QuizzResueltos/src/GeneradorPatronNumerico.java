
import java.util.Scanner;

public class GeneradorPatronNumerico {

    public static void main(String[] args) throws Exception {
        final Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero entero positivo: ");
        int num1 = input.nextInt();

        if (num1 <= 0) {
            System.out.println("El numero ingresado no es valido");
            input.close();
            return;
        }

        for (int i = num1; i >= 1; i--) {
            for (int espacio = 1; espacio < i; espacio++) {
                System.out.print("  "); //print
            }
            for (int j = i; j <= num1; j++) {
                System.out.print(j + " "); //print
            }
            for (int j = num1 - 1; j >= i; j--) {
                System.out.print(j + " "); //print
            }
            System.out.println();
        }
        input.close();
    }
}
