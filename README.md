# Taller de nivelación PI a PII

## Parte Teórica

## Markdown

Markdown es un lenguaje de marcado ligero que permite dar formato a documentos utilizando una sintaxis sencilla. Permite crear títulos, subtítulos, listas, enlaces, texto en **negrita**, *cursiva* y bloques de código, entre otros elementos.

# GIT

## 1. ¿Qué es un repositorio en Git y cómo se diferencia de un proyecto “normal”?

Un repositorio en Git es un espacio donde se almacena un proyecto y su historial de cambios. Git permite registrar las diferentes versiones de los archivos y saber qué cambios se realizaron.

La diferencia con un proyecto “normal” es que Git mantiene un historial de las modificaciones realizadas, mientras que un proyecto común normalmente solo contiene los archivos y su estado actual.

## 2. ¿Cuáles son las tres áreas principales de Git?

Git tiene tres áreas principales:

* **Working Directory:** es la carpeta donde se encuentran los archivos del proyecto y donde se realizan los cambios.
* **Staging Area o Index:** es el área donde se preparan los cambios que serán incluidos en el próximo commit. Se utiliza con `git add`.
* **Repository:** es donde Git almacena los commits y el historial del proyecto.

## 3. ¿Cómo representa Git los cambios internamente?

Git utiliza diferentes tipos de objetos para almacenar y organizar la información:

**Blob:** almacena el contenido de un archivo.

**Tree:** representa la estructura de directorios y relaciona los archivos con sus nombres y ubicaciones.

**Commit:** representa una versión del proyecto y contiene información sobre los cambios realizados.

**Tag:** es una referencia que permite identificar un commit específico, normalmente para marcar versiones importantes del proyecto.

## 4. ¿Cómo se crea un commit y qué información almacena un objeto commit?

Primero se agregan los cambios al staging:

```bash
git add .
```

Después se crea el commit:

```bash
git commit -m "Mensaje del commit"
```

El commit almacena información como el autor, fecha, mensaje, estructura del proyecto y relación con commits anteriores.

## 5. ¿Cuál es la diferencia entre git pull y git fetch?

`git fetch` sirve para descargar los cambios del repositorio remoto, pero no los aplica directamente al proyecto.

`git pull` descarga los cambios y también intenta aplicarlos a la rama en la que estamos trabajando.

La diferencia es que `fetch` solo descarga los cambios, mientras que `pull` los descarga y los integra.

## 6. ¿Qué es un branch (rama) en Git y cómo Git gestiona los punteros a commits?

Un branch o rama permite trabajar en una parte del proyecto sin modificar directamente la rama principal.

Para crear una rama se utiliza:

```bash
git branch desarrollo
```

Para cambiar a esa rama:

```bash
git switch desarrollo
```

Git utiliza un puntero que indica el último commit de la rama. Cuando se realiza un nuevo commit, ese puntero avanza al nuevo commit.

## 7. ¿Cómo se realiza un merge y qué conflictos pueden surgir? ¿Cómo se resuelven?

`git merge` sirve para unir los cambios de una rama con otra.

Primero se cambia a la rama donde se quieren unir los cambios:

```bash
git switch main
```

Después se realiza el merge:

```bash
git merge desarrollo
```

Puede ocurrir un conflicto cuando dos ramas modifican la misma parte de un archivo de diferente manera.

Para resolverlo se revisa el archivo y se dejan los cambios que se quieren conservar. Después se agregan los cambios:

```bash
git add .
```

Y finalmente se realiza el commit:

```bash
git commit -m "Resolver conflicto"
```

## 8. ¿Cómo funciona el área de staging (git add) y qué pasa si omito este paso?

El área de staging sirve para preparar los cambios que queremos incluir en el próximo commit.

Para agregar los cambios se utiliza:

```bash
git add .
```

Después se puede crear el commit:

```bash
git commit -m "Guardar cambios"
```

Si se omite `git add`, los cambios no quedan preparados y no serán incluidos en el commit.

## 9. ¿Qué es el archivo .gitignore y cómo influye en el seguimiento de archivos?

El archivo `.gitignore` sirve para indicar a Git qué archivos o carpetas no queremos agregar al repositorio.

Por ejemplo:

```text
*.class
target/
```

Esto sirve para evitar subir archivos que no son necesarios para el proyecto, como archivos generados automáticamente.

## 10. ¿Cuál es la diferencia entre un commit amend (--amend) y un nuevo commit?

`git commit --amend` sirve para modificar el último commit realizado.

Por ejemplo:

```bash
git commit --amend -m "Nuevo mensaje"
```

Se puede utilizar cuando queremos corregir el mensaje del último commit o agregar algún cambio que olvidamos.

La diferencia es que `--amend` modifica el último commit, mientras que un nuevo `git commit` crea otro commit.

## 11. ¿Cómo se utiliza git stash y en qué escenarios es útil?

`git stash` sirve para guardar temporalmente los cambios que tenemos sin hacer un commit.

Para guardar los cambios se utiliza:

```bash
git stash
```

Para recuperarlos después:

```bash
git stash pop
```

Es útil cuando estamos trabajando en algo y necesitamos cambiar de rama o hacer otra tarea sin guardar todavía los cambios en un commit.

## 12. ¿Qué mecanismos ofrece Git para deshacer cambios?

Git tiene diferentes comandos para deshacer cambios.

`git reset` permite quitar cambios del staging o regresar a un commit anterior.

```bash
git reset
```

`git revert` permite deshacer los cambios de un commit creando un nuevo commit.

```bash
git revert ID_DEL_COMMIT
```

`git checkout` puede utilizarse para recuperar una versión anterior de un archivo.

```bash
git checkout -- archivo.java
```

Cada comando se utiliza dependiendo del cambio que queramos deshacer.

## 13. ¿Cómo funciona la configuración de remotos (origin, upstream) y qué comandos uso para gestión de forks?

Los remotos permiten conectar nuestro repositorio local con un repositorio que está en otra ubicación, como GitHub.

`origin` normalmente es el repositorio principal que estamos utilizando.

Cuando se trabaja con un fork, se puede utilizar `origin` para nuestro repositorio y `upstream` para el repositorio original.

Para ver los remotos configurados:

```bash
git remote -v
```

Para agregar un repositorio como `upstream`:

```bash
git remote add upstream URL_DEL_REPOSITORIO
```

Para obtener los cambios del repositorio original:

```bash
git fetch upstream
```

## 14. ¿Cómo puedo inspeccionar el historial de commits?

Git tiene varios comandos para revisar el historial y los cambios del proyecto.

`git log` muestra el historial de commits:

```bash
git log
```

También se puede utilizar:

```bash
git log --oneline
```

`git diff` muestra las diferencias entre los cambios:

```bash
git diff
```

`git show` permite ver la información de un commit específico:

```bash
git show ID_DEL_COMMIT
```

Estos comandos sirven para revisar los cambios realizados y consultar el historial del proyecto.
