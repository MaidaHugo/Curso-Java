package br.com.maida.calc.model;

@FunctionalInterface
public interface MemoriaObservador {

    void valorAlterado(String novoValor);

}
