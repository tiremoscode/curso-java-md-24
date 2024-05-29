# Usa la imagen oficial de MySQL
FROM mysql:latest

# Establece la contraseña del usuario root
ENV MYSQL_ROOT_PASSWORD=lulu

# Expone el puerto 3306
EXPOSE 3306

# Comando para ejecutar MySQL
CMD ["mysqld"]