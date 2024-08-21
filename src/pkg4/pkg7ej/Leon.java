/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg4.pkg7ej;

class Leon extends Felinos {
    public Leon() {
        this.sonido = "Rugido";
        this.alimentos = "Carnivoro";
        this.habitat = "Pradera";
        this.nombreCientifico = "Panthera leo";
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
