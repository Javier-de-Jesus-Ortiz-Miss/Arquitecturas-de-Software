# Contribución

## Assets

El fichero `Assets` tiene como proposito organizar todos los archivos, anexos y contenido de soporte para el repositorio.

Con el paso del tiempo, se irán agregando ficheros como entregas, diagramas, imágenes, etc.

## Pull Requests

Para contribuir al proyecto, se deben seguir los siguientes pasos:

1. Crear las ramas necesarias para el desarrollo de las tareas asignadas.
2. Realizar los cambios necesarios en el código.
3. Hacer commit de los cambios con mensajes descriptivos.
4. Hacer push de los cambios a la rama correspondiente en el repositorio remoto.
5. Crear un Pull Request (PR) desde la rama de desarrollo hacia la rama principal (solo sí la tarea o funcionalidad está completa).
6. Asignar revisores al PR para que puedan revisar los cambios realizados.
7. Esperar la revisión y aprobación de los cambios por parte de los revisores.
8. Una vez aprobado, se puede hacer merge del PR a la rama principal.
9. Eliminar la rama de desarrollo si ya no es necesaria.
10. Actualizar la rama principal en el entorno local para tener los últimos cambios.
11. Repetir el proceso para nuevas tareas o funcionalidades.

## Nombramiento de ramas

Las ramas deben ser nombradas de manera descriptiva y siguiendo un patrón específico para facilitar la identificación de su propósito. El formato recomendado es:

`<tipo>/<descripción>`

### Donde `<tipo>` puede ser:

#### Entrega

Cada entrega del proyecto debe tener su propia rama para organizar y gestionar los cambios específicos de esa entrega.

En la descripción se debe incluir el número de la entrega y una breve descripción del contenido o funcionalidad que se está desarrollando. Por ejemplo:

-   `entrega1/inicializacion-proyecto`
-   `entrega2/implementacion-funcionalidad-x`
-   `entrega3/correccion-bugs`
-   `entrega4/documentacion-final`
-

#### Docs

Para cambios relacionados con la documentación del proyecto, como la actualización de archivos README, guías de usuario, o cualquier otro documento relevante.

En la descripción se debe incluir una breve descripción del cambio o actualización que se está realizando en la documentación. Por ejemplo:

-   `docs/actualizacion-readme`
-   `docs/agregar-guia-usuario`
-   `docs/correccion-errores-documentacion`
-   `docs/mejora-formato-documentos`

## Reglas para pull requests

1. **Revisión de Código**: Todo PR debe ser revisado por al menos dos miembro del equipo antes de ser fusionado.
2. **Eliminación de contenido en main**: No se permite eliminar contenido en la rama principal sin una justificación válida y la aprobación del equipo.
3. **Conflictos de Fusión**: Si hay conflictos de fusión, el responsable del PR debe resolverlos antes de la revisión.
