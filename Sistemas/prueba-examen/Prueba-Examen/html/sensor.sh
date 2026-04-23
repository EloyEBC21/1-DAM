#!/bin/sh

# Configuración Redis (Nombre del servicio en Docker Compose)
REDIS_HOST="cache"
REDIS_PORT=6379
# Genera datos CSV simulando un sensor de temperatura/CO2
# Directorio de salida (Volumen compartido con Nginx)
OUTPUT_DIR="/opt/sensor/output"
OUTPUT_FILE="$OUTPUT_DIR/data.csv"

# Crear directorio si no existe
mkdir -p "$OUTPUT_DIR"

# Leer intervalo de la variable de entorno (por defecto 10s)
SLEEP_TIME=${INTERVALO:-10}

echo "Iniciando Sensor IoT..."
echo "Intervalo de lectura: $SLEEP_TIME segundos"
echo "Escribiendo en: $OUTPUT_FILE"

# Cabecera del CSV si el archivo no existe
if [ ! -f "$OUTPUT_FILE" ]; then
    echo "Timestamp,Temperature,CO2_Level" > "$OUTPUT_FILE"
fi

# Iniciamos el bucle
while true; do
    TIMESTAMP=$(date +"%Y-%m-%d %H:%M:%S")
    # Generar valores aleatorios: Temp (20-35) y CO2 (400-800)
    TEMP=$(( ( RANDOM % 15 ) + 20 ))
    CO2=$(( ( RANDOM % 400 ) + 400 ))
    
    # Escribir en CSV
    echo "$TIMESTAMP,$TEMP,$CO2" >> "$OUTPUT_FILE"
   
    # Escribir en Redis usando Netcat
    echo "RPUSH sensores:co2 \"$TIMESTAMP,$TEMP,$CO2\"" | nc -w 1 $REDIS_HOST $REDIS_PORT

    echo "Lectura registrada en CSV y Redis."
    echo "Lectura registrada: Temp=$TEMP C, CO2=$CO2 ppm"
    
    sleep "$SLEEP_TIME"
# --- CAMBIO 1: El '&' al final del done hace que el bucle corra en segundo plano ---
done &

# --- CAMBIO 2: El 'exec "$@"' ejecuta el comando que definimos en el Dockerfile (Apache) ---
exec "$@"