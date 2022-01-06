/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Doris
 */
public class Pregunta {
    private String textoPreg;
    private String opcA;
    private String opcB;
    private String opcC;
    private String opcD;
    private String respCorrecta;

    public Pregunta() {
    }

    public Pregunta(String textoPreg, String opcA, String opcB, String opcC, String opcD, String respCorrecta) {
        this.textoPreg = textoPreg;
        this.opcA = opcA;
        this.opcB = opcB;
        this.opcC = opcC;
        this.opcD = opcD;
        this.respCorrecta = respCorrecta;
    }

    public String getTextoPreg() {
        return textoPreg;
    }

    public void setTextoPreg(String textoPreg) {
        this.textoPreg = textoPreg;
    }

    public String getOpcA() {
        return opcA;
    }

    public void setOpcA(String opcA) {
        this.opcA = opcA;
    }

    public String getOpcB() {
        return opcB;
    }

    public void setOpcB(String opcB) {
        this.opcB = opcB;
    }

    public String getOpcC() {
        return opcC;
    }

    public void setOpcC(String opcC) {
        this.opcC = opcC;
    }

    public String getOpcD() {
        return opcD;
    }

    public void setOpcD(String opcD) {
        this.opcD = opcD;
    }

    public String getRespCorrecta() {
        return respCorrecta;
    }

    public void setRespCorrecta(String respCorrecta) {
        this.respCorrecta = respCorrecta;
    }
    
    @Override
    public String toString() {
        return "Pregunta:\n\t "+ textoPreg + "\nA. " + opcA + "\tB. " + opcB + "\nC. " + opcC + "\tD. " + opcD;
    }
    /**
     * Método que permite cargar las preguntas que contiene cada categoria
     * categorias (5 en total) en archivos txt 
     * @param ronda
     * @return
     * @throws IOException 
     */
    public ArrayList<Pregunta> cargarCategoria(int ronda) throws IOException {

        BufferedReader bufferLectura = null;
        Pregunta datosPreg = null;
        ArrayList<Pregunta> lista = new ArrayList<>();
        
        try {
                switch (ronda) {
                    case 1:
                        // Abrir el .txt correspondiente a la categoria 1 en buffer de lectura
                        bufferLectura = new BufferedReader(new FileReader("preguntasCat1.txt"));
                        break;
                    case 2:
                        // Abrir el .txt correspondiente a la categoria 2 en buffer de lectura
                        bufferLectura = new BufferedReader(new FileReader("preguntasCat2.txt"));
                        break;
                    case 3:
                        // Abrir el .txt correspondiente a la categoria 3 en buffer de lectura
                        bufferLectura = new BufferedReader(new FileReader("preguntasCat3.txt"));
                        break;
                    case 4:
                        // Abrir el .txt correspondiente a la categoria 4 en buffer de lectura
                        bufferLectura = new BufferedReader(new FileReader("preguntasCat4.txt"));
                        break;
                    case 5:
                        // Abrir el .txt correspondiente a la categoria 5 en buffer de lectura
                        bufferLectura = new BufferedReader(new FileReader("preguntasCat5.txt"));
                        break;
                }
                // Leer una linea del archivo
                String linea = bufferLectura.readLine();

                while (linea != null) {
                    // Sepapar la linea leída con el separador definido previamente
                    String[] preguntas = linea.split(",");

                    datosPreg = new Pregunta(preguntas[0], preguntas[1], preguntas[2], preguntas[3], preguntas[4], preguntas[5]);
                    lista.add(datosPreg);

                    // Volver a leer otra línea del fichero
                    linea = bufferLectura.readLine();
                }
            } catch (IOException e) {
            } finally {
                // Cierro el buffer de lectura
                if (bufferLectura != null) {
                    try {
                        bufferLectura.close();
                    } catch (IOException e) {
                    }
                }
            }
        return lista;
    }
}
