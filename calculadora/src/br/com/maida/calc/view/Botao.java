package br.com.maida.calc.view;

import java.awt.*;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class Botao extends JButton {

    public Botao(String texto, Color cor) {

        setText(texto);
        setOpaque(true);
        setFocusPainted(false);
        setBackground(cor);
        setForeground(Color.WHITE);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        setFont(new Font("roboto", Font.PLAIN, 25));

    }

}
