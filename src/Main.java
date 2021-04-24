/*
 * Programa que simula las operaciones básicas de una calculadora además de algunas funciones adicionales como inversa, cambio de signo automático de una entrada, borrado de las entradas más recientes y borrado total.
 * 
 * - Diseño de formulario de calculadora a través de métodos de clases propias de JAVA "javax.swing" (mediante ventana estándar Jframe). 
 * - Implementación de lógica a los objetos resultantes de la clase propia swing con bases y contenedores, layouts y eventos sencillos.
 * 
 * @author Carlos Daniel Martínez Ávila
 * @version 1.0
 */

public class Main {

    public static void main(String[] args) {
    calculadora micalculadora = new calculadora();
        //Indicación para que cuando se abra, se ubique en la mitad de la pantalla al pasarle el parámetro null
        micalculadora.setLocationRelativeTo(null);
        //Se permite la visibilidad del objeto principal creado
        micalculadora.setVisible(true);
	}
}