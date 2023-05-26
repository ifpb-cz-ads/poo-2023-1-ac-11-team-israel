import interfaces.PegadaDeCarbono;

class Carro implements PegadaDeCarbono {
    private double combustivelConsumido;
    private double distanciaPercorrida;

    public Carro(double combustivelConsumido, double distanciaPercorrida) {
        this.combustivelConsumido = combustivelConsumido;
        this.distanciaPercorrida = distanciaPercorrida;
    }

    public double getPegadaDeCarbono() {
        return combustivelConsumido * 2.5 + distanciaPercorrida * 0.1;
    }
}