package ejerciciosClase.alumnas;

import java.sql.*;

public class Grupo24 {

    // Parámetros de conexión
    // JDBC
    private static String url = "jdbc:mysql://localhost:3306/grupo24";
    private static String usuario = "root";
    private static String password= "lulu";

    public void obtenerAlumnos(){
        String query = "SELECT * FROM alumnas";
        try (Connection connection = DriverManager.getConnection(url, usuario, password);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query)) {

            // Visualizar los resultados en consola.
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                int edad = resultSet.getInt("edad");
                System.out.println("ID: " + id + " Nombre: " + nombre + " Edad: " + edad);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }  
    }

    public static void main(String[] args) {
        Grupo24 operacionesBD = new Grupo24();

        // Obtener todos los registros de la base de datos.
        operacionesBD.obtenerAlumnos();
    }
}
