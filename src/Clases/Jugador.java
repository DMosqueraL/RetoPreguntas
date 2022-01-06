/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Doris
 */
public class Jugador {
    private String nombre;
    private int puntajeJug = 0;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntajeJug() {
        return puntajeJug;
    }

    public void setPuntajeJug(int puntajeJug) {
        this.puntajeJug = puntajeJug;
    }

    @Override
    public String toString() {
        return "Jugador:" + nombre + " - Puntaje: " + puntajeJug;
    }
    /*
    Método que permite guardar en un archivo txt el nombre del jugador con su respectivo puntaje
    obtenido en el juego.
    No sobreescribe el archivo, continúa en la siguiente línea
    Mostrando los datos almacenados previamente (si lo hay)
    */
    public void guardarDatos(String nombre, int puntaje) throws FileNotFoundException, IOException{
        File f = new File("historicoJuego.txt");
        try {
            BufferedWriter escritor = new BufferedWriter(new FileWriter(f, true));
            escritor.append(nombre+": "+puntaje);
            escritor.newLine();
            escritor.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
