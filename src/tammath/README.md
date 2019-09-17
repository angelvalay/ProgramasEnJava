# Ejercicios del TamCoder 2019
Estos ejercicios fueron desarrollados durante la participacion del concurso TamCoder que se celebro en septiembre 2019 en la UPV.

**Tiempo límite de repuesta por caso: 1 seg.**

**Máxima memoria permitida: 128 MB.**
## Casa de papel

### Introducción
El Profesor y sus secuaces tienen la menuda tarea de embolsar 2400 millones de euros en billetes de 100 y 200 euros que han estado imprimiendo en la Casa de Papel y Moneda en España.

Nairobi, la encargada de la impresión tiene la manía de embolsar los billetes en paquetes de 5 Kg., pero Berlín ha solicitado que también hagan paquetes de 3 Kg.

Los rehenes sólo pueden cargar una cantidad de Kg. de paquetes, dependiendo de su complexión (a excepción de Arturo, que siempre se está quejando de todo y carga mucho menos que los demás).

Río está encargado de hacer un programa que asigne la menor cantidad de paquetes de acuerdo a la capacidad de carga de cada rehen.

Por ejemplo, suponiendo que Arturo puede cargar 18 Kg., él podría usar seis paquetes de 3 Kg. pero sería mejor usar 3 paquetes de 5 Kg. y uno de 3 Kg., resultando en un total de 4 paquetes.

### Problema
Encontrar el menor número de paquetes requeridos para transportar exactamente N Kg.

### Entrada
La primera y única línea de entrada contendrá un entero N ( )

### Salida
La primera y única línea de salida deberá contener el número mínimo de paquetes que Nairobi tiene que usar. Si es IMPOSIBLE entregar exactamente N Kg. el programa deberá regresar -1.

### Ejemplos

| Entrada | Salida |
| ---| ---|
| 4  | -1 |
| 9  | 3 |
| 18  | 4 |

## El Coronel Sam Trautman

### Introducción
Cuando el Coronel Sam Trautman estaba entrenando a Rambo (y a los Boinas Verdes), decidió llevarlos a las rocallosas para mejorar la condición física.

El Coronel Trautman ha diseñado varias rutas que pueden ser descritas como una secuencia de N números que representan la altura de su altímetro tomada a intervalos regulares.

El Coronel sabe que un segmento de la ruta va en ascenso si éste tiene una secuencia de valores estrictamente creciente. Él quiere clasificar las rutas de acuerdo al mayor ascenso que ésta posea (la mayor diferencia de altura que posea un segmento ascendente de la ruta). Por ejemplo, suponiendo que una ruta tiene la siguiente secuencia: 12 3 5 7 10 6 1 11, el Coronel identifica que existen dos secuencias de ascenso, la primera formada por 3,5,7 y 10, y la segunda formada por 1 y 11. La diferencia de 3 (inicio del primer ascenso) y 10 (fin del primer ascenso) es igual a 7, mientras que el segundo ascenso, que tiene como inicio 1 y fin 11, tiene una diferencia de 10. Por lo tanto, el segundo segmento (10) posee el mayor ascenso, que es precisamente la distancia que el Coronel requiere utilizar para la clasificación.

### Problema
Ayuda al Coronel a clasificar sus rutas desarrollando un programa que regrese el mayor de los segmentos ascendentes.
Dada una secuencia de números, regresar la secuencia ascendente cuya diferencia entre el inicio y el final de la misma sea la mayor

### Entrada
La primera línea de entradad contiene un entero positivo N ( ), que se refiere al número de puntos de medición de la ruta. La segunda línea de entrada contiene N enteros positivos  ( ), que son las alturas tomadas en el punto de medición de la ruta.

### Salida
La primera y única línea de salida deberá contener el mayor de los segmentos ascendentes de la ruta.

### Ejemplos

| Entrada | Salida |
| ---| ---|
| 5  | 5 |
| 1 2 1 4  | 6 |
| Entrada | Salida |
| 8  | 8 |
12 20 1 3 4 4 11 1	

Los ascensos son: 12-20, 1-3-4, y 4-11. No se considera 1-3-4-4-11 porque no es estríctamente ascendente.

| Entrada | Salida |
| ---| ---|
| 6  | 0 |

10 8 8 6 4 3	

En este caso la alida es 0, ya que no es una ruta ascendente.