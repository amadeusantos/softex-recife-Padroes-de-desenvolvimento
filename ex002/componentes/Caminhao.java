package ex002.componentes;

public class Caminhao extends Veiculo {

    private int comprimento;
    private int cargaMax;

    public Caminhao(String modelo, String marca, String cor, int nuemroRodas, int comprimento, int cargaMax) {
        super(modelo, marca, cor);
        super.setNumeroRodas(nuemroRodas);
        this.comprimento = comprimento;
        this.cargaMax = cargaMax;
    }

    @Override
    public Veiculo clone() {
        return new Caminhao(getModelo(), getMarca(), getCor(), getNumeroRodas(), comprimento, cargaMax);
    }

    @Override
    public String reprensent() {
        return super.reprensent() + String.format("Comprimento: %dm\nCarga máxima: %d toneladas", comprimento, cargaMax);
    }
    
}
