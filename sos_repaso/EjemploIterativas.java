package sos_repaso;

public class EjemploIterativas {
    public static void main(String args[]) {
        for (int i = 1; i <= 25; i++) {
            // Imprimir el valor de i
            System.out.print("El número es " + i + " es");

            // agregamos el valor de una condici´pon
            // para determinar si el número es par o es impar.

            if (i % 2 == 0) {
                System.out.println(" par");
            } else {
                System.out.println(" impar");
            }
        }
    }
}
