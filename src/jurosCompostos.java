import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.awt.*;
import java.awt.event.*;

import java.awt.event.ActionEvent;

public class jurosCompostos {


  String a = "";
  JFrame frame = new JFrame("Juros Compostos");
  JTextField input1 = new JTextField("");
  JTextField input2 = new JTextField("");
  JTextField input3 = new JTextField("");
  JButton btn = new JButton("Calcular");
  JLabel label1 = new JLabel("Capital inicial:");
  JLabel label2 = new JLabel("Taxa de rendimento periódica:");
  JLabel label3 = new JLabel("Quantidade de períodos:");

  JLabel label =  new JLabel("Montante final:");
  JTextField input = new JTextField();



  public jurosCompostos(){
    
    frame.setVisible(true);
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(111, 111, 111, 111));

        input.setFont(new Font("Arial",Font.BOLD,18));
        input.setBounds(200, 372, 150, 28);  
        label.setBounds(50, 372, 130, 28);
        label.setFont(new Font("Arial",Font.BOLD,18));

        input1.setFont(new Font("Arial",Font.BOLD,18));
        input1.setBounds(50, 70, 300, 28);
        label1.setBounds(50, 40, 300, 28);
        label1.setFont(new Font("Arial",Font.BOLD,18));

        input2.setFont(new Font("Arial",Font.BOLD,18));
        input2.setBounds(50, 135, 300, 28);      
        label2.setBounds(50, 105, 300, 28);
        label2.setFont(new Font("Arial",Font.BOLD,18));

        input3.setFont(new Font("Arial",Font.BOLD,18)); 
        input3.setBounds(50, 210, 300, 28);
        label3.setBounds(50, 180, 300, 28);
        label3.setFont(new Font("Arial",Font.BOLD,18));

        btn.setBounds(125,275,150,50);
        btn.setBackground(new Color(226, 47, 0));
        btn.setForeground(new Color(255,255,255));
        btn.addActionListener(this::btna);

        frame.add(input1);
        frame.add(input2);
        frame.add(input3);
        frame.add(input);

        frame.add(label);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);

        frame.add(btn);

        frame.requestFocus();
  }
  private void btna(ActionEvent actionEvent) {
    if (btn.getText()=="Calcular"){
      if(input1.getText().equals("") || input2.getText().equals("") ||input3.getText().equals("") ){
        JOptionPane.showMessageDialog(null,"Preencha todos os campos!", "ERRO", JOptionPane.ERROR_MESSAGE);
      }
      else {

        int x,y=0;

        String inp1, inp2, inp3;

        inp1 = input1.getText();
        inp2 = input2.getText();
        inp3 = input3.getText();

        if(input1.getText().contains(",")){inp1 = inp1.replace(",",".");
            input1.setText(inp1);
        }
        if(input1.getText().contains("R$")){inp1 = inp1.replace("R$","");
            input1.setText(inp1);
        }
        if(input2.getText().contains(",")){inp2 = inp2.replace(",",".");
          input2.setText(inp2);
        }
        if(input2.getText().contains("%")){inp2 = inp2.replace("%","");
          input2.setText(inp2);
        }
        if(input3.getText().contains(",") ||input3.getText().contains(".")){
          JOptionPane.showMessageDialog(null,"O tempo deve ser um valor inteiro!", "VALOR INVÁLIDO", JOptionPane.ERROR_MESSAGE);
          y = 1;
        }

        String[] d2, e2, b2;

        d2 = input1.getText().split("");
        e2 = input2.getText().split("");
        b2 = inp3.split("");

        String caracteres = "0123456789.";

        int d1, e1, b1;
        d1 = input1.getText().length();
        e1 = input2.getText().length();
        b1 = input3.getText().length();

        for(x =0 ; x<b1; x++){
          if(!caracteres.contains(b2[x]) && y==0){
            JOptionPane.showMessageDialog(null,"Preencha os campos com números somente!", "ERRO", JOptionPane.ERROR_MESSAGE);
            y=1;
          }
        }

        for(x =0 ; x<d1; x++){
          if(!caracteres.contains(d2[x]) && y==0){
            JOptionPane.showMessageDialog(null,"Preencha os campos com números somente!", "ERRO", JOptionPane.ERROR_MESSAGE);
            y=1;
          }
        }

        for(x =0 ; x<e1; x++){
          if(!caracteres.contains(e2[x]) && y==0){
            JOptionPane.showMessageDialog(null,"Preencha os campos com números somente!", "ERRO", JOptionPane.ERROR_MESSAGE);
            y=1;
          }
        }

        if(y == 0){
          float i, t, c;
          i=0; t=0; c=0;
          c = Float.parseFloat(input1.getText());
          i = Float.parseFloat(input2.getText())/100;
          t = Float.parseFloat(input3.getText());

          float m = c*(1 + i);

          for(x=1; x<t; x++){
            m = m*(1+ i);
          }

          input.setText(""+  m);

          Double v1, v2, v3, v4;
          String m1, m2, m3, m4;
          v1 = Double.parseDouble(input.getText());
          v2 = Double.parseDouble(input1.getText());
          v3 = Double.parseDouble(input2.getText());
          v4 = Double.parseDouble(input3.getText());

          m1 = String.format("%.2f", v1);
          m2 = String.format("%.2f", v2);
          m3 = String.format("%.2f", v3);
          m4 = String.format("%.2f", v4);

          if((m1.length())>6){
            m1 = formatarnumero(m1);
          }
          if((m2.length())>6){
            m2 = formatarnumero(m2);
          }
          if((m3.length())>6){
            m3 = formatarnumero(m3);
          }
          if((m4.length())>6){
            m4 = formatarnumero(m4);
          }

          String[] m4s = m4.split("");
          int m4st = m4.length();
          
          input3.setText("");

          for(x=0;x<m4st-3;x++){
            input3.setText(input3.getText() + "" + m4s[x]);
          }

          m4 = input3.getText();

          input.setText("R$" + (m1) + "");
          input1.setText("R$" + (m2) + "");
          input2.setText((m3) + "%");
          input3.setText((m4) + "");

          btn.setText("Limpar");
          input.requestFocus();
        }
      }
    }
    else if(btn.getText()=="Limpar"){
      input.setText("");
      input1.setText("");
      input2.setText("");
      input3.setText("");

      btn.setText("Calcular");
      input1.requestFocus();
    }
  }

  private String formatarnumero (String real1){
    String[] reals = real1.split("");
    int tamr = real1.length();
    String[] reals2 = new String[tamr+1];
    String[] reals3 = new String[tamr+2];
    String[] reals4 = new String[tamr+3];
    for(int k = 0; k<tamr; k++){
      reals2[k] = reals[k];
    }
    for(int k = tamr ; k>tamr-6; k--){
      reals2[k] = reals2[k-1];
    }

    reals2[tamr-6]=".";

    input.setText("");

    for(int k = 0; k<tamr+1; k++){
      input.setText(""+ input.getText() + reals2[k]);
    }

    real1 = input.getText();

    if(tamr>9){
      for(int k = 0; k<tamr+1; k++){
        reals3[k] = reals2[k];
      }
      for(int k = tamr+1 ; k>tamr-9; k--){
        reals3[k] = reals3[k-1];
      }

      reals3[tamr-9]=".";

      input.setText("");

      for(int k = 0; k<tamr+2; k++){
        input.setText(""+ input.getText() + reals3[k]);
      }

      real1 = input.getText();
    }
    if(tamr>12){
      for(int k = 0; k<tamr+2; k++){
        reals4[k] = reals3[k];
      }
      for(int k = tamr+2 ; k>tamr-12; k--){
        reals4[k] = reals4[k-1];
      }

      reals4[tamr-12]=".";

      input.setText("");

      for(int k = 0; k<tamr+3; k++){
        input.setText(""+ input.getText() + reals4[k]);
      }

      real1 = input.getText();
    }

    return real1;
  
  }

  public void keyPressed(KeyEvent Enter){
    if(input.requestFocus(true)){

    }

    System.out.println("Deu certo");
  }

}

