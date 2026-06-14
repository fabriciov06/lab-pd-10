# Sistema de búsqueda de pasajeros
Este proyecto implementa un sistema de búsqueda de pasajeros para un viaje de bus utilizando la estructura de datos HashMap en Java. Cada pasajero contiene los atributos: nombre, DNI, destino, fecha, hora y asiento.

## Estructura utilizada
Se empleó un HashMap para almacenar los pasajeros, permitiendo organizar la información mediante pares clave-valor.

## Algoritmo de recorrido utilizado
Se utilizó un Iterator para recorrer los elementos almacenados en el HashMap y comparar el número de asiento de cada pasajero con el asiento buscado.

## Justificación
Se eligió este recorrido porque permite acceder a todos los pasajeros almacenados en el HashMap de manera secuencial y controlada. Mediante el uso de Iterator se puede recorrer la colección sin alterar su contenido y verificar cada registro hasta encontrar el asiento solicitado. Además, esta solución cumple con la implementación del patrón Iterator requerida en la actividad y facilita la comprensión del proceso de búsqueda dentro de una colección de objetos.

<img width="1226" height="328" alt="image" src="https://github.com/user-attachments/assets/b93e2eef-4576-4828-8fa8-a9877a1cbdaa" />
