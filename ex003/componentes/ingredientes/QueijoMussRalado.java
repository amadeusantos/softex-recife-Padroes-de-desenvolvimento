package ex003.componentes.ingredientes;

import ex003.componentes.IngredienteDecorator;
import ex003.componentes.Sanduiche;

public class QueijoMussRalado extends IngredienteDecorator {

    private Sanduiche sanduiche;

    public QueijoMussRalado(Sanduiche sanduiche) {
        this.sanduiche = sanduiche;
    }

    @Override
    public String getDescricao() {
        return sanduiche.getDescricao() + ", queijo mussarela ralado";
    }

    @Override
    public double custo() {
        return sanduiche.custo() + 2.00;
    }
    
}
