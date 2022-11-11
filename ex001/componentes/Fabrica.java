package ex001.componentes;

abstract class Fabrica {
    abstract Computador fabricarComputador(double gpu, int ram, int hdd);
}