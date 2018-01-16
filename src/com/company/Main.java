package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	JFrame pane = new JFrame();
	GamePlayArkanoid gamePlayArkanoid = new GamePlayArkanoid();
	pane.setBounds(10,10,700,600);
	pane.setTitle("Arkanoid");
	pane.setResizable(false);
	pane.setVisible(true);
	pane.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pane.add(gamePlayArkanoid);
    }
}
