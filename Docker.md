## Instalación y Uso de Docker

Fuente: https://www.youtube.com/watch?v=_et7H0EQ8fY

## Instrucciones

1. Construir la imagen de Docker con el siguiente comando:

```bash
docker build -t miserver-mysql-24 .
```

2.- Ejecutar un contenedor con la imagen recién construida:

```bash
docker run -d -p 3306:3306 --name mysql-server-24 miserver-mysql-24
```

3.- Validar que el contenedor haya iniciado correctamente

```bash
docker ps
```

4.- Ingresar a la consola del contenedor de MySQL.

```bash
docker exec -it mysql-server-24 bash
```

5.- Ingresar a la consola de base de datos para crear nuestra tabla.

```bash
mysql -u root -p
```

6.- Crear nuestra base de datos

```sql
CREATE DATABASE grupo24;
```

7.- Utilizar nuestra base de datos

```sql
use grupo24;
```

8.- Crear una tabla Alumnas con los siguientes datos:

```sql
CREATE TABLE alumnas (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(60),
    edad int(2)
);
```

9.- Insertar algunos registros

```sql
INSERT INTO alumnas (nombre, edad) VALUES
('Jessica Silva', 28),
('Dulce Gallardo', 29);
```

10.- Descargar previamente el MySQL-Connector desde esta [url](https://dev.mysql.com/downloads/connector/j/).

11.- Compilar nuestra clase haciendo uso de la librería.

```bash
javac -cp "ejerciciosClase/alumnas/lib/*" ejerciciosClase/alumnas/Grupo24.java
```

12.- Ejecutar nuestro proyecto

```bash
java -cp "ejerciciosClase/alumnas/lib/*:." ejerciciosClase.alumnas.Grupo24
```
