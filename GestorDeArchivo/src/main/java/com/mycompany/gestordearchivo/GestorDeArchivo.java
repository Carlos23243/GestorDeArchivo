/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestordearchivo;

/**
 *
 * @author admin
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;



// Clase que se encarga de la manipulación de archivos
public class ArchivoUsuario {

    // Método para guardar texto en un archivo
    public void guardar(String nombreArchivo, String contenido) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo))) {
            bw.write(contenido);
            System.out.println("Archivo guardado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }

    // Método para leer texto desde un archivo
    public void leer(String nombreArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            System.out.println("Contenido del archivo:");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}


 

  

