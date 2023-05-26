import interfaces.PegadaDeCarbono;

class Bicicleta implements PegadaDeCarbono {
    private int numPessoas;
    private int distanciaPercorrida;

    public Bicicleta(int numPessoas, int distanciaPercorrida) {
        this.numPessoas = numPessoas;
        this.distanciaPercorrida = distanciaPercorrida;
    }

    public double getPegadaDeCarbono() {
        return numPessoas * 0.1 + distanciaPercorrida * 0.05;
    }
}