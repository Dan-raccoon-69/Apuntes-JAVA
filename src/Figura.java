// CLASE ABSTRACT ya que contiene un metodo abstract que es el area para calcular cierta figura
public abstract class Figura {
    private int numLados;

    public Figura() {
        this.numLados = 0;
    }

    public Figura(int numLados) {
        this.numLados = numLados;
    }

    // metodo que define que hacer pero no como 
    public abstract double area();
}
