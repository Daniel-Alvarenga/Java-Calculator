import javax.swing.*;
import java.awt.event.ActionEvent;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.awt.*;

public class calc {
    JFrame frame = new JFrame("Calculadora");

    JButton n1 = new JButton("1");
    JButton n2 = new JButton("2");
    JButton n3 = new JButton("3");
    JButton n4 = new JButton("4");
    JButton n5 = new JButton("5");
    JButton n6 = new JButton("6");
    JButton n7 = new JButton("7");
    JButton n8 = new JButton("8");
    JButton n9 = new JButton("9");
    JButton n0 = new JButton("0");

    JButton b0 = new JButton("C");
    JButton b1 = new JButton("=");
    JButton b2 = new JButton("x");
    JButton b3 = new JButton("/");
    JButton b4 = new JButton("-");
    JButton b5 = new JButton("+");
    JButton b6 = new JButton(".");

    JTextField input = new JTextField("");
    JLabel label = new JLabel("Calculadora");

    public calc(){

        frame.setVisible(true);
        frame.setSize(260, 320);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(111, 111, 111, 111));

        input.setBounds(20,5,160,50);
        input.setFont(new Font("Arial", Font.BOLD, 15));

        b0.setBounds(185,5,50,50);
        b0.addActionListener(this::btn00);
        b0.setBackground(new Color(226, 47, 0));
        b0.setForeground(new Color(255,255,255));

        n1.setBounds(20,60,50,50);
        n1.addActionListener(this::btn1);
        n2.setBounds(20,115,50,50);
        n2.addActionListener(this::btn2);
        n3.setBounds(20,170,50,50);
        n3.addActionListener(this::btn3);
        n0.setBounds(20,225,50,50);
        n0.addActionListener(this::btn0);

        n4.setBounds(75,60,50,50);
        n4.addActionListener(this::btn4);
        n5.setBounds(75,115,50,50);
        n5.addActionListener(this::btn5);
        n6.setBounds(75,170,50,50);
        n6.addActionListener(this::btn6);
        b5.setBounds(75,225,50,50);
        b5.addActionListener(this::btn15);

        n7.setBounds(130,60,50,50);
        n7.addActionListener(this::btn7);
        n8.setBounds(130,115,50,50);
        n8.addActionListener(this::btn8);
        n9.setBounds(130,170,50,50);
        n9.addActionListener(this::btn9);
        b6.setBounds(130,225,50,50);
        b6.addActionListener(this::btn16);

        b1.setBounds(185,60,50,50);
        b1.addActionListener(this::btn11);
        b2.setBounds(185,115,50,50);
        b2.addActionListener(this::btn12);
        b3.setBounds(185,170,50,50);
        b3.addActionListener(this::btn13);
        b4.setBounds(185,225,50,50);
        b4.addActionListener(this::btn14);

        n0.setBackground(new Color(226, 47, 0));
        n1.setBackground(new Color(226, 47, 0));
        n2.setBackground(new Color(226, 47, 0));
        n3.setBackground(new Color(226, 47, 0));
        n4.setBackground(new Color(226, 47, 0));
        n5.setBackground(new Color(226, 47, 0));
        n6.setBackground(new Color(226, 47, 0));
        n7.setBackground(new Color(226, 47, 0));
        n8.setBackground(new Color(226, 47, 0));
        n9.setBackground(new Color(226, 47, 0));
        b1.setBackground(new Color(226, 47, 0));
        b2.setBackground(new Color(226, 47, 0));
        b3.setBackground(new Color(226, 47, 0));
        b4.setBackground(new Color(226, 47, 0));
        b5.setBackground(new Color(226, 47, 0));
        b6.setBackground(new Color(226, 47, 0));

        n0.setForeground(new Color(255,255,255));
        n1.setForeground(new Color(255,255,255));
        n2.setForeground(new Color(255,255,255));
        n3.setForeground(new Color(255,255,255));
        n4.setForeground(new Color(255,255,255));
        n5.setForeground(new Color(255,255,255));
        n6.setForeground(new Color(255,255,255));
        n7.setForeground(new Color(255,255,255));
        n8.setForeground(new Color(255,255,255));
        n9.setForeground(new Color(255,255,255));
        b1.setForeground(new Color(255,255,255));
        b2.setForeground(new Color(255,255,255));
        b3.setForeground(new Color(255,255,255));
        b4.setForeground(new Color(255,255,255));
        b5.setForeground(new Color(255,255,255));
        b6.setForeground(new Color(255,255,255));

        frame.add(n0);
        frame.add(n1);
        frame.add(n2);
        frame.add(n3);
        frame.add(n4);
        frame.add(n5);
        frame.add(n6);
        frame.add(n7);
        frame.add(n8);
        frame.add(n9);
        frame.add(b0);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(input);

    }

    private void btn0(ActionEvent actionEvent) {
        input.setText(input.getText() + "0");
    }
    private void btn1(ActionEvent actionEvent) {
        input.setText(input.getText() + "1");
    }
    private void btn2(ActionEvent actionEvent) {
        input.setText(input.getText() + "2");
    }
    private void btn3(ActionEvent actionEvent) {
        input.setText(input.getText() + "3");
    }
    private void btn4(ActionEvent actionEvent) {
        input.setText(input.getText() + "4");
    }
    private void btn5(ActionEvent actionEvent) {
        input.setText(input.getText() + "5");
    }
    private void btn6(ActionEvent actionEvent) {
        input.setText(input.getText() + "6");
    }
    private void btn7(ActionEvent actionEvent) {
        input.setText(input.getText() + "7");
    }
    private void btn8(ActionEvent actionEvent) {
        input.setText(input.getText() + "8");
    }
    private void btn9(ActionEvent actionEvent) {
        input.setText(input.getText() + "9");
    }

    Double v1,v2;
    int s;

    private void btn00(ActionEvent actionEvent){
        input.setText("");
    }
    private void btn11(ActionEvent actionEvent) {
        v2 = Double.parseDouble(input.getText());
        input.setText("");

        if(s==1){
            Double R = v1*v2;
            input.setText("" + R);
        }else if(s==2){
            Double R = v1/v2;
            input.setText("" + R);
        }else if(s==3){
            Double R = v1-v2;
            input.setText("" + R);
        }else if(s==4){
            Double R = v1+v2;
            input.setText("" + R);
        }
    }
    private void btn12(ActionEvent actionEvent) {
        v1 = Double.parseDouble(input.getText());
        s=1;
        input.setText("");
    }
    private void btn13(ActionEvent actionEvent) {
        v1 = Double.parseDouble(input.getText());
        s=2;
        input.setText("");
    }
    private void btn14(ActionEvent actionEvent) {
        v1 = Double.parseDouble(input.getText());
        s=3;
        input.setText("");
    }
    private void btn15(ActionEvent actionEvent) {
        v1 = Double.parseDouble(input.getText());
        s=4;
        input.setText("");
    }
    private void btn16(ActionEvent actionEvent) {
        input.setText(input.getText() + ".");
    }
}
