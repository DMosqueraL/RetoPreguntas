/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Doris
 */
public class Ronda {

    private int numRonda;
    private int puntajeRonda;
    private int acumPuntaje;

    public int getNumRonda() {
        return numRonda;
    }

    public void setNumRonda(int numRonda) {
        this.numRonda = numRonda;
    }

    public int getPuntajeRonda() {
        return puntajeRonda;
    }

    public void setPuntajeRonda(int puntajeRonda) {
        this.puntajeRonda = puntajeRonda;
    }

    public int getAcumPuntaje() {
        return acumPuntaje;
    }

    public void setAcumPuntaje(int acumPuntaje) {
        this.acumPuntaje = acumPuntaje;
    }

    public Ronda() {
    }

    public Ronda(int numRonda) {
        this.numRonda = numRonda;
    }
    /**
     * Método que ejecuta el juego
     * @param numRonda
     * @param nomJug
     * @throws IOException 
     */
    public void jugarRonda(int numRonda, String nomJug) throws IOException {
        boolean salir = false;
        Scanner lector = new Scanner(System.in);
        while (numRonda < 6 && !salir) {
            System.out.println("Ronda N° " + numRonda);
            if (numRonda == 1) {
                puntajeRonda = 50;
            }
            if (numRonda == 2) {
                puntajeRonda = 150;
            }
            if (numRonda == 3) {
                puntajeRonda = 300;
            }
            if (numRonda == 4) {
                puntajeRonda = 500;
            }
            if (numRonda == 5) {
                System.out.println("¡¡¡ÚLTIMA RONDA!!!");
                puntajeRonda = 1000;
            }
            System.out.println("Premio: " + puntajeRonda + " puntos.");
            System.out.println("");

            Pregunta pregunta = new Pregunta();
            ArrayList<Pregunta> categoria = new ArrayList<>();
            categoria = pregunta.cargarCategoria(numRonda);

            Pregunta pregAleatoria = new Pregunta();
            int num = (int) (Math.random() * categoria.size());
            pregAleatoria = categoria.get(num);
            System.out.println(pregAleatoria.toString());
            System.out.println("");

            if (numRonda > 1) {
                System.out.print("¿Desea seguir jugando? S/N: ");
                String seguir = lector.next().toUpperCase();
                if (seguir.equals("N")) {
                    System.out.println("");
                    System.out.println(nomJug + " obtuviste " + acumPuntaje + " puntos.");
                    break;
                }
            }
            System.out.println("");
            System.out.println("Dígite su respuesta: ");
            String respJug = lector.next().toUpperCase();
            System.out.println("");

            switch (respJug) {
                case "A":
                    if (pregAleatoria.getOpcA().equals(pregAleatoria.getRespCorrecta())) {
                        System.out.println("¡¡¡Respuesta Correcta!!! \n");
                        numRonda++;
                        acumPuntaje += puntajeRonda;
                        categoria.clear();

                    } else {
                        System.out.println("¡¡¡Nooooooo!!! Respuesta Incorrecta \n\nGracias por jugar ^_^\n");
                        acumPuntaje = 0;
                        salir = true;
                    }
                    break;
                case "B":
                    if (pregAleatoria.getOpcB().equals(pregAleatoria.getRespCorrecta())) {
                        System.out.println("¡¡¡Respuesta Correcta!!! \n");
                        numRonda++;
                        acumPuntaje += puntajeRonda;
                        categoria.clear();
                    } else {
                        System.out.println("¡¡¡Nooooooo!!! Respuesta Incorrecta \n\nGracias por jugar ^_^\n");
                        acumPuntaje = 0;
                        salir = true;
                    }
                    break;
                case "C":
                    if (pregAleatoria.getOpcC().equals(pregAleatoria.getRespCorrecta())) {
                        System.out.println("¡¡¡Respuesta Correcta!!! \n");
                        numRonda++;
                        acumPuntaje += puntajeRonda;
                        categoria.clear();
                    } else {
                        System.out.println("¡¡¡Nooooooo!!! Respuesta Incorrecta \n\nGracias por jugar ^_^\n");
                        acumPuntaje = 0;
                        salir = true;
                    }
                    break;
                case "D":
                    if (pregAleatoria.getOpcD().equals(pregAleatoria.getRespCorrecta())) {
                        System.out.println("¡¡¡Respuesta Correcta!!! \n");
                        numRonda++;
                        acumPuntaje += puntajeRonda;
                        categoria.clear();
                    } else {
                        System.out.println("¡¡¡Nooooooo!!! Respuesta Incorrecta \n\nGracias por jugar ^_^\n");
                        acumPuntaje = 0;
                        salir = true;
                    }
                    break;
                default:
                    System.out.println("¡¡¡Ay nooooooo!!! Opción errónea \n\nGracias por jugar ^_^\n");
                    acumPuntaje = 0;
                    salir = true;
                    break;
            }

            System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        }
        if (numRonda == 6) {
            System.out.println("¡¡¡FELICITACIONES!!! " +nomJug+" HAS GANADO EL JUEGO \n\n\t¡¡¡2000 PUNTOS!!! \n\n\tGRACIAS POR JUGAR ^_^");
        }
    }
}
