package org.example;

public class Zoologico {
    public static void main(String[] args) {

    //1ER OBJETO
        Animal animal1 = new Animal();
        animal1.setNombre("Cebra");
        animal1.setGenero("F");

    //2DO OBJETO
        Animal animal2 = new Animal();
        animal2.setNombre("Caballo");
        animal2.setGenero("M");

    //METODO ENCONTRAR PAREJA
        animal1.encontrarPareja(animal2);

    //3ER OBJETO CREACION DE UNA FAMILIA
        Familia familia = new Familia(animal2,animal1);

    //METODO TENERHIJO
        familia.tenerHijo("Cebrallo");

    //METODO IMPRIMIR OBJETO FAMILIA
        familia.imprimirFamilia();

    }
}