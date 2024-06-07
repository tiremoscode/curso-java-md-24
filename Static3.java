class Utilidades {
    // Calcular el IVA de una cantidad y
    // me va a devolver el costo con iva incluido.

    public static double calcularCostoIVA(double subTotal) {
        double iva = 0.20;
        return subTotal + (subTotal * iva);
    }
}

public class Static3 {
    public static void main(String args[]) {
        double subTotal = 100;
        double costoConIVA = Utilidades.calcularCostoIVA(subTotal);
        System.out.println("El costo sin IVA es: " + subTotal);
        System.out.println("El costo con IVA es: " + costoConIVA);
    }
}
