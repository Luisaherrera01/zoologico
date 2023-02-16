package org.example;

public class Animal {

    //ATRIBUTOS
    private String nombre;
    private String genero;
    private double peso;
    private Animal pareja;

    //CONSTRUCTORES
    public Animal() {}
    public Animal(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    //METODOS
    void encontrarPareja(Animal pareja){
        this.pareja=pareja;
    }

    //SETTER AND GETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Animal getPareja() {
        return pareja;
    }

    public void setPareja(Animal pareja) {
        this.pareja = pareja;
    }
}
