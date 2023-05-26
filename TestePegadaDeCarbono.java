import java.util.ArrayList;
import interfaces.PegadaDeCarbono;

public class TestePegadaDeCarbono {
    public static void main(String[] args) {
        ArrayList<PegadaDeCarbono> objetos = new ArrayList<>();
        
        Edificio edificio = new Edificio(100, 5000);
        Carro carro = new Carro(100, 200);
        Bicicleta bicicleta = new Bicicleta(1, 10);
        
        objetos.add(edificio);
        objetos.add(carro);
        objetos.add(bicicleta);
        
        for (PegadaDeCarbono objeto : objetos) {
            System.out.println("Pegada de Carbono:");
            System.out.println("Tipo de objeto: " + objeto.getClass().getSimpleName());
            System.out.println("Valor: " + objeto.getPegadaDeCarbono());
            System.out.println();
        }
    }
}