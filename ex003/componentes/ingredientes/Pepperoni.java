package ex003.componentes.ingredientes;

import ex003.componentes.IngredienteDecorator;
import ex003.componentes.Sanduiche;

public class Pepperoni extends IngredienteDecorator {

    private Sanduiche sanduiche;

    public Pepperoni(Sanduiche sanduiche) {
        this.sanduiche = sanduiche;
    }

    @Override
    public String getDescricao() {
        return sanduiche.getDescricao() + ", peperroni";
    }

    @Override
    public double custo() {
        return sanduiche.custo() + 0.99;
    }
    
}
