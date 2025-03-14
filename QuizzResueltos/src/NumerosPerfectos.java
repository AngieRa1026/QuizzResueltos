
import java.util.Scanner;

public class NumerosPerfectos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el rango de inicio: ");
        int num1 = scanner.nextInt();
        boolean esPerfecto = false;
        if (num1 > 1) {
            int sumaDivisores = 1;
            System.out.println(Math.sqrt(num1));
            for (int i = 2; i <= Math.sqrt(num1); i++) {
                if (num1 % i == 0) {
                    sumaDivisores += i;
                    if (i != num1 / i) {
                        sumaDivisores += num1 / i;
                        
                    }
                }
                esPerfecto = (sumaDivisores == num1);
            }
        }
        System.out.println("El numero " + num1 + (esPerfecto ? " es perfecto" : " no es perfecto"));
    }
}