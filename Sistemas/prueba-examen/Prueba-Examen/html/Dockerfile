# Recordatorio, en alpine se usa 
# "apk" en vez de "apt"
# "add" en vez de "install"

# De donde cojer la imagen 
FROM alpine:latest

# Directorio dentro del contenedor
WORKDIR /app

# Ejecutar al iniciar el contenedor
RUN apk update && apk add --no-cache bash netcat-openbsd apache2

# Copia archivos de la maquina real al contenedor
COPY html/index.html /var/www/localhost/htdocs/index.html
COPY sensor.sh .

RUN chmod +x sensor.sh

# Declara por que puerto va a salir
EXPOSE 8080

# Es como el CMD pero con prioridad
ENTRYPOINT ["./sensor.sh"]

# Cuando el contenedor arranca, ejecuta esta linea de comando. SIEMPRE tiene que ir '["",""]'
CMD ["httpd", "-D", "FOREGROUND"]
