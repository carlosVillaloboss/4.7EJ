/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg4.pkg7ej;

class Lobo extends Canidos {
    public Lobo() {
        this.sonido = "Aullido";
        this.alimentos = "Carnivoro";
        this.habitat = "Bosque";
        this.nombreCientifico = "Canis lupus";
    }

    @Override
    public String getNombreCientifico() {
        return this.nombreCientifico;
    }

    @Override
    public String getSonido() {
        return this.sonido;
    }

    @Override
    public String getAlimentos() {
        return this.alimentos;
    }

    @Override
    public String getHabitat() {
        return this.habitat;
    }
}

