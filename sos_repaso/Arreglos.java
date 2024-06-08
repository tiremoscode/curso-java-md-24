package sos_repaso;

public class Arreglos {
    public static void main(String args[]) {
        /// Crear nuestro arreglo
        // de enteros
        // con un tamaño inicial de 5 posociones.
        int[] numeros = new int[5];

        // Asignar valores al arreglo.
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        // Imprimir los valores del arreglo de números.
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("indice " + i + " tiene en su valor: " + numeros[i]);
        }

        // Strings
        String[] alumnasC3 = { "Brenda", "Clara Itzel", "Diana", "Ana", "Elizabeth" };

        for (int i = 0; i < alumnasC3.length; i++) {
            System.out.println("Nombre en el indice " + i + " : " + alumnasC3[i]);
        }

        // Ejemplo.
        // Calificaciones que voy obteniendo
        // durante un semestre
        // Saber cual es mi promedio de calificación

        double[] calificaciones = { 78.5, 87.0, 90.0, 100.0, 65.0 };

        double suma = 0.0;
        for (int i = 0; i < calificaciones.length; i++) {
            suma += calificaciones[i];
        }

        double promedio = suma / calificaciones.length;

        // System.out.println("El promedio de mi calificaciones es " + promedio);
        if (promedio >= 70.0) {
            System.out.println("Haz aprobado el curso " + promedio);
        } else {
            System.out.println("Haz reprobado el curso, tu caloficación es: " + promedio);
        }

        if (promedio == 100.0) {
            System.out.println("Felicidades, eres u master");
        } else if (promedio >= 90) {
            System.out.println("Estuviste cerca del 100");
        } else if (promedio >= 80) {
            System.out.println("Bien, pero puedes mejorar");
        } else if (promedio >= 70) {
            System.out.println("Aprobaste, pero puedes mejorar");
        } else {
            System.out.println("Reprobaste, necesitas estudiar más");
        }

        // Arreglo, saber cual de estos numeros
        // es el más grande
    }
}
