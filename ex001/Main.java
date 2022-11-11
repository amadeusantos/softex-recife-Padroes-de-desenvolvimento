package ex001;

import ex001.componentes.*;

public class Main {
    public static void main(String[] args) {
        
        Computador pc = new FabricaPc().fabricarComputador(2.0, 4, 500);
        Computador server = new FabricaServer().fabricarComputador(5.6, 512, 102400);

        System.out.println("<+++++PC+++++>");
        System.out.println(pc);
        System.out.println("<+++++Server+++++>");
        System.out.println(server);

    }
}
