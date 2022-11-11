package ex001.componentes;

public class FabricaPc extends Fabrica {

    @Override
    public
    Computador fabricarComputador(double gpu, int ram, int hdd) {
        return new Pc(gpu, ram, hdd);
    }
    
}
