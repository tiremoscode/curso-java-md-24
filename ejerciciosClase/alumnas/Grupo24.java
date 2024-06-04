package ejerciciosClase.alumnas;

import java.sql.*;
import java.util.Scanner;

public class Grupo24 {

    // Parámetros de conexión
    // JDBC
    private static String url = "jdbc:mysql://localhost:3306/grupo24";
    private static String usuario = "root";
    private static String password = "buttons";

    public void obtenerAlumnos() {
        String query = "SELECT * FROM alumnas";
        try (Connection connection = DriverManager.getConnection(url, usuario, password);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query)) {

            // Visualizar los resultados en consola.
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                int edad = resultSet.getInt("edad");
                System.out.println("* ID: " + id + " Nombre: " + nombre + " Edad: " + edad);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void guardarAlumna(String nombre, int edad) {
        String queryInsertar = "INSERT INTO alumnas (nombre, edad) VALUES (?, ?)";
        try (Connection connection = DriverManager.getConnection(url, usuario, password);
                PreparedStatement preparedStatement = connection.prepareStatement(queryInsertar)) {
            preparedStatement.setString(1, nombre);
            preparedStatement.setInt(2, edad);

            int registrosInsertados = preparedStatement.executeUpdate();
            System.out.println("Registros insertados: " + registrosInsertados);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Grupo24 operacionesBD = new Grupo24();

        // Scanner
        Scanner scanner = new Scanner(System.in);

        try {
            // Seleccionar una opción.
            System.out.println(
                    "Ingresa una opción. \n1.- Muestra todos los alumnos.\n2.- Insertar un nuevo Alumno\n3.- Actualizar un Alumno\n4.- Eliminar un Alumno");
            int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("*** Mostrar todos los alumnos ***");
                    operacionesBD.obtenerAlumnos();
                    break;
                case 2:
                    System.out.println("*** Insertar un nuevo alumno ***");
                    scanner.nextLine();
                    System.out.println("Ingresa el nombre del alumno: ");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingresa la edad del alumno: ");
                    int edad = scanner.nextInt();
                    guardarAlumna(nombre, edad);
                    break;
                case 3:
                    System.out.println("*** Actualizar un alumno ***");
                    break;
                case 4:
                    System.out.println("*** Eliminar un alumno ***");
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }

    }
}
