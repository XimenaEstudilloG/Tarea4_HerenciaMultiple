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
public class Persona {
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private int numeroCarrera;
    private int edad;
    private String sexo;
    private int peso;
    private int estatura;

    public Persona() {
    }

    public Persona(String nombre, String apPaterno, String apMaterno, int numeroCarrera, int edad, String sexo, int peso, int estatura) {
        this.nombre = nombre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.numeroCarrera = numeroCarrera;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }
    
    public int getnumeroCarrera() {
        return numeroCarrera;
    }
    
    public void setnumeroCarrera(int numeroCarrera) {
        this.numeroCarrera = numeroCarrera;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apPaterno=" + apPaterno + ", apMaterno=" + apMaterno + ", numeroCarrera=" + numeroCarrera + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", estatura=" + estatura + '}';
    }

    
    public void dormir(){
        System.out.println( this.nombre + " Esta durmiendo sus 8 horas. ");
    }
    
    public void comer(){
        System.out.println( this.nombre + " Esta comiendo un rico platillo. ");
    }
    
    public void bano(){
        System.out.println( this.nombre + " Esta haciendo sus necesidades. ");
    }
    
    public void agua(){
        System.out.println( this.nombre + " Tomara un poco de agua y seguira... ");
    }
}
