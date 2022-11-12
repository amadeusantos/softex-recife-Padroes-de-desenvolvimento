package ex002.componentes;

public class Carro extends Veiculo {

    private int numeroPortas;
    private double litrosPortaMalas;

    public Carro(String modelo, String marca, String cor, int numeroRodas, int numeroPortas, double litrosPortaMalas) {
        super(modelo, marca, cor);
        super.setNumeroRodas(numeroRodas);
        this.numeroPortas = numeroPortas;
        this.litrosPortaMalas = litrosPortaMalas;
    }

    @Override
    public Veiculo clone() {
        return new Carro(this.getModelo(), this.getMarca(), this.getCor(), this.getNumeroRodas(), this.numeroPortas, this.litrosPortaMalas);
    }

    @Override
    public String reprensent() {
        return super.reprensent() + String.format("Número de portas: %d\nCapacidade do porta-malas: %.2f", numeroPortas, litrosPortaMalas);
    }
    
}
