package ex001.componentes;

public class Server implements Computador {

    private double cpu;

    private int ram;

    private int hdd;

    private TypeEnum type;

    public Server(double gpu, int ram, int hdd) {
        this.cpu = gpu;
        this.ram = ram;
        this.hdd = hdd;
        this.type = TypeEnum.SERVER;
    }

    @Override
    public String getCpu() {
        return this.cpu + "GHz";
    }

    @Override
    public String getRam() {
        return this.ram + "GB";
    }

    @Override
    public String getHdd() {
        return this.hdd + "GB";
    }

    @Override
    public String getType() {
        
        return String.valueOf(type);
    }
    
    @Override
    public String toString() {
        return String.format("GPU: %.2f GHz\nRAM: %d GB\nHDD: %d GB\nType: Computador de Servidor", cpu, ram, hdd);
    }
}