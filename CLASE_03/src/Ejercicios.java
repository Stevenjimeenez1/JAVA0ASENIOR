
import java.util.Scanner;


public class Ejercicios {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*Ejercicio 1
        Escriba un programa que permita ingresar un número real e identifique si el número es negativo, positivo o cero.*/
        System.out.print("Ingrese un numero: ");
        double numero = scanner.nextDouble();
        if(numero>=1){
            System.out.println("El numero es positivo");
        }else if(numero<=-1){
            System.out.println("El numero es negativo");
        }else{
            System.out.println("El numero es cero");
        }
        /*Ejercicio 2
        Escriba un programa que le permita ingresar tres números e imprima en la consola el más grande de ellos. */
        System.out.println("Ingresa tres numero: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();
        double numMaxi = num1;

        if (num2>numMaxi){
            numMaxi = num2;
        }
        if (num3>numMaxi){
            numMaxi = num3;
        }
        System.out.println("El numero mayor es: " + numMaxi);

        /*Ejercicio 3
        Escriba un programa que permita ingresar un número e identificar si es par o impar. */
        System.out.println("Ingrese un numero entero: ");
        int numUsuario = scanner.nextInt();
        if (numUsuario%2==0){
            System.out.println( numUsuario + ",Es un Numero Par");
        }else{
            System.out.println(numUsuario + "es Impar");
        }

        /*Ejercicio 4
        Escriba un programa que permita ingresar una letra e identifique si la letra es mayúscula o minúscula. */




        scanner.close();

    }
    
}
