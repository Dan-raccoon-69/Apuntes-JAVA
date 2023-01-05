// Archivo - Clase para el entendimiento de la abstracción 
public class Cuadrado extends Figura {
    public double vLados;

    public void setValores(int vLado) {
        this.vLados = vLado;
    }

    // implementacion del metodo abstracto
    public double area() {
        return vLados * vLados;
    }
}
