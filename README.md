# Gestor de Tareas y Proyectos

## Descripción

Este proyecto es un sistema de gestión de tareas y proyectos desarrollado en Java. El sistema permite a los gestores de proyectos realizar varias operaciones clave, como:

- Registrar nuevos proyectos y usuarios.
- Asignar tareas a proyectos específicos.
- Asignar tareas a usuarios individuales.
- Consultar la lista de proyectos.
- Ver las tareas asociadas a un proyecto específico.
- Consultar las tareas asignadas a un usuario y su estado.

El sistema maneja las excepciones personalizadas para garantizar la validez de las operaciones, como fechas de proyectos incorrectas y referencias a proyectos o usuarios inexistentes.

## Estructura del Proyecto

El proyecto incluye las siguientes clases principales:

- `GestorDeTareasProyectos`: Clase principal que maneja la gestión de proyectos, usuarios y tareas.
- `Proyecto`: Representa un proyecto, con atributos como nombre, fecha de inicio, fecha de fin, y lista de tareas.
- `Usuario`: Representa un usuario, con atributos como nombre, ID de usuario, y lista de tareas asignadas.
- `Tarea`: Representa una tarea, con atributos como nombre, descripción, fecha límite, prioridad, y estado.
- Excepciones personalizadas (`FechaInvalidaException`, `ProyectoNoEncontradoException`, `UsuarioNoEncontradoException`) para manejar errores específicos.

## Requisitos Previos

Antes de ejecutar el proyecto, asegúrate de tener instalado lo siguiente:

- **Java Development Kit (JDK) 8 o superior**: Necesario para compilar y ejecutar programas Java.
- **Un IDE o editor de texto** que soporte Java (como IntelliJ IDEA).

## Instrucciones para Ejecutar el Programa

### 1. Clonar el Repositorio

Primero, clona el repositorio en tu máquina local:

```bash
git clone https://github.com/tu-usuario/gestor-tareas-proyectos.git

2. Navegar al Directorio del Proyecto
Dirígete al directorio del proyecto clonado:

cd gestor-tareas-proyectos

3. Compilar el Proyecto

Si estás usando un IDE como IntelliJ IDEA  abre el proyecto en el IDE y compílalo. Si prefieres usar la línea de comandos, ejecuta el siguiente comando desde la raíz del proyecto:

javac src/com/tu-usuario/gestor/*.java

4. Ejecutar el Programa
Una vez que el proyecto esté compilado, puedes ejecutar el programa. Desde el IDE, simplemente ejecuta la clase Main. Si usas la línea de comandos, navega a la carpeta src y ejecuta:

java com.tu-usuario.gestor.Main

5. Visualizar Resultados
El programa ejecutará las operaciones definidas en la clase Main, como la creación de proyectos, asignación de tareas, y consultas. Los resultados se mostrarán en la consola.
