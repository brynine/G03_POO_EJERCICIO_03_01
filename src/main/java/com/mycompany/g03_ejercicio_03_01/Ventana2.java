package com.mycompany.g03_ejercicio_03_01;

import java.awt.Button;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Point;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author USER
 */
public class Ventana2 extends JFrame {

    public JPanel panel;

    public Ventana2(String title) {
        this.setTitle(title);
        this.setSize(new Dimension(300, 160));
        this.setLocation(new Point(300, 10));
        iniciarComponentes();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    private void colocarPaneles() {
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        this.panel.setLayout(new GridLayout(3, 2));
    }

    private void iniciarComponentes() {
        colocarPaneles();
        colocarBotones();
    }

    private void colocarBotones() {
        JButton boton1 = new JButton();
        boton1.setText("Button 1");
        boton1.setEnabled(true);
        panel.add(boton1);

        JButton boton2 = new JButton();
        boton2.setText("Button 3");
        boton2.setEnabled(true);
        panel.add(boton2);

        JButton boton3 = new JButton();
        boton3.setText("Button 5");
        boton3.setEnabled(true);
        panel.add(boton3);

        JButton boton4 = new JButton();
        boton4.setText("2");
        boton4.setEnabled(true);
        panel.add(boton4);

        JButton boton5 = new JButton();
        boton5.setText("Long-Named Button 4");
        boton5.setEnabled(true);
        panel.add(boton5);

    }
}
