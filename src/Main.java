import java.util.Scanner;

@SuppressWarnings({"ConvertToBasicLatin", "SpellCheckingInspection"})
public class Main {
    public static void main(String[] args) {

        // TODO: # Fundamentos de Programación
        //1. Calcular el área de un triángulo.
        //2. Ingresar dos números por la consola y sumarlos.
        //3. Ingresar un número y visualizar el número elevado al cuadrado.
        //4. Escribir un programa que convierta de euros a dólares.
        //5. Escribir un programa que pida el lado de un cuadrado y calcule el valor del área y del perímetro.
        //6. Escribir un programa que determine el área y el volúmen de un cilindro.
        //7. Escribir un programa que lea el radio de una circunferencia y calcule la longitud de la misma y el área del
        //   círculo inscrito.
        //8. Calcular el promedio de tres (3) números ingresados por teclado.


        //TODO:  1.Calcular el área de un triángulo.

        // ENTRADA

        Scanner entrada = new Scanner(System.in);

        System.out.println("Calcular el área de un triangulo \n Ingresar la base del triángulo: ");

        double base = entrada.nextDouble();

        System.out.println("Ingresar la altura del triángulo: ");

        double altura = entrada.nextDouble();

        // PROCESO

        double area = (base*altura)/2;

        //SALIDA

        System.out.println("El área del triángulo es: " + area +  "m²");


        System.out.println("\n*******************************************************\n");


// TODO: 2.INGRESAR DOS NUMEROS POR TECLADO Y SUMARLO

        //ENTRADA

        double num1 = 0 , num2 = 0 , resultado = 0 ;


        System.out.println("Suma de números \n Introduce el primer número: ");

        num1 = entrada.nextDouble();

        System.out.println("Introduce el segungo número: ");

        num2 = entrada.nextDouble();

        //PROCESO

        resultado = num1+num2;

        //SALIDA

        System.out.printf("El resultado de la suma es:   " + resultado);


        System.out.println("\n ************************************************************* \n");


        // TODO: 3.Ingresar un número y visualizar el número elevado al cuadrado.


        //ENTRADA


        System.out.println("Elevación de números al cuadrado \n Ingrese el número: ");

        double num3 = entrada.nextDouble( );


        //PROCESO

        double cuadrado = (num3 * num3);

        //SALIDA

        System.out.println("El número al cuadrado es: " + cuadrado);


        System.out.println("\n********************************************\n");


        // TODO: 4. Escribir un programa que convierta de euros a dólares

        // ENTRADA
        System.out.println("Convertidor de euros a dólares \n Inserte un valor: ");

        double euro = entrada.nextDouble();

        double dolar = 1.07;

        // PROCESO

        double cambio = euro*dolar;

        //SALIDA

        System.out.println("El valor de cambio a dólares es: " + cambio + "US$");


        System.out.println("\n********************************************\n");

        // TODO: 5.Escribir un programa que pida el lado de un cuadrado y calcule el valor del área y del perímetro.

        //ENTRADA

        System.out.println("Determine el área y el perímetro de un cuadrado \n Ingrese uno de los lados del cuadrado: ") ;

        double lado = entrada.nextDouble();

        //PROCESO

        double areadelcuadrado = lado * lado;
        double perimetro = lado + lado + lado + lado;

        //SALIDA

        System.out.println("El resultado del área calculada es: " + areadelcuadrado);
        System.out.println("El resultado del perímetro es: " + perimetro);


        System.out.println("\n***************************************************\n");


        // TODO: 6.Escribir un programa que determine el área y el volúmen de un cilindro.

        //entrada

        System.out.println("Calcular el área y el volumen de un cilindro \n Ingrese el número de la  base del cilindro: ");

        double baseCilindro  = entrada.nextDouble();

        System.out.println("Ingrese el número de altura del cilindro: ");

        double alturacilindro = entrada.nextDouble();

        //proceso

        double areacilindro = 2 * 3.1416*baseCilindro*(baseCilindro+alturacilindro);
        double volumencilindro = 3.1416 *(baseCilindro*baseCilindro)*alturacilindro;

        //SALIDA

        System.out.println("El área del cilindro es: " + areacilindro + " cm²" );
        System.out.println("El volumen del cilindro es: " + volumencilindro +  "cm³" );



        System.out.println( "\n ************************************* \n" );

        // TODO: 7. Escribir un programa que lea el radio de una circunferencia y calcule la longitud de la misma y el área del círculo inscrito.


        //ENYRADAS

        System.out.println("Calcule la longitud y el área de un círculo \n Ingrese el radio de una circunferencia: ");

        double circuferencia = entrada.nextDouble();


        //PROCESO

        double longitud = 2 * 3.1416 * circuferencia;
        double areacirculoinscrito = 3.1416 *(circuferencia*circuferencia);

        //SALISA

        System.out.println("La longitud de una circunferencia es: " + longitud);
        System.out.println("El área del círculo es: " + areacirculoinscrito);




        System.out.println( "\n ************************************* \n" );


        // TODO: 8.Calcular el promedio de tres (3) números ingresados por teclado.


        // ENTRADA

        System.out.println( "Calcular el promedio de 3 números \n Ingrese el primer número: ");

        double num5 = entrada.nextDouble();

        System.out.println( "Ingrese el segundo número: ");

        double num6 = entrada.nextDouble();

        System.out.println( "Ingrese el tercer número: ");

        double num7 = entrada.nextDouble();

        //PROCESO

        double promedio = (num5 + num6 + num7) / 3;

        //SALIDA

        System.out.println("El promedio de los tres números es: " + promedio );


    }
}