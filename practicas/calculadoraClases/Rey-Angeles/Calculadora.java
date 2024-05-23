package practicas.calculadoraClases.Calculadora.Rey-Angeles {
    public static void main(String args []) {
        // Variables donde haré el cálculo.
        double numero1 = 1.7;
        double numero2 = 9.3;      
        
        // Objeto:
        Operaciones op = new Operaciones();

        // Suma
        double suma = numero1 + numero2;
        System.out.println("Suma: " + suma);
        
        // Resta
        double resta = numero1 - numero2;
        System.out.println("Resta: " + resta);

        // Multiplicación
        double multiplicacion = numero1 * numero2;
        System.out.println("Multiplicación: " + multiplicacion);

        // División
        if (numero2 != 0) {
            double division = numero1 / numero2;
            System.out.println("División: " + division);
        } else {
            System.out.println("Error: División por cero.");
        }
    }
}
