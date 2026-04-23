# Imagen
FROM python:3.9-slim

# Direcotior
WORKDIR /app

# Entorno
ENV APP_MODE="Production"

# Contenido
COPY app.py .

# Crear carpeta "/data"
RUN mkdir data

# Ejecutar app.py
CMD ["app.py"]

# Para crearlo seria con docker build -t securcor/
