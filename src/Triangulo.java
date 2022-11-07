// archivo para el aprendizaje de la POO
public class Triangulo {
    // atributos
    private float base;
    private float altura;

    // constructor
    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    // metodos
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    // Metodo private, usuario no podra acceder, pero la clase TRIANGULO si
    private float area() {
        return ((base * altura) / 2);
    }

    public String mostrarDatos() {
        return "[base = " + base + ", altura = " + altura + ", Area = " + area() + "]";
    }

}
