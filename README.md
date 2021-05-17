# Fabrica-muebles

## Enunciado
TP1 - PARCIAL 1 - T1 � Colecciones, Agregaci�n y Composici�n, Relaciones Jer�rquicas.Instituto de Tecnolog�a ORT

Carrera de Analista de Sistemas

Materia: Taller de Programaci�n 1

Le� completo y con cuidado el enunciado. Pens� bien la estrategia de resoluci�n antes de comenzar el
desarrollo de lo que te solicitan. El objetivo de este examen es evaluar la correcta aplicaci�n de los
conceptos y t�cnicas vistos hasta el momento:
- Correcta implementaci�n de constructores.
- Modularizaci�n reutilizable y mantenible con uso de m�todos con correcta parametrizaci�n y
correcto encapsulamiento, publicando setters y getters s�lo cuando corresponda.
- Manejo de clases y colecciones.
- Manejo de Asociaci�n, Agregaci�n y Composici�n.
- Manejo de relaciones jer�rquicas. Herencia, Clases Abstractas e Interfaces.
- Importaci�n y Exportaci�n de proyectos Java desde Eclipse.

Enunciado
Una empresa se dedica a la fabricaci�n y venta de muebles de distintos tipos. Cada mueble tendr�
un modelo � String, un costo base � decimal y un porcentaje de ganancia � decimal. Adem�s los muebles
deber�n ser Mostrables, indicando por consola:
- El tipo de mueble
- El modelo
- El precio de venta
La f�brica produce muebles de los siguientes tipos indicando sus caracter�sticas
- Mesa
- Largo � entero
- Ancho � entero
- Tipo de mesa (Moderna, Antigua y de Cristal)
- Silla
- Alto - entero
- Material de fabricaci�n (Madera, Metal o Pl�stico)
- Sill�n
- Cantidad de cuerpos � entero
- Tipo de tela del sill�n

Todos los muebles deber�n poder calcular e informar el precio de venta. Este precio es el valor de
costo incrementado por el porcentaje de ganancia de cada uno.
El costo de los muebles depende del tipo de mueble.
- Para las mesa el costo se calcula como la multiplicaci�n del costo base por un multiplicador
dependiente del tipo de mesa m�s el 0,2 de la superficie (el 20% de la superficie)
(costo base * multiplicador del tipo de mesa + 0.2 * largo * ancho)
- Para las sillas el costo se calcula como la suma entre el costo base m�s la multiplicaci�n
entre el alto de la silla y el multiplicador dependiente del material.
(costo base + multiplicador del material * alto)
- Para los sillones el costo se calcula como la multiplicaci�n del costo base por la cantidad de
cuerpos por un porcentaje definido para el tipo de tela pedido
(costo base * cantidad de cuerpos * porcentaje adicional por tela)
Adicionalmente todos los muebles deber�n poder indicar, mediante un m�todo, si su modelo
corresponde con el recibido por par�metro
Por otro lado, la f�brica de muebles poseer� un listado de muebles fabricados y un nombre.
Adem�s tendr� como responsabilidad la fabricaci�n de muebles (registro de los muebles fabricados),
deber� poder indicar si un determinado modelo de mueble ha sido fabricado y por �ltimo, al ser Mostrable,

deber� mostrar por consola un resumen que indique su nombre, la cantidad de muebles fabricados de cada
tipo y el importe total de las ventas de los muebles fabricados.
Diagrama de clases INCOMPLETO de la soluci�n:
Para aprobar el examen se deber� realizar lo siguiente:
1. Completar los atributos faltantes, el constructores y los m�todos incompletos de las clases
FabricaDeMuebles, Mueble, Mesa, Silla y Sill�n
2. Implementar los m�todos definidos por la interfaz Mostrable donde corresponda y en base a lo
especificado.
3. Implementar el m�todo �calcularPrecioCosto� en las clases que crea conveniente
4. Implementar el m�todo �modeloCorrecto� de la clase Mueble.
5. Implementar el m�todo �fabricar� de la FabricaDeMuebles que deber� recibir un mueble e
indicar si lo pudo fabricar devolviendo un true. No se podr� fabricar si el mueble recibido es
nulo.
6. Implementar el m�todo �seHaFabricado� de la clase FabricaDeMuebles que dado un modelo
indique si dicho modelo se ha fabricado.
7. Implementar el m�todo que permita que la clase FabricaDeMuebles muestre la informaci�n
solicitada.

Para probar el funcionamiento del programa se dispone de una clase de prueba �Parcial1� que
contiene la creaci�n de la F�brica �S�per F�brica 2000� y dispone de un lote de pruebas de muebles que
ser�n fabricados.
NOTA: Esta clase no deber� ser modificada por los alumnos.
La ejecuci�n de la clase Parcial1 deber� arrojar el siguiente resultado:
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
F�brica de muebles: S�per F�brica 2000
Se han fabricado: 4 Mesas, 3 Sillas y 5 Sillones
La venta total fue: $52115,34
Para realizar el examen
- Descargar el archivo TP1-2021-C1-Parcial1-T1-ApellidoNombre.zip. del aula virtual
- Importar en Eclipse el proyecto descargado y renombrarlo con tu apellido y nombre. Por
ejemplo: TP1-2021-C1-Parcial1-T1-PerezJuan
- Al finalizar el examen, exportarlo en un archivo ZIP con el mismo nombre del proyecto y
subirlo en el aula virtual en el link correspondiente al examen, el archivo a subir debe
llamarse igual que el proyecto.
