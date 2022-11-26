package ex005.componentes;

public class Subtracao extends Strategy {

    @Override
    public int execute(int n1, int n2) {
        return n1 - n2;
    }
    
}
