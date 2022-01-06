# RetoPreguntas
Reto práctico evaluativo
CHALLENGE - CONCURSO DE PREGUNTAS Y RESPUESTAS

Enunciado del reto:

"Use Case/Problem

Lo que se busca en este juego es pre-construir una serie de preguntas con 4 opciones de respuesta y una de ella válida, además de una categoría asociada con el mismo nivel de dificultad. Cada pregunta debe estar categorizada y debe existir mínimo 5 preguntas por categoría donde por cada ronda se debe extraer una pregunta de esa categoría de forma aleatoria, debe existir 5 rondas en todo el juego, cada ronda otorga premios (puntos o dinero) cuando el jugador acierta correctamente.
El acumulado de premios está dentro del concurso pero si dado el caso el jugador pretender salir de juego puede retirarse antes de responder a la pregunta, si por el contrario el jugador pierde entonces saldría del juego sin el acumulado que llevaría en ese momento."

Lenguaje: Java

Resultados//Salidas: por consola

El proyecto consta de dos paquetes:

-Clases

-Test

El paquete Clases está compuesto por las clases:

-Jugador

-Ronda

-Pregunta

El paquete Test está compuesto por la clase main:

-Juego

Categorias: Las categorias del juego se encuentran en 5 archivos txt:

-preguntasCat1.txt

-preguntasCat2.txt

-preguntasCat3.txt

-preguntasCat4.txt

-preguntasCat5.txt

Cada categoria compuesta por 5 preguntas y cada pregunta con 4 opciones de respuesta.

Premios: El juego otorgará puntos por cada ronda superada de la siguiente manera: 

Ronda N° 1 - 50 puntos

Ronda N° 2 - 150 puntos

Ronda N° 3 - 300 puntos

Ronda N° 4 - 500 puntos

Ronda N° 5 - 1000 puntos

Las capturas que el sistema hace por teclado están configuradas para ser convertidas a mayúsculas.

Para iniciar el proyecto, se ejecuta la clase "Juego". Por consola se muestra un mensaje de la bienvenida y se le pide al usuario ingresar el nombre de jugador (esto se hace por teclado).

Una vez esté ingresado el nombre del jugador, se inicia el juego.

Se muestra el número de ronda (Ronda N° X), el premio (en puntos) de dicha ronda y la pregunta aleatoria correspondiente a la categoria en juego, con sus respectivas opciones de respuesta.

Al usuario le aparece un mensaje "Dígite su respuesta: " deberá elegir una de las 4 letras u opciones de respuesta (A, B, C y D) mostradas en pantalla. Si el usuario escoge la opción correcta, pasa a la siguiente ronda. El sistema carga la categoría correspondiente a la ronda que se va a jugar. En caso de responder de manera incorrecta o escribir un carácter que no corresponda a las letras de las opciones de respuesta, el jugador perderá el juego y el acumulado que lleve hasta el momento, siendo éste cero (0), y se finaliza  el juego.-Fin del juego forzado-

A partir de la Ronda N° 2 hasta la Ronda N° 5, el sistema le mostrara en pantalla al usuario además, de la pregunta aleatoria asignada por el sistema, un mensaje "¿Desea seguir jugando? S/N: " El usuario elegirá continuar o no. Si elige si (escribiendo la letra s/S), el sistema mostrará por pantalla el mensaje "Dígite su respuesta: ", y el usuario elige una de las 4 letras (A, B, C ó D) y se aplica el mismo principio del párrafo anterior.

En caso que el jugador decida no continuar jugando (escribe n/N)-Fin del juego voluntario-; el sistema le mostrará su puntaje obtenido.

El sistema permite guardar en un archivo txt, llamado "historicoJuego", el nombre del jugador (primer dato) y el puntaje que obtuvo en el juego (segundo dato) con el siguiente formato -> DorisML: 2000

Autor: Doris Mosquera Lozano

email: dml2410@gmail.com
