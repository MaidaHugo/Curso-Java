package br.com.maida.cm;

import br.com.maida.cm.model.Tabuleiro;
import br.com.maida.cm.view.TabuleiroConsole;

public class Aplicacao {

    public static void main(String[] args) {

        Tabuleiro tabuleiro = new Tabuleiro(6, 6, 4);
        new TabuleiroConsole(tabuleiro);

    }

}
