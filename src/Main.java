import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.util.Random;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        leerYMostrarEntero();
        decimalPositivoNegativo();
        parImpar();
        parPositivoNegativo();
        calcularEdad();
        operadorTelefono();
        intercambiarNumeros();
        numeroAleatorio();
        generacionPorEdad();
        ivaConDescuento();
    }


    public static void leerYMostrarEntero() {
        System.out.println("Ingrese un numero entero:");
        int numero = sc.nextInt();
        System.out.println("El numero es: " + numero);
    }


    public static void decimalPositivoNegativo() {
        System.out.println("Ingrese un numero decimal:");
        double numero = sc.nextDouble();

        if (numero > 0) {
            System.out.println("El numero es positivo");
        } else if (numero < 0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es cero");
        }
    }


    public static void parImpar() {
        System.out.println("Ingrese un numero entero:");
        int numero = sc.nextInt();
        int resto = numero % 2;

        if (resto == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }


    public static void parPositivoNegativo() {
        System.out.println("Ingrese un numero entero:");
        int numero = sc.nextInt();
        int resto = numero % 2;

        if (resto == 0) {

            if (numero >= 0) {
                System.out.println("Par-positivo");
            } else {
                System.out.println("Par-negativo");
            }
        } else {

            if (numero >= 0) {
                System.out.println("Impar-positivo");
            } else {
                System.out.println("Impar-negativo");
            }
        }
    }


    public static void calcularEdad() {
        System.out.println("Ingrese el año de nacimiento:");
        int anio = sc.nextInt();
        System.out.println("Ingrese el mes de nacimiento:");
        int mes = sc.nextInt();
        System.out.println("Ingrese el dia de nacimiento:");
        int dia = sc.nextInt();

        LocalDate nacimiento = LocalDate.of(anio, mes, dia);
        LocalDate hoy = LocalDate.now();
        int edad = Period.between(nacimiento, hoy).getYears();

        System.out.println("La persona tiene " + edad + " años");
    }


    public static void operadorTelefono() {
        System.out.println("Ingrese un numero de telefono (10 digitos):");
        String numero = sc.next();
        String prefijo = numero.substring(0, 3);


        if (prefijo.equals("300") || prefijo.equals("301") || prefijo.equals("302")) {
            System.out.println("Operador: Movistar");
        } else if (prefijo.equals("310") || prefijo.equals("311") || prefijo.equals("312")) {
            System.out.println("Operador: Tigo");
        } else if (prefijo.equals("320") || prefijo.equals("321") || prefijo.equals("322")) {
            System.out.println("Operador: Claro");
        } else {
            System.out.println("Operador desconocido");
        }
    }


    public static void intercambiarNumeros() {
        System.out.println("Ingrese el primer numero:");
        int a = sc.nextInt();
        System.out.println("Ingrese el segundo numero:");
        int b = sc.nextInt();

        System.out.println("Antes: a=" + a + " b=" + b);

        int temporal = a;
        a = b;
        b = temporal;

        System.out.println("Despues: a=" + a + " b=" + b);
    }


    public static void numeroAleatorio() {
        Random rand = new Random();
        int numero = rand.nextInt(21) + 50; // 21 = (70 - 50) + 1 opciones
        System.out.println("Numero aleatorio generado: " + numero);
    }


    public static void generacionPorEdad() {
        System.out.println("Ingrese la edad en años:");
        int edad = sc.nextInt();

        if (edad >= 0 && edad <= 3) {
            System.out.println("Bebe");
        } else if (edad >= 4 && edad <= 8) {
            System.out.println("Nino");
        } else if (edad >= 13 && edad <= 17) {
            System.out.println("Adolescente");
        } else if (edad > 17) {
            System.out.println("Adulto");
        } else {

            System.out.println("Rango no esta definido en la tabla (9 a 12 años)");
        }
    }


    public static void ivaConDescuento() {
        System.out.println("Ingrese el valor de la venta:");
        double venta = sc.nextDouble();

        double descuento;
        if (venta > 150000) {
            descuento = venta * 0.25;
        } else {
            descuento = venta * 0.10;
        }

        double totalConDescuento = venta - descuento;
        double iva = totalConDescuento * 0.19; // IVA en Colombia: 19%

        System.out.println("Descuento aplicado: " + descuento);
        System.out.println("Valor con descuento: " + totalConDescuento);
        System.out.println("IVA: " + iva);
    }
}






