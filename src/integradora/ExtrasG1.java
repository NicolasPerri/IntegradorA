package integradora;
import java.util.Scanner;
public class ExtrasG1 {
    public static void calculo(){
    int numero;
    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingrese el Numero que desee Calcular en dias y horas ");
    numero=teclado.nextInt();
    int dias= numero /1440;
    int horas=(numero % 1440)/60;
    int minutos=(numero % 1440)%60;
        System.out.print("Días: "+dias+" dia,");
        System.out.print(" Horas: "+horas+" hs,");
        System.out.println(" Minutos: "+minutos+" min.");
    }
    public static void intercambio(){
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Ingrese los valores de A, B, C y D (separados por espacios):");
            int A = teclado.nextInt(), B = teclado.nextInt(), C = teclado.nextInt(), D = teclado.nextInt();
            System.out.println("Valores iniciales:");
            System.out.println("A: " + A + ", B: " + B + ", C: " + C + ", D: " + D);
            B ^= C ^= B ^= C;
            C ^= A ^= C ^= A;
            A ^= D ^= A ^= D;
            D ^= B ^= D ^= B;
            System.out.println("Valores finales:");
            System.out.println("A: " + A + ", B: " + B + ", C: " + C + ", D: " + D);
        }
    }
    public static void verificar(){
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Ingresa una letra: ");
            char letra = teclado.next().charAt(0);
            letra = Character.toLowerCase(letra);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                System.out.println(letra + " es una vocal.");
            } else {
                System.out.println(letra + " no es una vocal.");
            }
        }
    }
    public static void numeroRomano(){
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Ingresa un número entre 1 y 10: ");
            int numero = teclado.nextInt();
            String[] romanos = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
            String numeroRomano;
            if (numero >= 1 && numero <= 10) {
                numeroRomano = romanos[numero - 1];
                System.out.println("El número " + numero + " en números romanos es: " + numeroRomano);
            } else {
                System.out.println("Número inválido");
            }
        }
    }
    public static void obraSocial(){
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Ingrese la clase de socio (A, B o C): ");
            char tipoSocio = teclado.next().charAt(0);
            System.out.print("Ingrese el costo del tratamiento: ");
            double costoTratamiento = teclado.nextDouble();
            double descuento = tipoSocio == 'A' ? 0.5 : tipoSocio == 'B' ? 0.35 : tipoSocio == 'C' ? 0.2 : 0.0;
            double importeAPagar = costoTratamiento - (costoTratamiento * descuento);
            System.out.println("El importe a pagar por el socio es: " + importeAPagar);
        }
    }
    public static void calcularEstaturas(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de personas que desee calcular el Promedio: ");
        int cantidadPersonas = scanner.nextInt();
        double[] estaturas = new double[cantidadPersonas];
        double sumaEstaturas = 0;
        double sumaEstaturasBajo160 = 0;
        int contadorEstaturasBajo160 = 0;
        for (int i = 0; i < cantidadPersonas; i++) {
            System.out.print("Ingrese la estatura de una persona: ");
            double estatura = scanner.nextDouble();
            estaturas[i] = estatura;
            sumaEstaturas += estatura;
            if (estatura < 1.60) {
                sumaEstaturasBajo160 += estatura;
                contadorEstaturasBajo160++;
            }
        }
        double promedioEstaturas = sumaEstaturas / cantidadPersonas;
        double promedioEstaturasBajo160 = contadorEstaturasBajo160 > 0 ? sumaEstaturasBajo160 / contadorEstaturasBajo160 : 0;
        System.out.println("El promedio de estaturas es: " + promedioEstaturas);
        System.out.println("El promedio de estaturas por debajo de 1.60 mts es: " + promedioEstaturasBajo160);
    }
    public static void calcular() {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Ingrese la cantidad de números: ");
            int n = teclado.nextInt();
            int contador = 0;
            int numero;
            int minimo = Integer.MAX_VALUE;
            int maximo = Integer.MIN_VALUE;
            int suma = 0;
            System.out.println("Ingrese los números:");
                 /* Versión con bucle "while"
            while (contador < n) {
            numero = scanner.nextInt();
            minimo = Math.min(minimo, numero);
            maximo = Math.max(maximo, numero);
            suma += numero;
            contador++;
            }*/
            do { // Versión con bucle "do-while"
                numero = teclado.nextInt();    
                minimo = Math.min(minimo, numero);
                maximo = Math.max(maximo, numero);
                suma += numero;
                contador++;
            } while (contador < n);
            double promedio = (double) suma / n;
            System.out.println("Valor mínimo: " + minimo);
            System.out.println("Valor máximo: " + maximo);
            System.out.println("Promedio: " + promedio);
        }
    }
    public static void leerNumeros() {
        Scanner teclado = new Scanner(System.in);
        int cantidadNumeros = 0;
        int cantidadPares = 0;
        int cantidadImpares = 0;
        while (true) {
            System.out.println("Ingrese un número entero (0 para salir):");
            int numero = teclado.nextInt();
            if (numero == 0 || numero % 5 == 0) {
                break;
            }
            if (numero < 0) {
                continue;
            }
            cantidadNumeros++;
            cantidadPares += numero % 2 == 0 ? 1 : 0;
            cantidadImpares += numero % 2 != 0 ? 1 : 0;
        }
        System.out.println("Cantidad de números leídos: " + cantidadNumeros);
        System.out.println("Cantidad de números pares: " + cantidadPares);
        System.out.println("Cantidad de números impares: " + cantidadImpares);
    }
    public static void restasDivisoras(){
    int cociente = 0;
    int dividendo;
    int divisor;
    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingrese Un Dividendo");
    dividendo=teclado.nextInt();
    System.out.println("Ingese un divisor");
    divisor=teclado.nextInt();
    while (dividendo >= divisor) {
        dividendo -= divisor;
        cociente++;
    }
    System.out.println("Cociente: " + cociente);
    System.out.println("Residuo: " + dividendo);}
}
