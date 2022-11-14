package ex003.componentes.sanduiches;

import ex003.componentes.Sanduiche;

public class FrangoAssado extends Sanduiche {

    public FrangoAssado() {
        super();
        super.descricao = "sanduíche de frango assado";
    }

    @Override
    public double custo() {
        return 4.50;
    }

}
