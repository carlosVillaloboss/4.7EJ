/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg4.pkg7ej;

public class PruebaAnimales {
    public static void main(String[] args) {
        Animal[] animales = new Animal[4];

        animales[0] = new Perro();
        animales[1] = new Lobo();
        animales[2] = new Leon();
        animales[3] = new Gato();

        for (Animal animal : animales) {
            System.out.println("Nombre Cientifico: " + animal.getNombreCientifico());
            System.out.println("Sonido: " + animal.getSonido());
            System.out.println("Alimentos: " + animal.getAlimentos());
            System.out.println("Habitat: " + animal.getHabitat());
            System.out.println();
        }
    }
}
