package ex003;

import ex003.componentes.Sanduiche;
import ex003.componentes.ingredientes.Pepperoni;
import ex003.componentes.ingredientes.QueijoMussRalado;
import ex003.componentes.sanduiches.FrangoAssado;

public class Restaurante {
    public static void main(String[] args) {
        Sanduiche sanduiche = new FrangoAssado();
        sanduiche = new Pepperoni(sanduiche);
        sanduiche = new QueijoMussRalado(sanduiche);

        System.out.println("O " + sanduiche.getDescricao());
        System.out.printf("custa R$%.2f", sanduiche.custo());
    }
    
}
