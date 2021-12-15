package POOII;

import java.util.Scanner;

public class JavaPOO1 {
    public static void main (String[] args){

        String[] lista = {"Nombre", "Apellido", "Edad", "Hobbie", "Editor Favorito", "Sistema Operativo que usas"};
        String[] array;
        array = new String[6];

//creo el objeto con el nombre persona.
        Persona persona = new Persona();
//ingreso los valores por medio de un Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Hola! Vamos a ingresar tus datos para darte de alta!\n");
        for (int i = 0; i < lista.length; i++) {

            System.out.println("Ingresá el siguiente dato: " + lista[i]);
            String valor = input.nextLine();

            array[i] = valor;
        }
        //Seteo los valores pedidos en el Setter correspondiente.
        persona.setAll(array);
        //Imprimo los valores ingresados por consola.
        persona.getAll();
    }

}
