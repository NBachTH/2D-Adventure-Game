/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setResizable(false);
        jf.setTitle("game");

        Panel gp = new Panel();
        jf.add(gp);
        jf.pack();
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);

        gp.startGame();
    }
}
