class Animal {
    void hacerSonido() {
        System.out.println("Todos los animales, hacen un sonido");
    }
}

class Perro extends Animal {
    void ladrar() {
        System.out.println("Guau!!!");
    }
}

class Gato extends Animal {
    void maullar() {
        System.out.println("Miau!!!");
    }
}

public class Casteo {
    public static void main(String args[]) {
        // Upcasting Normal
        // Animal miAnimal = new Perro();
        // miAnimal.hacerSonido();

        // Upcasting a un gato
        Animal miAnimal = new Gato();

        // DownCasting
        if (miAnimal instanceof Perro) {
            // DownCasting seguro
            Perro miPerro = (Perro) miAnimal;
            miPerro.ladrar();
        } else {
            System.out.println("El objeto no es de tipo Perro");
        }
    }
}
