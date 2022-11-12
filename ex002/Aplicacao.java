package ex002;

import ex002.componentes.*;

public class Aplicacao {
    private Veiculo[] veiculos = new Veiculo[6];

    public Aplicacao() {
        veiculos[0] = new Carro("GT-R", "Nissan", "Branco", 4, 2, 315).clone();
        veiculos[1] = new Carro("Corvette", "Chevrolet", "Azul Metálico", 4, 2, 357).clone();
        veiculos[2] = new Carro("Panamera", "Porsche", "Preto Metálico", 4, 4, 495).clone();
        veiculos[3] = new Caminhao("FMX", "Volvo", "Prata", 6, 6, 36).clone();
        veiculos[4] = new Caminhao("Linha R", "Scania", "Azul", 10, 8, 80).clone();
        veiculos[5] = new Caminhao("Constellantion", "Volkswagen", "Prata", 10, 10, 36).clone();
    }

    public Veiculo[] listarVeiculos() {
        Veiculo[] clone = new Veiculo[6];
        for (int i = 0; i < 6; i++) clone[i] = veiculos[i].clone();
        return veiculos;
    }
}
