package utilidades;

import figuras.Circunferencia;

/**
 * La clase proporcionada se llama "Test" y pertenece al paquete "utilidades". Esta clase contiene un método main que sirve como punto de entrada del programa.
 */
public class Test {
    /**
     * Este método es el punto de entrada del programa. Aquí se realizan varias operaciones con instancias de la clase "Circunferencia" para probar su funcionalidad.
     *
     * @param args
     */
    public static void main(String[] args) {
        /**
         * Se crean varias instancias de la clase "Circunferencia" utilizando diferentes valores de radio.
         */
        Circunferencia c1 = new Circunferencia(5.5);
        Circunferencia c2 = new Circunferencia(10.1);
        Circunferencia c3 = new Circunferencia(10.9);
        Circunferencia circunferencia = new Circunferencia(5.0);
        /**
         * Se llama al método imprimir de la instancia circunferencia para mostrar información sobre la circunferencia.
         */
        circunferencia.imprimir();
        /**
         * Se utilizan las estructuras de control if para realizar comparaciones entre las instancias c2 y c3 utilizando el método esIgual de la clase "Circunferencia". Dependiendo de los resultados, se imprime un mensaje indicando si las circunferencias son iguales o no considerando o no los decimales.
         */

        if (c2.esIgual(false, c3))
            System.out.println("c2 y c3: iguales sin considerar decimales");

        if (c2.esIgual(true, c3))
            System.out.println("c2 y c3: iguales considerando decimales");
    }

}
