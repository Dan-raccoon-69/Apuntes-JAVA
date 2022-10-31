import java.util.HashMap;
import java.util.Map;

public class Apuntes {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejecutando codigo Java desde VSC! \n");
        System.out.println("Mi nombre es Daniel Gustavo");

        // entrada de datos desde teclado
        // Scanner datos = new Scanner(System.in);

        // JAVA CARACTERISTICAS
        /**
         * Java es un lenguaje orientado a objetos.
         * Distribuido Multihilos
         * Seguro e independiente de la plataforma (windows,linux, mac) con tener la JVM
         * (java virtual machine)
         */

        // VERSIONES DE JAVA
        /**
         * JAVA SE: PARA PROPOSITOS GENERALES UTILIZADA EN APLICACIONES DE ESCRITORIO Y
         * SERVIDORES.
         * JAVA EE: PARA EL DESARROLLO DE APLICACIONES DISTRIBUIDAS QUE TRABAJAN SOBRE
         * INTERNET.
         * JAVA ME: PARA DISPOSITIVOS CON RECURSOS LIMITADOS TALES COMO DISPOSITIVOS
         * MOBILES, TV, IMPRESORAS.
         */

        // JAVA CONCEPTOS
        /**
         * JDK (JAVA DEVELOPMENT KIT): INCLUYE UN COMPILADOR, UN ENTORNO DE EJECUCION
         * (RUNTIME ENVIRONMENT)Y OTRAS HERRAMIENTAS PARA EL DESARROLLO DE APLICACIONES.
         */

        // TIPOS DE DATOS EN JAVA (primitivos)
        /**
         * ENTEROS ******
         * byte (–128 to 127)
         * short (–32,768 to 32,767)
         * int (–2,147,483,648 a 2,147,483,647)
         * long (–9,223,372,036,854,775,808 a 9,223,372,036,854,775,807)
         * Caracteres ******
         * char (cualquier caracter)
         * Deciales ******
         * float (debemos de colocar f al final del valor)
         * double (valores decimales muy grandes)
         * Booleanos ******
         * boolean (true o false)
         */

        /**
         * si declaramos:
         * char letra = 97;
         * me imprimira el caracter a, ya que el 97 hace referencia a la letra minuscula
         * a en el codigo ASCCI.
         */

        // CONSTANTES

        /**
         * Una constante es aquella variable que no cambia de valor a lo largo del
         * programa
         * para que sea una constante se le debe agregar la palabra final al principio.
         */

        final float pi = 3.1416f, euler = 2.8f;
        System.out.println("\n" + pi);
        System.out.println(euler + "\n");

        // CASTING

        int a = 5;
        int b = 2;
        float c = (float) a / (float) b;
        System.out.println(c);

        byte a1 = 8;
        byte b1 = 2;
        byte c1 = (byte) (a1 + b1);
        System.out.println(c1);

        float a2 = 8f;
        float b2 = 2.5f;
        float c2 = a2 + b2;
        System.out.println(c2 + "\n");

        // operador postIncremento preIncremento
        // preIncremento
        int PreIncremento = 0;
        System.out.println("PreIncremento " + ++PreIncremento);
        // postIncremento
        int PostIncremento = 0;
        System.out.println("PostIncremento " + PostIncremento++ + "\n");

        // ejemplo

        // preIncremento
        int preIncrementoa = 3;
        int preIncrementob = 2;
        int preIncrementoc = preIncrementoa * ++preIncrementob;
        System.out.println("preIncrementoa " + preIncrementoa); // 3
        System.out.println("preIncrementob " + preIncrementob); // 3
        System.out.println("preIncrementoc " + preIncrementoc + "\n"); // 9

        // postIncremento
        int postIncrementoa = 3;
        int postIncrementob = 2;
        int postIncrementoc = postIncrementoa * postIncrementob++;
        // primero multipica y luego suma la unidad a postIncrementob
        System.out.println("postIncrementoa " + postIncrementoa); // 3
        System.out.println("postIncrementob " + postIncrementob); // 3
        System.out.println("postIncrementoc " + postIncrementoc); // 9

        // RECOMENDACION: no utilices preIncremento ni postIncremento en una asignacion.
        // ejemplo: int postIncrementoc = postIncrementoa * postIncrementob++;

        // variable = variable + 1; === variable+=1; === variable++;

        /**
         * Operadores aritmeticos (+,-,*,/)
         * atento con las jeraquia de operaciones (con prioridad de izquierda a
         * derecha).
         */

        /**
         * Operadores logicos (AND, OR, NOT)
         * atento a las tablas de verdad de cada operador.
         */

        /**
         * Operadores relacionales (> mayor, < menor, >= mayor o igual, <= menor o
         * igual, == igual, != diferente)
         * siempre te dan un valor booleano.
         */

        /**
         * Operador Ternario (condicion : true ? false)
         * Dependiendo a la condicion, realizara el proceso del codigo true o false.
         */

        String cadena = (8 > 9) ? "Verdadero" : "Falso";
        System.out.println("\nOperador Ternario: " + cadena);

        // CADENAS
        /**
         * String no es un dato de tipo primitivo, es una CLASE.
         * podemos declararla como una variable normal o haciendo uns instancia de la
         * clase String:
         * String variable = new String ("Texto");
         */

        // Algunos metodos de los String
        String name = "Daniel, ese es mi nombre";
        System.out.println("\nTexto: " + name);
        System.out.println("Nombre en mayusculas':" + name.toUpperCase());
        System.out.println("Nombre en mayusculas':" + name.toLowerCase());
        // el metodo .trim(), quita los espacios en blanco del final y del inicio
        System.out.println("Longitud: " + name.length());
        boolean contienePalabra = name.contains("Daniel");
        System.out.println("Contiene 'Daniel':" + contienePalabra);
        System.out.println("Empieza con 'Daniel':" + name.startsWith("Daniel"));
        System.out.println("Termina con 'nombre':" + name.endsWith("Nombre"));
        // con chartAt(indice) obtenemos el caracteren esa posición
        /**
         * Con indexof('letra') conoceremos donde empieza nuestro caracter o cadena.
         * Si no existe retorna -1.
         * Puedes pasarle un segundo argumento, indica el indice a partir del cual se
         * iniciara la busqueda.
         */
        String mensajeTexto = "Hola Mundo";
        String mensajeTexto2 = "";
        int indiceLetraM = mensajeTexto.indexOf("M");
        System.out.println("Indexof: " + indiceLetraM);
        /**
         * Con subString(indiceInicial,indiceFinal) nos retornara parte de la cadena
         * basado en los indices que le estamos mandando.
         * Puedes pasarle un segundo argumento, indica el indiceFinal de la cadena.
         */
        String subString = mensajeTexto.substring(indiceLetraM, indiceLetraM + 2);
        System.out.println("SubString: " + subString);
        // con isEmpty(), comprobamos si la cadena esta vacia, regresa un false or true
        System.out.println("isEmpty: " + mensajeTexto2.isEmpty());
        // con format, format(" %s",variable de tipo String en este caso);
        String name2 = String.format("2do name: %s", "Gustavo");
        System.out.println("Usando format:" + name2);
        // tambien sirve para dar formato a los numeros
        float valorPi = 3.14166666f;
        // solo nos muestra 2 decimales
        String mensaje = String.format("%.2f", valorPi);
        // retorna un nuevo String
        System.out.println(mensaje);
        // si vas a usar format solo para mandar a imprimir, es mejor usar
        // printf(format,valor)

        // validar 2 cadenas
        // usamos el metodo equals
        String cadena1 = "Daniel";
        String cadena2 = "daniel";
        System.out.println("\n" + cadena1.equals(cadena2));
        // usamos el metodo equalsIgnoreCase para que tome como iguales mayusculas como
        // minusculas
        System.out.println(cadena1.equalsIgnoreCase(cadena2));

        // Caracteres especiales en las cadenas
        /**
         * \n: salto de linea
         * \t: tabulación
         * \r: retorno de carro
         * \": dobles comillas
         * \\: backslash
         */

        // Ciclos como for, while, do while, for each
        /**
         * for(inicio, condicion, aumento-decremento){ codigo }
         * while(codicion){codigo aumento-decremento }, piensa luego procesa.
         * do {codigo aumento-decremento } while(codicion), procesa y luego piensa.
         */

        // for each
        System.out.println("\nFor each ejemplos:");
        int datos[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for (int elemento : datos) {
            System.out.print(elemento + " ");
        }
        System.out.printf("\n");
        String datos2[] = { "daniel", "ana", "veronica", "edgar", "lizbeth", "antonio", "luis" };
        for (String elemento : datos2) {
            System.out.print(elemento + " ");
        }

        System.out.println("\n\nFor Each con mapas");
        // for each en mapas
        Map<Integer, String> nombres = new HashMap<>();
        nombres.put(1, "daniel");
        nombres.put(2, "ana");
        nombres.put(3, "veronica");
        nombres.put(4, "edgar");
        nombres.put(5, "lizbeth");
        nombres.put(6, "antonio");
        nombres.put(7, "luis");

        // recorriendo e imprimiendo
        nombres.forEach((indice, valor) -> {
            System.out.println("ID: " + indice + " Nombre: " + valor);
        });
        System.out.println("");

        // Ademas tenemos sentencias como BREAK y CONTINUE
        /*
         * break: corta el proceso de un ciclo,se sale del programa sin importar si no
         * termino las iteraciones.
         * continue: pasa a la siguiente iteración
         */

        // ARREGLOS
        /**
         * Son una coleccion de datos del mismo tipo de valor, un arreglo debe de tener
         * un tamaño especifico.
         * Siempre necesitamos saber el tamaño para poder declarar un arreglo.
         * Puede almacenar tipos de datos primitivos o referencias de objetos.
         * Si almaceno enteros, solo podre almacenar enteros, si almaceno cadena
         * entonces solo seran cadenas.
         */

        // declaracion de un arreglo

        // arreglo lleno
        int numeros[] = { 10, 9, -8, 7, -6, 5, 14, 86 };

        // arreglo vacio con 6 espacios en memoria
        // int numeros1 [] = new int[6];

        // Para poder acceder a un valor del arreglo se necesita un indice, el indice
        // comienza desde 0.
        // Guardamos en numero1, el valor que hay en la posicion 0 del arreglo numeros.
        int numero1 = numeros[0];
        int numero2 = numeros[1];

        // Asignarle un nuevo valor a un elemento del arreglo
        numeros[1] = 69;

        // Mandando imprimir
        System.out.println("Numero [0]: " + numero1);
        System.out.println("Numero [1]: " + numero2);
        System.out.println("Cantidad de elementos en el arreglo Numero: " + numeros.length);
        System.out.println("Imprimiendo Arreglo: ");
        for (int elemento : numeros) {
            System.out.print(elemento + " ");
        }

        // ORDENACION BURBUJA

        /**
         * No es recomendado usarlo en producción, no son optimos.
         * Es el metodo de ordenación mas facil de implementar.
         * Adecuado para personas que empiezan a programar, entender como podemos
         * ordenar y buscar.
         */

        // llenado con valores aleatorios

        int valoresAleatorios[] = new int[10];
        for (int i = 0; i < valoresAleatorios.length; i++) {
            valoresAleatorios[i] = (int) ((Math.random() * 100) + 1);
        }
        // imprimiendo
        System.out.println("\n\nOrdenacion burbuja\n" + "Imprimiendo Arreglo: ");

        for (int valor : valoresAleatorios) {
            System.out.print(valor + " ");
        }

        // ordenación burbuja
        int aux = 0;
        for (int i = 0; i < valoresAleatorios.length - 1; i++) {
            for (int j = 0; j < valoresAleatorios.length - 1; j++) {
                if (valoresAleatorios[j] > valoresAleatorios[j + 1]) {
                    aux = valoresAleatorios[j + 1];
                    valoresAleatorios[j + 1] = valoresAleatorios[j];
                    valoresAleatorios[j] = aux;
                }
            }
        }

        // imprimiendo arreglo ordenado
        System.out.println("\nOrdenados: ");
        for (int valor : valoresAleatorios) {
            System.out.print(valor + " ");
        }

        // Busqueda lineal
        /**
         * Ineficiente, ya que recorre todo el arreglo hasta encontrar el dato a buscar.
         * Tenemos metodos mas eficientes como la busqueda binaria, pero el arreglo debe
         * estar ordenado.
         */
        System.out.println("\nBusqueda: ");
        valoresAleatorios[5] = 69;
        int x = 69;
        for (int i = 0; i < valoresAleatorios.length; i++) {
            if (valoresAleatorios[i] == x) {
                System.out.println("El numero " + x + " se encuentra en la posición " + i);
                break;
            }
        }

        // MATRICES O ARREGLO BIDIMENCIONALES

        /**
         * Arreglo en 2 o mas dimenciones
         * Sigue los mismos principios que los arreglos normales.
         */

        // declaración
        int matriz[][] = new int[3][3];
        // agregando valores desde teclado - consola
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = i + j;
            }
        }

        // imprimiendo con un for normal
        System.out.println("Matriz de 3 x 3");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        // imprmiendo con un for each
        System.out.println("Matriz con ForEach");
        for (int fila[] : matriz) {
            for (int columna : fila) {
                System.out.print(columna);
            }
            System.out.println("");
        }

        // Clases para cada tipo primitivo, "clases envolventes-envoltorio"
        /**
         * boolean -> Boolean
         * char -> Character
         * byte -> Byte
         * short -> Short
         * int -> Integer
         * long -> Long
         * float -> Float
         * double -> Double
         * 
         * Cada clase tiene metodos interesantes para transformar valores primitivos en
         * cadenas de caracteres y viceversa.
         */

        System.out.println();
        // CLASE INTEGER
        // pasar una cadena de caracteres a un numero entero
        int entero = Integer.parseInt("12345");
        System.out.println("Entero: " + entero);
        // metodo max, obtener el maximo entre 2 numeros
        System.out.println("Maximo: " + Integer.max(69, 666));
        /*
         * Podemos obtener la representación binaria, hexadecima u octal de un numero
         * entero.
         */
        System.out.println("Binario de 15: " + Integer.toBinaryString(15));
        System.out.println("Octal de 15: " + Integer.toOctalString(15));
        System.out.println("Hexadecimal de 15: " + Integer.toHexString(15));

        // CLASE Character
        // Saber si un caracter es letra o número
        char $letra = 'a';
        System.out.println();
        System.out.println("Es letra?: " + Character.isAlphabetic($letra));
        System.out.println("Es número?: " + Character.isDigit($letra));

        // CLASE Boolean
        System.out.println();
        boolean verdadero1 = true;
        boolean verdadero2 = true;
        boolean false1 = false;
        System.out.println("Es AND?: " + Boolean.logicalAnd(verdadero1, false1));
        System.out.println("Es OR?: " + Boolean.logicalOr(verdadero1, false1));
        System.out.println("Es XOR?: " + Boolean.logicalXor(false1, verdadero2));
    }
}
