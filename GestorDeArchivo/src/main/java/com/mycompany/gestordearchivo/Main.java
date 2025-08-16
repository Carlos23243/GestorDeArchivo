/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestordearchivo;

/**
 *
 * @author admin
 */
// Clase principal para probar la funcionalidad
public class Main {
    public static void main(String[] args) {
        ArchivoUsuario archivo = new ArchivoUsuario();

        // Guardar información en un archivo
        archivo.guardar("usuario.txt", "Hola, soy un estudiante de POO.\nEsto es un ejemplo de manipulación de archivos.");

        // Leer el contenido del archivo
        archivo.leer("usuario.txt");
    }
}


