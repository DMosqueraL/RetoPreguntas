/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Clases.Jugador;
import Clases.Ronda;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Doris
 */
public class Juego {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        String nomJugador;
        Scanner lector = new Scanner(System.in);
        System.out.println("\t¡¡¡BIENVENIDO AL CHALLENGE SOFKA!!! \n\n\nIngrese nombre del jugador: ");
        nomJugador = lector.next();
        System.out.println("");
        
        Jugador jugador = new Jugador(nomJugador);
        Ronda ronda = new Ronda(1);
        int numRonda = ronda.getNumRonda();

        ronda.jugarRonda(numRonda, nomJugador);
        
        jugador.setPuntajeJug(ronda.getAcumPuntaje());
        
        jugador.guardarDatos(jugador.getNombre(), jugador.getPuntajeJug());

    }

}
