# Evidencias - Examen Final

## 1. POST - Crear material

Se creó correctamente un nuevo material mediante el endpoint **POST**. La API respondió con un código de estado **201 Created** (o **200 OK**, según la implementación), confirmando el alta del registro.

![POST Crear Material](capturas/01-post-material.png)

---

## 2. GET - Listar materiales

Se obtuvo correctamente el listado de todos los materiales registrados mediante el endpoint **GET**. La API respondió con **200 OK**.

![GET Materiales](capturas/02-get-materiales.png)

---

## 3. GET - Buscar material por ID

Se consultó correctamente un material específico utilizando su identificador. La respuesta fue **200 OK** con la información correspondiente.

![GET Material por ID](capturas/03-get-material-id.png)

---

## 4. PUT - Actualizar material

Se actualizó correctamente la información de un material mediante el endpoint **PUT**. La API confirmó la modificación realizada.

![PUT Material](capturas/04-put-material.png)

---

## 5. DELETE - Eliminar material

Se eliminó correctamente un material del sistema mediante el endpoint **DELETE**. La API respondió indicando que la operación se realizó exitosamente.

![DELETE Material](capturas/05-delete-material.png)

---

## 6. POST - Registrar préstamo

Se registró correctamente un préstamo de un material a un usuario. La API respondió con éxito, almacenando la información del préstamo.

![POST Préstamo](capturas/06-post-prestamo.png)

---

## 7. POST - Devolver préstamo

Se registró correctamente la devolución del material prestado mediante el endpoint correspondiente. La API actualizó el estado del préstamo y confirmó la operación con una respuesta exitosa.

![POST Devolver Préstamo](capturas/07-post-devolver.png)

---

## 8. GET - Materiales disponibles

Se consultó correctamente el listado de materiales disponibles. La API respondió con **200 OK**, devolviendo únicamente los materiales que se encuentran disponibles para préstamo.

![GET Materiales Disponibles](capturas/08-materiales-disponibles.png)

---

## 9. POST - Depurar duplicados

Se ejecutó correctamente el proceso de depuración de materiales duplicados. La API eliminó los registros repetidos y devolvió la colección sin elementos duplicados.

![POST Depurar Duplicados](capturas/09-depurar-duplicados.png)
