package ex004;

import ex004.componentes.AdaptadorPato;
import ex004.componentes.Galinha;
import ex004.componentes.Pato;
import ex004.componentes.PatoReal;

public class AdptadorPatoDemo {
    public static void main(String[] args) {
        Pato patoReal = new PatoReal();
        Galinha galinha = new AdaptadorPato(patoReal);

        System.out.println(patoReal.fazerQuaQua());
        System.out.println(patoReal.voar());

        System.out.println(galinha.fazerCocorico());
        System.out.println(galinha.voar());
    }
    
}
