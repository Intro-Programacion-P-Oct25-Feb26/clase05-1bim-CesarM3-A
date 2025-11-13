/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo6;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Ejemplo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        String apellido;
        String usuario;
        int edad;
        String parroquia;
        int dia;
        double pago = 25;
        double descuento;
        double pagot;

        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();

        System.out.println("Ingrese su apellido");
        apellido = entrada.nextLine();

        System.out.println("Ingrese su usuario");
        usuario = entrada.nextLine();

        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Ingrese su parroquia");
        parroquia = entrada.nextLine();

        System.out.println("Ingrese el dia de pago");
        dia = entrada.nextInt();

        if ((dia < 10) && (parroquia.equals("El Valle")
                || parroquia.equals("El Sagrario"))) {

            descuento = pago * 0.05;
            pagot = pago - descuento;

            System.out.printf("\n\nPor realizar el pago "
                    + "antes del 10 de cada mes \n"
                    + "Recibe un descuento del 5%% entonces su "
                    + "pago a cancelar es:\n"
                    + "$%.2f", pagot);
            
            System.out.printf("\n\n------Factura cliente------\n\n"
                + "Nombres del cliente: %s %s\nUsuario del cliente: %s\n"
                + "Edad del cleinte: %s\nParroquia: %s\nDía de pago: %s\n"
                + "\nTotal a cancelar: $%.2f", nombre, apellido, usuario, 
                edad, parroquia, dia, pagot);
        }else {
            System.out.printf("\n\nSu valor a cancelar el mes es: \n"
                    + "$%.2f", pago);
            
            System.out.printf("\n\n------Factura cliente------\n\n"
                + "Nombres del cliente: %s %s\nUsuario del cliente: %s\n"
                + "Edad del cleinte: %s\nParroquia: %s\nDía de pago: %s\n"
                + "\nTotal a cancelar: $%.2f", nombre, apellido, usuario, 
                edad, parroquia, dia, pago);
        }
        
    }

}
