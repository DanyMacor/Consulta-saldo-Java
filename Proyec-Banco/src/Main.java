import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nombre = "Tonny Stark";
        String tipoDeCuenta = "Corriente";
        double saldo = 2599.9;
        int opcion = 0;

        System.out.println("**************************");
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("El tipo de cueta es: " + tipoDeCuenta);
        System.out.println("Su saldo disponble es :" + saldo + "$");
        System.out.println("\n**************************");

        String menu = """
                *** Escriba el número de la opción deseada ***
                1-Consultar saldo
                2-Retirar
                3-Depositar
                4-Salir
                """;

        Scanner teclado = new Scanner(System.in);
        while (opcion !=4){
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("El saldo actualizado es: " + saldo + "$");
                    break;
                case 2:
                    System.out.println("¿Cúanto desea retirar");
                    double valorRetirar = teclado.nextDouble();
                    if (valorRetirar > saldo){
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo = saldo - valorRetirar;
                        System.out.println("El saldo actualizado es: " + saldo + "$");}
                    break;
                case 3:
                    System.out.println("¿Cúanto desea depositar");
                    double valorDepositar = teclado.nextDouble();
                    saldo +=  valorDepositar;
                    System.out.println("El saldo actualizado es: " + saldo + "$");
                    break;
                case 4:
                    System.out.println(":) Gracias por visitar nuestros servicios <3");
                    break;
                default:
                    System.out.println("Opción no valida");

            }
        }
    }
}