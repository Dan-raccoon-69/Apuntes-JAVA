public class Triangulo {
    public float base;
    public float altura;

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

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

    private float area() {
        return (base * altura) / 2;
    }

    public String mostrarDatos() {
        return "Triangulo [base = " + base + ", altura = " + altura + ", Area = " + area() + "]";
    }

}
