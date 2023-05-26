import java.util.ArrayList;
import interfaces.*;

public class TesteFormas {
    public static void main(String[] args) {
        ArrayList<FormaGeometrica> formas = new ArrayList<>();

        Retangulo retangulo = new Retangulo(4, 6);
        Quadrado quadrado = new Quadrado(5);
        Circulo circulo = new Circulo(3);

        formas.add(retangulo);
        formas.add(quadrado);
        formas.add(circulo);

        for (FormaGeometrica forma : formas) {
            if (forma instanceof Quadrilatero) {
                Quadrilatero quadrilatero = (Quadrilatero) forma;
                System.out.println("Lados: " + quadrilatero.getLado1() + ", " + quadrilatero.getLado2() + ", "
                        + quadrilatero.getLado3() + ", " + quadrilatero.getLado4());
            } else if (forma instanceof Circulo) {
                Circulo c = (Circulo) forma;
                System.out.println("Raio: " + c.getRaio());
            }

            System.out.println("Perímetro: " + forma.calcularPerimetro());
            System.out.println("Área: " + forma.calcularArea());
            System.out.println();
        }
    }
}
