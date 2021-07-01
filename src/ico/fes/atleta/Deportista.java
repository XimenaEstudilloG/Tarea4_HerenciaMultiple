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
public class Deportista extends Persona{
    private String deporte;
    private String equipo;
    private String entrenar;
    private String jugar;

    public Deportista() {
    }

    public Deportista(String deporte, String equipo, String entrenar, String jugar) {
        this.deporte = deporte;
        this.equipo = equipo;
        this.entrenar = entrenar;
        this.jugar = jugar;
    }

    public Deportista(String deporte, String equipo, String entrenar, String jugar, String nombre, String apPaterno, String apMaterno, int numeroCarrera, int edad, String sexo, int peso, int estatura) {
        super(nombre, apPaterno, apMaterno, numeroCarrera, edad, sexo, peso, estatura);
        this.deporte = deporte;
        this.equipo = equipo;
        this.entrenar = entrenar;
        this.jugar = jugar;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getEntrenar() {
        return entrenar;
    }

    public void setEntrenar(String entrenar) {
        this.entrenar = entrenar;
    }

    public String getJugar() {
        return jugar;
    }

    public void setJugar(String jugar) {
        this.jugar = jugar;
    }

    @Override
    public String toString() {
        return super.toString() + "Deportista{" + "deporte=" + deporte + ", equipo=" + equipo + ", entrenar=" + entrenar + ", jugar=" + jugar + '}';
    }
    
    public void asistirAEntrenamiento(){
        System.out.println("Calentando y practicando como debe de hacer su deporte...");
    }
    
    public void jugar(){
        System.out.println("Da lo mejor para ganar...");
    }
   
    public void dieta(){
        System.out.println("Lleva una dieta balanceada para rendir mejor...");
    }
    
    public void compite(){
        System.out.println("Ya que se preparó lo suficiente irá a una competencia para demostrar que es el mejor o para aprender ...");
    }
}
