// la clase Pastor hereda de la clase Perro
public class Pastor extends Perro{

    // constructor
    public Pastor(){
        // Llama al constructor de la clase Padre (Perro)
        super();
    }

    public Pastor(String nombre, String raza, int edad){
        // Llama al constructor de la clase Padre (Perro) con los 3 parametros
        // tienes que colocar los parametros dentro del super para poder inicializarlos
        super(nombre, raza, edad);
    }

    // metodos
    public void dormir() {
        System.out.println("El Perro esta durmiendo...");
    }

    // sobreescritura del metodo Comer
    @Override
    public void comer(){
        System.out.println("El Perro esta comiendo carne, vegetales y croquetas...");
    }
}
