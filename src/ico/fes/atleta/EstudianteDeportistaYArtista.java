/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.atleta;

/**
 *
 * @author Admin
 */
public class EstudianteDeportistaYArtista extends Deportista implements Artista{
    private int aniosDeCarrera;
    private String especialidades;

    public EstudianteDeportistaYArtista() {
    }

    public EstudianteDeportistaYArtista(int aniosDeCarrera, String especialidades) {
        this.aniosDeCarrera = aniosDeCarrera;
        this.especialidades = especialidades;
    }

    public EstudianteDeportistaYArtista(int aniosDeCarrera, String especialidades, String deporte, String equipo, String entrenar, String jugar) {
        super(deporte, equipo, entrenar, jugar);
        this.aniosDeCarrera = aniosDeCarrera;
        this.especialidades = especialidades;
    }

    public EstudianteDeportistaYArtista(int aniosDeCarrera, String especialidades, String deporte, String equipo, String entrenar, String jugar, String nombre, String apPaterno, String apMaterno, int numeroCarrera, int edad, String sexo, int peso, int estatura) {
        super(deporte, equipo, entrenar, jugar, nombre, apPaterno, apMaterno, numeroCarrera, edad, sexo, peso, estatura);
        this.aniosDeCarrera = aniosDeCarrera;
        this.especialidades = especialidades;
    }

    public int getAniosDeCarrera() {
        return aniosDeCarrera;
    }

    public void setAniosDeCarrera(int aniosDeCarrera) {
        this.aniosDeCarrera = aniosDeCarrera;
    }

    public String getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(String especialidades) {
        this.especialidades = especialidades;
    }

    @Override
    public String toString() {
        return super.toString() + "EstudianteDeportistaYArtista{" + "aniosDeCarrera=" + aniosDeCarrera + ", especialidades=" + especialidades + '}';
    }

    @Override
    public String ensayar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String presentar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
}

