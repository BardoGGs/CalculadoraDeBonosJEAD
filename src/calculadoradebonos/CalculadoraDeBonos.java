package calculadoradebonos;

/**
 *
 * @author El Esteban Grrrrrr
 *
 * Este programa calcula e imprime el bono por trabajo de una persona.
 *
 */
public class CalculadoraDeBonos {

    public static void calcular() {

        int salario; // salario de una persona
        String mensajeDeBono; // especifica el bono de trabajo
        salario = 50000;
        
        mensajeDeBono = "Bono = $" + (.02 * salario);
        System.out.println(mensajeDeBono);

    }
public static void main(String[]args){
    CalculadoraDeBonos calcular = new CalculadoraDeBonos();
    calcular.calcular();
}
}
