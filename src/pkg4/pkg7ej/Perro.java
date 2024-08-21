package pkg4.pkg7ej;

class Perro extends Canidos {
    public Perro() {
        this.sonido = "Ladrido";
        this.alimentos = "Carnivoro";
        this.habitat = "Domestico";
        this.nombreCientifico = "Canis lupus familiaris";
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
