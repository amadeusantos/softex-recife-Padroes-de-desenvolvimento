package ex001.componentes;

public class FabricaServer extends Fabrica {

    @Override
    public
    Computador fabricarComputador(double gpu, int ram, int hdd) {
        return new Server(gpu, ram, hdd);
    }
    
}
