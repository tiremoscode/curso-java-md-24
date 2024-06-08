## 🚀 Pasos para ejecutar Sephorita

1.- Ingresar a la consola de base de datos para crear nuestra tabla.

```bash
mysql -u root -p
```

2.- Crear nuestra base de datos

```sql
CREATE DATABASE sephorita;
```

3.- Utilizar nuestra base de datos

```sql
use sephorita;
```

4.- Crear una tabla Productos con los siguientes datos:

```sql
CREATE TABLE alumnas (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombreProducto VARCHAR(60),
    marca VARCHAR(50),
    presentacion VARCHAR(50),
    precio int(5)
);
```

5.- Insertar algunos registros

```sql
INSERT INTO productos (nombreProducto, marca, presentacion, precio) VALUES
('Kit Garnier', 'Garnier', '250 ml',541);
```

6.- Compilar nuestra clase haciendo uso de la librería mysql-connnector.

## Windows

```bash
javac -cp "sos_repaso/lib/*;." sos_repaso/Sephorita.java
```

## MacOS / Linux

```bash
javac -cp "sos_repaso/lib/*" sos_repaso/Sephorita.java
```

7.- Ejecutar nuestro proyecto

## Windows

```bash
java -cp "sos_repaso/lib/*;." sos_repaso.Sephorita
```

## MacOS / Linux

```bash
java -cp "sos_repaso/lib/*:." sos_repaso.Sephorita
```
