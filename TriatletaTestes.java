import interfaces.Triatleta;

public class TriatletaTestes {
    public class Main {
        public static void main(String[] args) {
            Triatleta triatleta = new Triatleta("João");
            triatleta.nadar();
            triatleta.correr();
            triatleta.correrDeBicicleta();
        }
    }
}
