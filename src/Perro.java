// archivo para el aprendizaje de la POO
public class Perro {
    private String nombre;
    private String raza;
    private int edad;

    /**
     * El metodo constructor nos sirve para inicializar valores, el cual recibe los
     * parametros que seran el valor de cada uno de sus atributos.
     * Usamos this para hacer referencia al objeto
     * Se declara de esta manera:
     */
    public Perro(){
        
    }
    public Perro(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    /**
     * metodos set -> establecer o modificar un valor
     * reciben como parametro el atributo el cual se va establecer o modificar
     * usan this para hacer referencia al objeto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * metodos get -> nos retornan el valor pedido
     * debes de colocar que tipo de dato te va a retornar
     */
    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    // metodos
    public void comer() {
        System.out.println("El Perro esta comiendo...");
    }

    public void ladrar() {
        System.out.println("El Perro esta ladrando...");
    }

    public void jugar() {
        System.out.println("El Perro esta jugando...");
    }

    @Override
    // El metodo toString nos srive para mostrar los datos del objeto
    public String toString() {
        return "Perro [nombre = " + nombre + ", raza = " + raza + ", edad = " + edad + "]";
    }
}