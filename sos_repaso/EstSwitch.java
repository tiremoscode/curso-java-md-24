package sos_repaso;

public class EstSwitch {
    public static void main(String args[]){
        int diaSemana = 5;
        String dia = "lunes";

        switch (dia){
            case "lunes":
                System.out.println("Empieza la semana");
            break; 
            case "viernes":
            System.out.println("Dia de kittychelas");
            break;
            default:
            System.out.println("ES cualquier otro dia");
            break;
        }

        switch (diaSemana){
            case 1:
                System.out.println("Lunes, que odia Garfield");
                break;
            case 2: 
            System.out.println("Martes de frescura");
            break;
            case 3:

            System.out.println("Miércoles de Plaza");
            break;
            case 4:
            System.out.println("Jueves de pozole");
            break;
            case 5:
            System.out.println("Viernes y el cuerpo lo sabe");
            break;
            default:
            System.out.println("Es sábado y domingo de flojera y estudiar"); 
            break;
        }
    }
}
