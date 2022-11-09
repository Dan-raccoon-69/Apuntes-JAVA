import javax.swing.JOptionPane;

public class Arreglos {
    private final int SEMESTRES = 6;
    private final double CALIFICACIONES[] = new double[SEMESTRES];
    private double calMinima;

    public Arreglos(double calMinima) {
        this.calMinima = calMinima;
    }

    private void pedirCalificaciones() {
        for (int i = 0; i < SEMESTRES; i++) {
            CALIFICACIONES[i] = Double
                    .parseDouble(JOptionPane.showInputDialog("Ingresa la calificación del semestre " + (i + 1) + ": "));
        }
    }

    public void calificacion() {
        double promedio, suma = 0;
        pedirCalificaciones();
        for (double item : CALIFICACIONES) {
            if (item >= calMinima)
                System.out.println("La calificación " + item + " es aprovatoria.");
            else
                System.err.println("La calificación " + item + " NO es aprovatoria.");

            suma += item;
        }
        promedio = suma / SEMESTRES;
        if (promedio >= calMinima)
            System.out.println("Tu promedio es: " + promedio + " APROBASTE");
        else
            System.out.println("Tu promedio es: " + promedio + " NO APROBASTE");
    }
}
