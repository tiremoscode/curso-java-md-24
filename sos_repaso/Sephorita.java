package sos_repaso;

import java.sql.*;

public class Sephorita {

    // CRUD
    // Sistema de Altas, Bajas, Cambios y Modificaciones
    // Create - Crea un nuevo Registro
    // Read - Lee un registro existente
    // Update - Actualiza un registro existente
    // Delete - Elimina un registro existente

    private static String url = "jdbc:mysql://localhost:3306/sephorita";
    private static String usuario = "root";
    private static String password = "buttons";

    public void eliminarProducto(int id) {
        String queryEliminarProducto = "DELETE FROM productos WHERE id = ?";

        try (Connection connection = DriverManager.getConnection(url, usuario, password);
                PreparedStatement preparedStatement = connection.prepareStatement(queryEliminarProducto)) {
            preparedStatement.setInt(1, id);
            int registrosEliminados = preparedStatement.executeUpdate();
            System.out.println("Registros eliminados: " + registrosEliminados);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void actualizarProducto(int id, String nombreProducto, String marca, String presentacion, int precio) {
        String queryActualizarProducto = "UPDATE productos SET nombreProducto = ?, marca = ?, presentacion = ?, precio = ? WHERE id = ?";

        try (Connection connection = DriverManager.getConnection(url, usuario, password);
                PreparedStatement preparedStatement = connection.prepareStatement(queryActualizarProducto)) {
            preparedStatement.setString(1, nombreProducto);
            preparedStatement.setString(2, marca);
            preparedStatement.setString(3, presentacion);
            preparedStatement.setInt(4, precio);
            preparedStatement.setInt(5, id);

            int registrosActualizados = preparedStatement.executeUpdate();
            System.out.println("Registros actualizados: " + registrosActualizados);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void crearProducto(String nombreProducto, String marca, String presentacion, int precio) {
        String queryInsertar = "INSERT INTO productos (nombreProducto, marca, presentacion, precio) VALUES (?, ?, ?, ?)";
        try (Connection connection = DriverManager.getConnection(url, usuario, password);
                PreparedStatement preparedStatement = connection.prepareStatement(queryInsertar)) {
            preparedStatement.setString(1, nombreProducto);
            preparedStatement.setString(2, marca);
            preparedStatement.setString(3, presentacion);
            preparedStatement.setInt(4, precio);

            int registrosInsertados = preparedStatement.executeUpdate();
            System.out.println("Registros insertados: " + registrosInsertados);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void obtenerProductos() {
        String query = "SELECT * FROM productos";

        try (Connection connection = DriverManager.getConnection(url, usuario, password);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nombreProducto = resultSet.getString("nombreProducto");
                String marca = resultSet.getString("marca");
                String presentacion = resultSet.getString("presentacion");
                int precio = resultSet.getInt("precio");

                System.out.println("ID: " + id + " Nombre del producto: " + nombreProducto + " Marca: " + marca
                        + " Presentación: " + presentacion + " Precio: " + precio);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {

        int accionTienda = 1;

        Sephorita miTiendita = new Sephorita();

        // Datos para insertar
        String nombreNuevoProducto = "Exfoliante";
        String marcaNuevoProducto = "The Ordinary";
        String presentacionNuevoProducto = "200 ml";
        int precioNuevoProducto = 850;

        // Datos para actualizar
        int idActualizarProducto = 4;
        String nombreProductoActualizar = "Exfoliante";
        String marcaProductoActualizar = "The Ordinary México";
        String presentacionProductoActualizar = "100 ml";
        int precioActualizarProducto = 420;

        // Producto a eliminar
        int idProductoEliminar = 1;

        switch (accionTienda) {
            case 1:
                miTiendita.obtenerProductos();
                break;
            case 2:
                miTiendita.crearProducto(nombreNuevoProducto, marcaNuevoProducto, presentacionNuevoProducto,
                        precioNuevoProducto);
                break;
            case 3:
                /// Actualizar
                miTiendita.actualizarProducto(idActualizarProducto, nombreProductoActualizar, marcaProductoActualizar,
                        presentacionProductoActualizar, precioActualizarProducto);
                break;
            case 4:
                // Eliminar
                miTiendita.eliminarProducto(idProductoEliminar);
                break;
        }
    }
}
