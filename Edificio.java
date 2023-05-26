import interfaces.PegadaDeCarbono;

class Edificio implements PegadaDeCarbono {
    private int numPessoas;
    private double consumoEnergia;

    public Edificio(int numPessoas, double consumoEnergia) {
        this.numPessoas = numPessoas;
        this.consumoEnergia = consumoEnergia;
    }

    public double getPegadaDeCarbono() {
        return numPessoas * 0.8 + consumoEnergia * 0.2;
    }
}