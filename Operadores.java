public class Operadores {
    public static void main(String[] args) {
        // Operador AND (&&)
        boolean resultado = (5 > 3) && (8 > 5);
        System.out.println("Resultado AND: " + resultado);

        boolean resultado2 = (5 > 10 ) && (8 > 5);
        System.out.println("Resultado AND 2: " + resultado2);
        
        //Operador OR ||
        boolean resultado3 = (5 > 3) || (8 < 10);
        System.out.println("Resultado OR: " + resultado3);

        boolean resultad4 = (5 < 3) || (8 < 10);
        System.out.println("Resultado OR 2: " + resultad4);
        
        // Operador NOT (!)
        boolean esVerdadero = true;
        boolean cambioEsVerdadero = !esVerdadero;
        
        System.out.println("Es verdadero: " + esVerdadero);
        System.out.println("Cambio es verdadero: " + cambioEsVerdadero);
    }
}
