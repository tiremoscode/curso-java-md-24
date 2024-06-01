package sos_repaso;

public class Estructuras {
    public static void main(String args[]) {
        // Ir a Misa
        // Desayunar
        // Ir a votar
        // Ir al tour de cosas gratis
        // Estudiay cerrar mis cursos de Mujer Digital

        // Despertar
        // ES domingo
        boolean esDomingo = true;
        boolean irAMisa = true;
        boolean irDesayunar = true;
        boolean iraVotar = true;
        int edadVotante = 18;
        boolean estudiar = false;

        // if - Si esto pasa
        // else - si lo anterior no pasa
        if (esDomingo == true) {
            if (irAMisa == true) {
                System.out.println("Ir a Misa");
                if (irDesayunar == true) {
                    System.out.println("Voy por birria");
                    if (edadVotante >= 18) {
                        if (iraVotar == true) {
                            System.out.println("Voy a poder ir a Starbucks, cine por cosas gratis");
                            if (estudiar == true) {
                                System.out.println("Disfrutaré mi kisspiy kreme y mi pase a AWS");
                            } else {
                                System.out.println("Lloraremos en silencio, mientras como");
                            }
                        } else {
                            System.out.println("No recibiriee cosas gratgis pero debo estudiar");
                        }
                    } else {
                        System.out.println("Me perdere del tourGratis, pero puedo seguir estudiando");
                    }
                } else {
                    System.out.println("}no puedo hacer lo demás porque me desamyo");
                }
            } else {
                System.out.println("No puedo ir a misa");
            }
        } else {
            System.out.println("Aun no es domingo, pero puedo sweguir estudiando mis cursos");
        }
    }
}
