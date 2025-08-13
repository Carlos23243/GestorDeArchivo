#  Manipulación de Archivos y Manejo de Excepciones en Java

##  Descripción
Este proyecto es un ejemplo **Programación Orientada a Objetos (POO)** en Java.  
Implementa operaciones de **lectura y escritura de archivos** de texto y el manejo de **excepciones personalizadas**.

El programa permite:
- Guardar contenido en un archivo de texto.
- Leer el contenido línea por línea.
- Verificar si un archivo está vacío usando una excepción personalizada.
- Manejar errores de forma controlada con `try-catch`.

---

## Tecnologías
- **Lenguaje:** 
- **Paradigma:** 
- **Manejo de archivos:** `BufferedReader` y `BufferedWriter`
- **Manejo de excepciones personalizadas**

---

##  Estructura de Clases

| Clase | Descripción |
|-------|-------------|
| `GestorDeArchivo` | Contiene métodos para guardar (`guardar`) y leer (`leer`) archivos. |
| `ArchivoVacioException` | Excepción personalizada que se lanza si el archivo no contiene contenido. |
| `ValidadorArchivo` | Contiene el método `verificarNoVacio` para comprobar que un archivo tenga contenido. |
| `Main` | Clase principal que ejecuta el flujo del programa y maneja las excepciones. |

---



