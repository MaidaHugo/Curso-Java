package br.com.maida.calc.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.maida.calc.model.Memoria;
import br.com.maida.calc.model.MemoriaObservador;

public class Display extends JPanel implements MemoriaObservador {

    private final JLabel label;

    public Display() {
        Memoria.getInstancia().adicionarObservador(this);

        setBackground(new Color(46, 49, 50));
        label = new JLabel(Memoria.getInstancia().getTextoAtual());
        label.setForeground(Color.WHITE);
        label.setFont(new Font("roboto", Font.PLAIN, 30));

        setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 18));

        add(label);

    }

    @Override
    public void valorAlterado(String novoValor) {
        label.setText(novoValor);
    }

}
