    import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        /*Operador terniario */
        /*resultado = (condicion) ? valor1 : valor2;*/

        /*TIPO_DE_VARIABLE NOMBRE_VARIABLE = (CONDICION ) ? VALOR_SI_ES_VERDADERO : VALOR_SI_ES_FALSO */

        int numero1 = 9;
        int numero2 = 10;
        int ValorMayor = (numero1<numero2) ? numero2 : numero1;
        System.out.println("El valor mayor es: " + ValorMayor);

        int numero3 = 27;
        String mensaje = (numero3%2 == 0) ? "par" : "impar";
        System.out.println("el numero es: " +mensaje);

        /*if else */

        String mensaje2 ="";

        Scanner scaner = new Scanner(System.in);

        if(mensaje2.isEmpty()){
            System.out.println("No escribiste nada por favor escribe algo");
        }
        else{
            System.out.println("Escribiste: " + mensaje2);
        }

        /*swicht*/
        
       
        System.out.println("Ingrese un color: ");
        String color = scaner.nextLine();

        switch(color){
            case "verde":
                System.out.println("El color verde es muy bonito simboliza la esperanza");
                break;
            case "rojo":
                System.out.println("El color rojo simboliza la pasion");
                break;

            case "azul":
                System.out.println("El color azul simboliza la tranquilidad se complementa con el blanco");
            case "blanco":
                System.out.println("El color blanco simboliza la paz");
                break;
            case "amarillo":
                System.out.println("El color amarillo simboliza la alegria");
                break;
            case "negro":
                System.out.println("el negro es color enigmatico, no lo crees?");
                break;
            default: 
                System.out.println("Lo siento no contemplamos este color");
                break;
            
        }


        System.out.println("Como te llamas: ");
        String Nombre = scaner.nextLine();
        String DatoDeNombre = switch(Nombre){

            case "juan", "santiago" -> "eres una gran persona";
            case "pedro"-> "sos un apostol";
            case "samuel"->"creo te conosco";
            case "steven"-> "hey sos yo";
            case "jaider"-> "o yo soy tu jajajja";
            default ->"lo siento son muchos nombre no tenemos el tuyp, cambia de nombre xD";
            
        };
        System.out.println(DatoDeNombre);

        int dia = 5;
        String tipoDia = switch (dia) {
            case 1, 2, 3, 4, 5 -> {
                System.out.println("Día laborable");
                yield "Laborable";
            }
            case 6, 7 -> {
                System.out.println("Fin de semana");
                yield "Fin de semana";
            }
            default -> "Día no válido";
        };
        System.out.println("El día es: " + tipoDia);

        /*Estrutura de repiticion de siclos  */

        int Contador = 6;
        while(Contador > 0){
            System.out.println("Despegue en : "+ Contador);
            Contador--;
        }
        System.out.println("¡DESPEGUE!");


        var numero5 = 5;/*4 3   2    1*/
        var numero6 = 1;/*5 20  60   120*/
        while(numero5>1){
            numero6 *= numero5;

            numero5--;
        }
        System.out.println("El resultado de la multiplicacion es: " + numero6);


        /*do while */
        String usuarioresgistrado = "jaider";
        String passworregistrado = "1234";
        String usuario;
        String Passwor;
        String confirmacion;

        
        
            do {

                System.out.println("Desesas ingresar al sistema? si/no: ");
                confirmacion = scaner.nextLine();

                if(confirmacion != "si" && confirmacion != "no"){
                    System.out.println("Por favor ingrese una respuesta valida");
                }
                if (confirmacion.equals("si")) {

                System.out.println("Ingrese su usuario:");
                usuario = scaner.nextLine();
                System.out.println("Ingrese su contraseña: ");
                Passwor = scaner.nextLine();

                if(!(usuario.equals(usuarioresgistrado) && Passwor.equals(passworregistrado))){
                    System.out.println("contraseña o usuario incorrecto");}else{
                        System.out.println("Bienvenido al sistema");
                    }

                } else {
                    System.out.println("Gracias por visitarnos");
                    break;
                }

            } while (!(usuario.equals(usuarioresgistrado) && Passwor.equals(passworregistrado)));
            
            /*FOR */

            for(int Numero = 0; Numero <= 30; Numero++){
                if(Numero%2 == 0){
                    System.out.println("El numero: " + Numero + " es par");
                }else{
                    System.out.println("El numero: " + Numero + " es impar");
                }
                System.out.printf("%n");

            }
            System.out.println("Danos un numero y te damos la tabla de multiplicar: ");

            String input;
            double NumeroParaTabla = 0;
            boolean isValid = false;
            while (!isValid) {
                input = scaner.nextLine();
                try {
                    NumeroParaTabla = Double.parseDouble(input);
                    isValid = true;
                } catch (NumberFormatException e) {
                    System.out.println("Por favor ingrese un numero valido, " + e + "no es valido");
                }
            }


            System.out.println("Tablas de multiplicar del: " + NumeroParaTabla);
            
            /*breaK EN EL FOR */
           for( int i=0; i<12; i++){
                if(i==10){
                    break;
                }
                System.out.println(i + "x" + NumeroParaTabla+ "=" + i*NumeroParaTabla);
            }

            /*CONTINUE EN EL FOR SE SALTA LO QUE LE PONGAMOS  */
            /*SALTEMONOS TODOS LOS PARAS CONTANDO HASTA 11 */
            for(int x = 0; x<11; x++){
                if(x%2 == 0){
                    continue;
                }
                System.out.println(x);
            }
            /*Ejercicios
            Este programa cuenta cuántos números pares e impares hay entre el 1 y el 20. 
            Adicionalmente, imprime cada uno de los números pares que hay en el rango. */

            int CantidadPares = 0;
            int CantidadImpares = 0;

            for(int i=0; i<=20; i++){
                if(i%2 == 0){
                    if(i == 0){
                        continue;
                    }
                    CantidadPares += 1;
                }else{
                    CantidadImpares += 1;
                }
                
            }
            System.out.printf("Hay %d Numeros pares y %d numero impares del 1 al 20" , CantidadPares, CantidadImpares);
            System.out.println("Y SON LOS SIGUIENTES: ");
            System.out.println("PAR");
            for(int i=0; i<=20; i++){
                if(i%2 == 0){
                    if(i == 0){
                        continue;
                    }
                    System.out.println(i);
                }     
            }
            System.out.println("IMPAR");
            for(int i=0; i<=20; i++){   
                if(i%2 != 0){
                    System.out.println(i);
                     }
                }

            /*Este programa muestra un menú interactivo que permite al usuario seleccionar 
            una opción hasta que decida salir.*/
            int Opcion = 0;
            do{
            System.out.println("""
                    Menú elige una opcion:
                    1. Sumar dos números
                    2. Restar dos números
                    3. Multiplicar dos números
                    4. Dividir dos números
                    5. Salir
                    """);
            Opcion = scaner.nextInt();
            switch(Opcion){
                case 1->{
                    System.out.println("Ingrese el primer numero y Despues el segundo: ");
                    int num1 = scaner.nextInt();
                    int num2 = scaner.nextInt();
                    System.out.println("La suma de los numeros es: " + (num1+num2) );
                }
                case 2->{
                    System.out.println("Ingrese el primer numero y Despues el segundo: ");
                    int num1 = scaner.nextInt();
                    int num2 = scaner.nextInt();
                    System.out.println("La resta de los numeros es: " + (num1-num2) );
                }
                case 3->{
                    System.out.println("Ingrese el primer numero y Despues el segundo: ");
                    int num1 = scaner.nextInt();
                    int num2 = scaner.nextInt();
                    System.out.println("La multiplicacion de los numeros es: " + (num1*num2) );
                }
                case 4->{
                    System.out.println("Ingrese el primer numero y Despues el segundo: ");
                    int num1 = scaner.nextInt();
                    int num2 = scaner.nextInt();
                    System.out.println("La divicion de los numeros es: " + (num1/num2) );
                }
                case 5->{
                    System.out.printf("Gracias por usar nuestro programa %n");
                    break;
                }
                default ->{
                    System.out.println("Opcion no valida");
                }
            }
            }while(Opcion != 5);

            /*Este programa permite al usuario adivinar un número entre 1 y 100. 
            El número es generado aleatoriamente y le preguntará un número al usuario
            que adivine hasta que el usuario adivina correctamente. En el caso contrario, 
            le indicará si el numero dado es mayor o menor al numero a adivinar. */

            int NumeroAleatorio = (int)(Math.random()*100+1);
            int NumeroUsuario = 0;
            int Intentos = 1;
            System.out.printf("Quires jugar un juego no?, ni modo ya empezo adivina el numero entre 1 y 100, %ntienes 10 intentos");
            System.out.println("Ingresa un numero: ");
            do{
                NumeroUsuario = scaner.nextInt();
                if(NumeroAleatorio < NumeroUsuario){
                    System.out.println("Te pasaste el numero es menor,Intento " + (Intentos));
                    ++Intentos;
                }else if(NumeroAleatorio > NumeroUsuario){
                    System.out.println("Te quedaste corto el numero es mayor,Intento " + (Intentos));
                    ++Intentos;

                }else{
                    System.out.println("Felicidades adivinaste el numero, en el intento " + (Intentos));
                }
            }while (NumeroAleatorio != NumeroUsuario && Intentos <= 10);
             if (Intentos == 11) {
                System.out.println("Perdiste Por superar los 10 intentos");
            }

            



        scaner.close();
     
    }

    

}
