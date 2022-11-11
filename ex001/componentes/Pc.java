package ex001.componentes;

public class Pc implements Computador {

    private double cpu;

    private int ram;

    private int hdd;

    private TypeEnum type;

    public Pc(double gpu, int ram, int hdd) {
        this.cpu = gpu;
        this.ram = ram;
        this.hdd = hdd;
        this.type = TypeEnum.PC;
    }

    @Override
    public String getCpu() {
        return this.cpu + "GHz";
    }

    @Override
    public String getRam() {
        return this.ram + "GB";
    }

    public void setRam(int memoria) {
        this.ram = memoria;
    }

    @Override
    public String getHdd() {
        return this.hdd + "GB";
    }

    public void setHdd(int memoria) {
        this.hdd = memoria;
    }

    @Override
    public String getType() {
        
        return String.valueOf(type);
    }

    @Override
    public String toString() {
        return String.format("GPU: %.2f GHz\nRAM: %d GB \nHDD: %d GB\nType: Computador Pessoal(PC)", cpu, ram, hdd);
    }
    
}
