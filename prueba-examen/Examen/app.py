# Importamos librerías nativas de Python. 
# Al ser nativas, no necesitamos 'pip install' ni internet en el Dockerfile.
import os
import time
import sys

# Leemos variable de entorno
# Usamos os.getenv para leer una configuración desde fuera del código.
# 'APP_MODE' es la variable que definiremos en el Dockerfile (ENV) o docker-compose (environment).
# Si olvidamos ponerla, el programa usará el valor por defecto 'Review'
app_mode = os.getenv('APP_MODE', 'Review')

# Todo lo que se imprime con 'print' sale por la consola estándar
# En Docker, esto se captura y se puede ver con el comando: $ docker logs <contenedor>
print(f"Iniciando Audit-Worker en modo: {app_mode}")
print(f"Version de Python: {sys.version}")

# Un contenedor se apaga automáticamente si su proceso principal termina
# Usamos un 'while True' (bucle infinito) para mantener el contenedor encendido (Status: Up).
while True:
    try:
        # El script intenta escribir en la carpeta /data dentro del contenedor.
        # Si NO se monta un volumen en /data, este archivo desaparecerá al borrar el contenedor.
        # Si se monta un volumen, el archivo persistirá en el host.
        ruta_logs = "/data/audit.log"
        
        # Abrimos el fichero en modo 'a' (append) para añadir líneas sin borrar las anteriores
        with open(ruta_logs, "a") as f:
            mensaje = f"Procesando datos en modo {app_mode} - {time.ctime()}\n"
            f.write(mensaje)
            
            # Imprimimos también en pantalla para confirmar que funciona al ver los logs
            print(f"[LOG GENERADO]: {mensaje.strip()}")

    except FileNotFoundError:
        # Esto ocurre si el alumno no creó la carpeta /data en el Dockerfile
        print("ERROR CRÍTICO: No existe el directorio /data dentro del contenedor.")

    # Dormimos el proceso 10 segundos para simular trabajo y no saturar la CPU
    time.sleep(10)