package practicas.calculadora;

public class Calculadoradeclases {
    

        //Variables donde haré el calculo.

        int numero1 = 30;
        int numero2 = 50;  
            
        public static void main(String args []){

            //Variables donde haré el calculo.
            double numero1 = 30.0;
            double numero2 = 50.0;      
    
    
            // Suma
            double suma = numero1 + numero2;
            System.out.println("El valor de la suma "+suma);
           
        
            //Resta 
            double resta = numero1 - numero2;
            System.out.println("El valor de la resta" + resta);
            
           //Multiplicacion
           double multiplicacion = numero1 * numero2;
           System.out.println("El valor de la multiplicacion" + multiplicacion);
    
           //Division
           double division = numero1 / numero2; 
           System.out.println("El valor de la division" + division);
           
        }
    }