package ru.geekbrains.java_one.lesson_g.online;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame {
    private static final int WIN_WIDTH = 507;
    private static final int WIN_HEIGHT = 555;
    private static final int WIN_POSX = 650;
    private static final int WIN_POSY = 250;
    private final Map map; GameWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(WIN_WIDTH, WIN_HEIGHT);
        setLocation(WIN_POSX, WIN_POSY);
        setResizable(false);
        setTitle("Tic Tac Toe");
        JButton btnStart = new JButton("Start");
        JButton btnExit = new JButton("Exit");
        //JPanel panelBottom = new JPanel(new GridLayout(1, 2));
      //  JPanel panelLeft = new JPanel();
      //  JPanel panelRight = new JPanel();
        //panelBottom.add(btnStart);
       // panelLeft.add(btnStart);
        //panelBottom.add(btnExit);
        //panelRight.add(btnExit);
        Settings settings = new Settings(this);
        map = new Map();
        btnExit.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnStart.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
                settings.setVisible(true);
            }
        }); add(map, BorderLayout.CENTER);
       // add(panelLeft, BorderLayout.WEST);
       // add(panelRight, BorderLayout.EAST);

        add(btnStart, BorderLayout.WEST);
        add(btnExit, BorderLayout.EAST);
        setVisible(true);
    }
    void startNewGame(int gameMode, int fieldSizeX, int fieldSizeY, int winLen) {
        map.startNewGame(gameMode, fieldSizeX, fieldSizeY, winLen); }
}