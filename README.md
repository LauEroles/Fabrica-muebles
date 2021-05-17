# Fabrica-muebles

## Enunciado
TP1 - PARCIAL 1 - T1 – Colecciones, Agregación y Composición, Relaciones Jerárquicas.Instituto de Tecnología ORT

Carrera de Analista de Sistemas

Materia: Taller de Programación 1

Leé completo y con cuidado el enunciado. Pensá bien la estrategia de resolución antes de comenzar el
desarrollo de lo que te solicitan. El objetivo de este examen es evaluar la correcta aplicación de los
conceptos y técnicas vistos hasta el momento:
- Correcta implementación de constructores.
- Modularización reutilizable y mantenible con uso de métodos con correcta parametrización y
correcto encapsulamiento, publicando setters y getters sólo cuando corresponda.
- Manejo de clases y colecciones.
- Manejo de Asociación, Agregación y Composición.
- Manejo de relaciones jerárquicas. Herencia, Clases Abstractas e Interfaces.
- Importación y Exportación de proyectos Java desde Eclipse.

Enunciado
Una empresa se dedica a la fabricación y venta de muebles de distintos tipos. Cada mueble tendrá
un modelo – String, un costo base – decimal y un porcentaje de ganancia – decimal. Además los muebles
deberán ser Mostrables, indicando por consola:
- El tipo de mueble
- El modelo
- El precio de venta
La fábrica produce muebles de los siguientes tipos indicando sus características
- Mesa
- Largo – entero
- Ancho – entero
- Tipo de mesa (Moderna, Antigua y de Cristal)
- Silla
- Alto - entero
- Material de fabricación (Madera, Metal o Plástico)
- Sillón
- Cantidad de cuerpos – entero
- Tipo de tela del sillón

Todos los muebles deberán poder calcular e informar el precio de venta. Este precio es el valor de
costo incrementado por el porcentaje de ganancia de cada uno.
El costo de los muebles depende del tipo de mueble.
- Para las mesa el costo se calcula como la multiplicación del costo base por un multiplicador
dependiente del tipo de mesa más el 0,2 de la superficie (el 20% de la superficie)
(costo base * multiplicador del tipo de mesa + 0.2 * largo * ancho)
- Para las sillas el costo se calcula como la suma entre el costo base más la multiplicación
entre el alto de la silla y el multiplicador dependiente del material.
(costo base + multiplicador del material * alto)
- Para los sillones el costo se calcula como la multiplicación del costo base por la cantidad de
cuerpos por un porcentaje definido para el tipo de tela pedido
(costo base * cantidad de cuerpos * porcentaje adicional por tela)
Adicionalmente todos los muebles deberán poder indicar, mediante un método, si su modelo
corresponde con el recibido por parámetro
Por otro lado, la fábrica de muebles poseerá un listado de muebles fabricados y un nombre.
Además tendrá como responsabilidad la fabricación de muebles (registro de los muebles fabricados),
deberá poder indicar si un determinado modelo de mueble ha sido fabricado y por último, al ser Mostrable,

deberá mostrar por consola un resumen que indique su nombre, la cantidad de muebles fabricados de cada
tipo y el importe total de las ventas de los muebles fabricados.
Diagrama de clases INCOMPLETO de la solución:
Para aprobar el examen se deberá realizar lo siguiente:
1. Completar los atributos faltantes, el constructores y los métodos incompletos de las clases
FabricaDeMuebles, Mueble, Mesa, Silla y Sillón
2. Implementar los métodos definidos por la interfaz Mostrable donde corresponda y en base a lo
especificado.
3. Implementar el método “calcularPrecioCosto” en las clases que crea conveniente
4. Implementar el método “modeloCorrecto” de la clase Mueble.
5. Implementar el método “fabricar” de la FabricaDeMuebles que deberá recibir un mueble e
indicar si lo pudo fabricar devolviendo un true. No se podrá fabricar si el mueble recibido es
nulo.
6. Implementar el método “seHaFabricado” de la clase FabricaDeMuebles que dado un modelo
indique si dicho modelo se ha fabricado.
7. Implementar el método que permita que la clase FabricaDeMuebles muestre la información
solicitada.

Para probar el funcionamiento del programa se dispone de una clase de prueba “Parcial1” que
contiene la creación de la Fábrica “Súper Fábrica 2000” y dispone de un lote de pruebas de muebles que
serán fabricados.
NOTA: Esta clase no deberá ser modificada por los alumnos.
La ejecución de la clase Parcial1 deberá arrojar el siguiente resultado:
Fabricando el mueble:
Mueble tipo: Silla - Modelo: Silla 2 - Precio de venta:3542.0
Fabricando el mueble:
Mueble tipo: Mesa - Modelo: La Moderna 1 - Precio de venta:3100.0
Fabricando el mueble:
Mueble tipo: Silla - Modelo: Silla 3 - Precio de venta:6000.0
Fabricando el mueble:
Mueble tipo: Sillon - Modelo: Sillon 1 - Precio de venta:1840.0
Fabricando el mueble:
Mueble tipo: Silla - Modelo: Silla 1 - Precio de venta:800.0
Fabricando el mueble:
Mueble tipo: Sillon - Modelo: Sillon 2 - Precio de venta:1200.0
Fabricando el mueble:
Mueble tipo: Sillon - Modelo: Sillon 3 - Precio de venta:3685.4998
Fabricando el mueble:
Mueble tipo: Mesa - Modelo: Nueva Moderna - Precio de venta:3600.0
Fabricando el mueble:
Mueble tipo: Sillon - Modelo: Sillon 1.3 - Precio de venta:2760.0
Fabricando el mueble:
Mueble tipo: Mesa - Modelo: Gran Mesa Antigua - Precio de venta:6200.0
Fabricando el mueble:
Mueble tipo: Sillon - Modelo: Sillon 4 - Precio de venta:3042.0
Fabricando el mueble:
Mueble tipo: Mesa - Modelo: Gran Mesa Cristalina - Precio de venta:8500.0
Se ha fabricado el modelo Silla 1? Si
Se ha fabricado el modelo Silla 44? No
Se ha fabricado el modelo Gran Mesa Cristalina? Si
Fábrica de muebles: Súper Fábrica 2000
Se han fabricado: 4 Mesas, 3 Sillas y 5 Sillones
La venta total fue: $52115,34
Para realizar el examen
- Descargar el archivo TP1-2021-C1-Parcial1-T1-ApellidoNombre.zip. del aula virtual
- Importar en Eclipse el proyecto descargado y renombrarlo con tu apellido y nombre. Por
ejemplo: TP1-2021-C1-Parcial1-T1-PerezJuan
- Al finalizar el examen, exportarlo en un archivo ZIP con el mismo nombre del proyecto y
subirlo en el aula virtual en el link correspondiente al examen, el archivo a subir debe
llamarse igual que el proyecto.
