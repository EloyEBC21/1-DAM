FROM ubuntu:latest

# 1. Instalación de paquetes
RUN apt update && apt install apache2 webalizer cron -y

# 2. Configuración de puertos (Sobrescribimos el original para evitar duplicados)
COPY config/ports.conf /etc/apache2/ports.conf

# 3. Copia de sitios y contraseñas
COPY config/*.conf /etc/apache2/sites-available/
COPY config/.htpasswd_jamonespepe /etc/apache2/.htpasswd_jamonespepe

# 4. Limpieza y Activación
# Desactivamos el sitio por defecto de Ubuntu para que no choque con el tuyo del puerto 80
RUN a2dissite 000-default.conf

# Activamos TUS sitios (IMPORTANTE: No activar ports.conf aquí)
RUN a2ensite fallaslasenia.conf jamonespepe.conf solticpaiporta.conf

# Activamos módulos necesarios
RUN a2enmod ssl rewrite

EXPOSE 80
EXPOSE 8085
EXPOSE 8090

# 5. Lanzamos en primer plano
CMD ["apachectl", "-D", "FOREGROUND"]