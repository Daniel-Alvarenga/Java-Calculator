import javax.swing.*;


import java.awt.event.ActionEvent;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.awt.*;

public class Menu {
    JFrame frame = new JFrame("Menu");

    JButton n1 = new JButton("Calculadora");
    JButton n2 = new JButton("Juros Simples");
    JButton n3 = new JButton("Juros Compostos");
    JButton n4 = new JButton("Cotação");

    public Menu(){

        frame.setVisible(true);
        frame.setSize(250, 365);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(111, 111, 111, 111));

        n1.setBounds(25,60,200,50);
        n1.addActionListener(this::btn1);
        n2.setBounds(25,115,200,50);
        n2.addActionListener(this::btn2);
        n3.setBounds(25,170,200,50);
        n3.addActionListener(this::btn3);
        n4.setBounds(25,225,200,50);
        n4.addActionListener(this::btn4);
        
        n1.setBackground(new Color(226, 47, 0));
        n2.setBackground(new Color(226, 47, 0));
        n3.setBackground(new Color(226, 47, 0));
        n4.setBackground(new Color(226, 47, 0));
        
        n1.setForeground(new Color(255,255,255));
        n2.setForeground(new Color(255,255,255));
        n3.setForeground(new Color(255,255,255));
        n4.setForeground(new Color(255,255,255));
        
        frame.add(n1);
        frame.add(n2);
        frame.add(n3);
        frame.add(n4);
        
        frame.requestFocus();
    }

    private void btn1(ActionEvent actionEvent) {
        new calc();
    }
    private void btn2(ActionEvent actionEvent) {
        new jurosSimples();
    }
    private void btn3(ActionEvent actionEvent) {
        new jurosCompostos();
    }
    private void btn4(ActionEvent actionEvent) {
        new cotacao();
    }
      
}
