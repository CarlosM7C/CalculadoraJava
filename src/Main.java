/*
 * Programa que simula las operaciones b�sicas de una calculadora adem�s de algunas funciones adicionales como inversa, cambio de signo autom�tico de una entrada, borrado de las entradas m�s recientes y borrado total.
 * 
 * - Dise�o de formulario de calculadora a trav�s de m�todos de clases propias de JAVA "javax.swing" (mediante ventana est�ndar Jframe). 
 * - Implementaci�n de l�gica a los objetos resultantes de la clase propia swing con bases y contenedores, layouts y eventos sencillos.
 * 
 * @author Carlos Daniel Mart�nez �vila
 * @version 1.0
 */

public class Main {

    public static void main(String[] args) {
    calculadora micalculadora = new calculadora();
        //Indicaci�n para que cuando se abra, se ubique en la mitad de la pantalla al pasarle el par�metro null
        micalculadora.setLocationRelativeTo(null);
        //Se permite la visibilidad del objeto principal creado
        micalculadora.setVisible(true);
	}
}