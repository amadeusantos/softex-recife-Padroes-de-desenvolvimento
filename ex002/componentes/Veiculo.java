package ex002.componentes;

public abstract class Veiculo implements Prototype {

    private String modelo;

    private String marca;

    private String cor;

    private int numeroRodas;
    
    @Override
    public abstract Veiculo clone();
    
    public String reprensent() {
        return String.format("Modelo: %s\nMarca: %s\nCor: %s\nNúmero de rodas: %d\n", modelo, marca, cor, getNumeroRodas());
    }

    public Veiculo(String modelo, String marca, String cor) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String novoModelo) {
        this.modelo = novoModelo;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String novaMarca) {
        this.marca = novaMarca;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String novaCor) {
        this.cor = novaCor;
    }

    public int getNumeroRodas() {
        return this.numeroRodas;
    }

    public void setNumeroRodas(int numeroRodas) {
        this.numeroRodas = numeroRodas;
    }
}
