/**
 * Nombre: Proyecto Final - quidditch
 * Descripción: Entregable 2
 * Haga un programa que lea el nombre de un equipo, el número de juegos ejecutados por el equipo
 * y la información correspondiente a cada uno de los juegos, e imprima un reporte de resultados
 * de todos los juegos del equipo, así como el puntaje total de los partidos, obtenido por el equipo.
 * Para cada uno de los juegos se debe preguntar el nombre del equipo oponente, el marcador de
 * cada uno, así como quién atrapó la snitch. El equipo que atrapó la snitch debe aparecer con un *
 * (asterisco) indicado en el marcador correspondiente, en el reporte de resultados.
 * Autor: Johan Flores
 * Fecha de creación: 10, Nov, 2020
 * Modificado por: Johan Flores
 * Fecha de modificación:  11, Nov, 2020
 */

package PROYECTO;

import java.io.*;
import java.util.*;

public class quidditch { // Inicio del programa
    // Aqui van todas las rutinas o modulos, incluyendo la rutina principal

    // Variables globales de entrada y salida.
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream out = System.out;

    public static String equipoNombreLocal, equipoNombreRival, resultadoOutput, marcadorLocalOutput,
            marcadorRivalOutput;
    public static int numeroJuegosTotal, marcadorLocal, marcadorRival, puntajeTotalLocal;
    public static char atrapoSnitchLocal, atrapoSnitchRival;

    public static List<String> listaResultados = new ArrayList<String>();

    public static void main(String[] args) throws Exception {
        out.println("Equipo: ");
        equipoNombreLocal = in.readLine();

        out.println("Numero de juegos: ");
        numeroJuegosTotal = Integer.parseInt(in.readLine());

        puntajeTotalLocal = 0;

        for (int i = 1; i <= numeroJuegosTotal; i++) { // Inicio for principal 1

            out.println("Juego " + i + " contra: ");
            equipoNombreRival = in.readLine();

            out.println("Marcador de " + equipoNombreLocal + " : ");
            marcadorLocal = Integer.parseInt(in.readLine());

            out.println("Atrapó la snitch: ");
            atrapoSnitchLocal = in.readLine().charAt(0);
            atrapoSnitchLocal = Character.toLowerCase(atrapoSnitchLocal); // Convertir respuesta usuario sin capital
                                                                          // letter para la condicion

            if (atrapoSnitchLocal == 's') { // Inicio atrapoSnitchLocal para marcar si equipo local atrapo snitch o no
                marcadorLocalOutput = String.valueOf(marcadorLocal);
                marcadorLocalOutput = marcadorLocalOutput + "*";

            } else {

                marcadorLocalOutput = String.valueOf(marcadorLocal);

            } // fin atrapoSnitchLocal

            out.println("Marcador de " + equipoNombreRival + " : ");
            marcadorRival = Integer.parseInt(in.readLine());

            out.println("Atrapó la snitch: ");
            atrapoSnitchRival = in.readLine().charAt(0);
            atrapoSnitchRival = Character.toLowerCase(atrapoSnitchRival); // Convertir respuesta usuario sin capital
                                                                          // letter para la condicion

            if (atrapoSnitchRival == 's') { // Inicio atrapoSnitchLocal para marcar si equipo rival atrapo snitch o no
                marcadorRivalOutput = String.valueOf(marcadorRival);
                marcadorRivalOutput = marcadorRival + "*";

            } else {
                marcadorRivalOutput = String.valueOf(marcadorRival);

            } // fin atrapoSnitchRival

            // Acumulador Calculo puntaje total

            puntajeTotalLocal = marcadorLocal + puntajeTotalLocal;

            resultadoOutput = equipoNombreLocal + " vs " + equipoNombreRival + " " + marcadorLocalOutput + "-"
                    + marcadorRivalOutput;

            // Almacenando el resultado output a la lista

            listaResultados.add(resultadoOutput);

        } // fin for principal 1

        for (int ii = 0; ii <= listaResultados.size() - 1; ii++) { // Inicio de ciclo for para imprimir elementos de la
                                                                   // lista
            System.out.println(listaResultados.get(ii));
        } // fin ciclo for para mostrar list

        out.println("El puntaje total de partidos  de " + equipoNombreLocal + " es: " + puntajeTotalLocal); // Muestra
                                                                                                            // el
                                                                                                            // puntaje
                                                                                                            // total de
                                                                                                            // partidos

    } // fin main

} // Fin del programa