class Calculadora {
    public static int sumar(int a, int b) {
        return a + b;
    }
}

public class Static2 {
    public static void main(String args[]) {

        // Métodos estaticos
        // Un método estatico pertenece a la clase y no puede acceder directamente a
        // miembros
        // no estáticos (Variables de instancia y métodos no estáticos.
        // Se puede llamar sin crear como tal una instancia de la clase.

        int resultado = Calculadora.sumar(5, 3);
        System.out.println("Sumar 5 +3 es igual a " + resultado);
    }
}
