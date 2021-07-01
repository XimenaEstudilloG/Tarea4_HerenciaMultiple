/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaherencia;

import ico.fes.atleta.EstudianteDeportistaYArtista;

/**
 *
 * @author Admin
 */
public class TareaHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EstudianteDeportistaYArtista atleta = new EstudianteDeportistaYArtista(1, "Juega basquet y baila árabe, urbano y contemporáneo", "Basquetbol", "Aragon", "Entrena todos los días", "Juega los fines de semana", "Ximena", "Estudillo", "González", 318069221, 18, "Mujer", 63, 166);
        System.out.println(atleta);
        atleta.dormir();
        atleta.comer();
        atleta.bano();
        atleta.agua();
        atleta.asistirAEntrenamiento();
        atleta.jugar();
        atleta.compite();
        
    }
    
}
