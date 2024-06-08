package sos_repaso;

import java.util.Scanner;

public class IterativasDoWhile {
    public static void main(String args[]) {

        // do while
        int x = 0;
        do {
            System.out.println("El valor de x es: " + x);
            x++;
        } while (x < 5);

        // Ejemplo.

        Scanner scanner = new Scanner(System.in);
        String passwordCorrecta = "buttons";
        String passwordUsuario;

        do {
            System.out.println("Ingresa tu contraseña");
            passwordUsuario = scanner.nextLine();
        } while(!passwordUsuario.equals(passwordCorrecta));

        System.out.println("¡Contraseña correcta!, no pagas Pizza");
        scanner.close();

    }
}
