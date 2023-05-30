package figuras;

/**
 * Esta clase representa una circunferencia y tiene varios atributos y métodos para manipular y obtener información sobre ella.
 */
public class Circunferencia {
    /**
     * Un número decimal que representa el radio de la circunferencia.
     */
    private double radio;
    /**
     * Una cadena de texto que representa el color de la circunferencia.
     */
    private String color;

    /**
     * Un constructor que recibe un parámetro radio y asigna su valor al atributo radio de la instancia de la circunferencia.
     *
     * @param radio
     */
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    /**
     * Muestra información sobre la circunferencia, incluyendo su diámetro, color y área. El diámetro se calcula como el doble del radio. El área se calcula utilizando la fórmula 2 * π * radio * radio.
     */
    public void imprimir() {
        color = "rojo";
        System.out.println("Di�metro: " + 2 * radio);
        System.out.println("Color: " + color);
        double area1 = 2 * 3.1416 * radio * radio;
        double area = area1;
        System.out.println(area);
    }

    /**
     * Compara el radio de la circunferencia actual con el radio de otra circunferencia pasada como parámetro. Si considerarDecimales es verdadero, se realiza una comparación exacta de los radios. De lo contrario, se realiza una comparación considerando un margen de diferencia de 1 unidad.
     *
     * @param considerarDecimales
     * @param otro
     * @return
     */
    public boolean esIgual(boolean considerarDecimales, Circunferencia otro) {
        double radio1 = this.radio;
        double radio2 = otro.getRadio();
        if (considerarDecimales) {
            if (radio1 == radio2)
                return true;
            else
                return false;
        } else {
            if (Math.abs(radio1 - radio2) < 1)
                return true;
            else
                return false;
        }
    }

    /**
     * Devuelve el valor del atributo radio
     *
     * @return
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Establece el valor del atributo radio utilizando el valor pasado como parámetro.
     *
     * @param radio
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * Devuelve el valor del atributo color.
     *
     * @return
     */
    public String getColor() {
        return color;
    }

    /**
     * Establece el valor del atributo color utilizando el valor pasado como parámetro.
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }
}

