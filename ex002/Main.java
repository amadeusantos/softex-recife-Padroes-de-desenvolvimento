package ex002;

import ex002.componentes.Veiculo;

public class Main {
    public static void main(String[] args) {
        Aplicacao aplicacao = new Aplicacao();
        Veiculo[] veiculos = aplicacao.listarVeiculos();
        for (Veiculo veiculo: veiculos){ 
            System.out.println("<=========Veiculo=========>");
            System.out.println(veiculo.reprensent());
        }
    }
}
