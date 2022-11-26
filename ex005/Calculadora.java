package ex005;

import java.util.Scanner;

import ex005.componentes.Multiplicacao;
import ex005.componentes.Soma;
import ex005.componentes.Strategy;
import ex005.componentes.Subtracao;

public class Calculadora {

    private static int calcular(int n1, int n2, char operador) {
        Strategy strategy;
        switch (operador) {
            case('+'): {
                strategy = new Soma();
                return strategy.execute(n1, n2);
            }
            case('-'): {
                strategy = new Subtracao();
                return strategy.execute(n1, n2);
            }
            case('*'): {
                strategy = new Multiplicacao();
                return strategy.execute(n1, n2);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            int n1, n2;
            char operador;
            n1 = teclado.nextInt();
            operador = teclado.next().strip().charAt(0);
            n2 = teclado.nextInt();
            System.out.println(Calculadora.calcular(n1, n2, operador));
        }

    }
        
    
}
