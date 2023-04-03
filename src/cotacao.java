import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.awt.*;
//import java.awt.event.KeyEvent.*;

import java.awt.event.ActionEvent;

public class cotacao {


  String a = "";
  JFrame frame = new JFrame("Cotação");
  JTextField input1 = new JTextField("");
  JTextField input2 = new JTextField("");
  JTextField input3 = new JTextField("");
  JButton btn = new JButton("Calcular");

  JLabel label1 = new JLabel("Dólares:");
  JLabel label2 = new JLabel("Euros:");
  JLabel label3 = new JLabel("Yuan:");
  JLabel label =  new JLabel("Reais :");

  JTextField input = new JTextField("");



  public cotacao(){
    
    frame.setVisible(true);
        frame.setSize(350, 395);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(111, 111, 111, 111));

        input.setFont(new Font("Arial",Font.BOLD,18));
        input.setBounds(150, 60, 130, 28);  
        label.setBounds(50, 60, 100, 28);
        label.setFont(new Font("Arial",Font.BOLD,18));
    
      
        
        input1.setFont(new Font("Arial",Font.BOLD,18));
        input1.setBounds(150, 120, 130, 28);
        label1.setBounds(50, 120, 100, 28);
        label1.setFont(new Font("Arial",Font.BOLD,18));

        input2.setFont(new Font("Arial",Font.BOLD,18));
        input2.setBounds(150, 180, 130, 28);      
        label2.setBounds(50, 180, 100, 28);
        label2.setFont(new Font("Arial",Font.BOLD,18));

        input3.setFont(new Font("Arial",Font.BOLD,18)); 
        input3.setBounds(150, 240, 130, 28);
        label3.setBounds(50, 240, 100, 28);
        label3.setFont(new Font("Arial",Font.BOLD,18));

        btn.setBounds(100,290,150,50);
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

        input1.requestFocus();
        
  }

  /*private void inputaddKeyListener(java.awt.event.KeyEvent evt ){
    if (evt.getKeyCode() == KeyEvent.VK_ENTER){
    
    }
  }*/

   
  
  private void btna(ActionEvent actionEvent) {
    if(btn.getText()=="Calcular"){ 
      String inp, inp1, inp2, inp3;
      inp = "";
      inp1 = "";
      inp2 = "";
      inp3 = "";
      
      int h = 0 , re = 0, dol = 0, eu = 0, bit = 0 ;

      if(!input.getText().equals("")){
        inp = input.getText();
        h++;
        re=1;
      }
      if(!input1.getText().equals("")){
        inp1 = input1.getText();
        h++;
        dol=1;
      }
      if(!input2.getText().equals("")){
        inp2 = input2.getText();
        h++;
        eu=1;
      }
      if(!input3.getText().equals("")){
        inp3 = input3.getText();
        h++;
        bit=1;
      }

      if(h>1){
        JOptionPane.showMessageDialog(null,"Preencha somente um campo!", "ERRO", JOptionPane.ERROR_MESSAGE);
      }

      else if(h==0){
        JOptionPane.showMessageDialog(null,"Preencha algum campo!", "ERRO", JOptionPane.ERROR_MESSAGE);
      }

      else{
      
        if(input.getText().contains(",")){inp = inp.replace(",",".");
            input.setText(inp);
        }
        if(input1.getText().contains(",")){inp1 = inp1.replace(",",".");
          input1.setText(inp1);
        }
        if(input2.getText().contains(",")){inp2 = inp2.replace(",",".");
          input2.setText(inp2);
        }
        if(input3.getText().contains(",")){inp3 = inp3.replace(",",".");
          input3.setText(inp3);
        }
        
        else{
          String[] r2, d2, e2, b2;
          r2 = inp.split("");
          d2 = inp1.split("");
          e2 = inp2.split("");
          b2 = inp3.split("");

          String caracteres = "0123456789.";

          int r1, d1, e1, b1;
          r1 = input.getText().length();
          d1 = input1.getText().length();
          e1 = input2.getText().length();
          b1 = input3.getText().length();
          
          int x,y=0;
          for(x =0 ; x<r1; x++){
            if(!caracteres.contains(r2[x]) && y==0){
              JOptionPane.showMessageDialog(null,"Preencha o campo com números somente!", "ERRO", JOptionPane.ERROR_MESSAGE);
              y=1;
            }
          }

          for(x =0 ; x<d1; x++){
            if(!caracteres.contains(d2[x]) && y==0){
              JOptionPane.showMessageDialog(null,"Preencha o campo com números somente!", "ERRO", JOptionPane.ERROR_MESSAGE);
              y=1;
            }
          }
        
          for(x =0 ; x<e1; x++){
            if(!caracteres.contains(e2[x]) && y==0){
              JOptionPane.showMessageDialog(null,"Preencha o campo com números somente!", "ERRO", JOptionPane.ERROR_MESSAGE);
              y++;
            }
          }
        
          for(x =0 ; x<b1; x++){
            if(!caracteres.contains(b2[x]) && y==0){
              JOptionPane.showMessageDialog(null,"Preencha o campo com números somente!", "ERRO", JOptionPane.ERROR_MESSAGE);
              y++;
            }
          }
          //--------------------------------------
          if(re==1){
            Double r, md, me, mb;
            String md1, me1, mb1, real;
            r = Double.parseDouble(input.getText());
            md = r/(5.24);
            me = r/(5.51);
            mb = r/(0.75);

            real = String.format("%.2f", r);
            md1 = String.format("%.2f", md);
            me1 = String.format("%.2f", me);
            mb1 = String.format("%.2f", mb);

            if((real.length())>6){
              real = formatarnumero(real);
            }
            if((md1.length())>6){
              md1 = formatarnumero(md1);
            }
            if((me1.length())>6){
              me1 = formatarnumero(me1);
            }
            if((mb1.length())>6){
              mb1 = formatarnumero(mb1);
            }

            input.setText((real) + "");
            input1.setText((md1) + "");
            input2.setText((me1) + "");
            input3.setText((mb1) + "");
          }

          else if(dol==1){
            Double d, mr, me, mb;
            String mr1, me1, mb1, dolar;
            d = Double.parseDouble(input1.getText());
            mr = d/(0.19);
            me = d/(1.05);
            mb = d/(0.14);

            dolar = String.format("%.2f", d);
            mr1 = String.format("%.2f", mr);
            me1 = String.format("%.2f", me);
            mb1 = String.format("%.2f", mb);

            if((dolar.length())>6){
              dolar = formatarnumero(dolar);
            }
            if((mr1.length())>6){
              mr1 = formatarnumero(mr1);
            }
            if((me1.length())>6){
              me1 = formatarnumero(me1);
            }
            if((mb1.length())>6){
              mb1 = formatarnumero(mb1);
            }

            input1.setText((dolar) + "");
            input.setText((mr1) + "");
            input2.setText((me1) + "");
            input3.setText((mb1) + "");
          }

          else if(eu==1){
            Double e, mr, md, mb;
            String mr1, md1, mb1, euro;
            e = Double.parseDouble(input2.getText());
            mr = e*(5.531);
            md = e*(1.054);
            mb = e*(7.337);

            euro = String.format("%.2f", e);
            mr1 = String.format("%.2f", mr);
            md1 = String.format("%.2f", md);
            mb1 = String.format("%.2f", mb);

            if((euro.length())>6){
              euro = formatarnumero(euro);
            }
            if((mr1.length())>6){
              mr1 = formatarnumero(mr1);
            }
            if((md1.length())>6){
              md1 = formatarnumero(md1);
            }
            if((mb1.length())>6){
              mb1 = formatarnumero(mb1);
            }

            input2.setText(euro + "");
            input.setText(mr1 + "");
            input3.setText((mb1) + "");
            input1.setText((md1) + "");
          }

          else if(bit==1){
            Double b, mr, me, md;
            String mr1, me1, md1, yuan;
            b = Double.parseDouble(input3.getText());
            mr = b*(0.75);
            me = b*(0.136);
            md = b*(0.144);

            yuan  = String.format("%.2f", b);
            mr1 = String.format("%.2f", mr);
            me1 = String.format("%.2f", me);
            md1 = String.format("%.2f", md);

            if((yuan.length())>6){
              yuan = formatarnumero(yuan);
            }
            if((mr1.length())>6){
              mr1 = formatarnumero(mr1);
            }
            if((me1.length())>6){
              me1 = formatarnumero(me1);
            }
            if((md1.length())>6){
              md1 = formatarnumero(md1);
            }

            input3.setText((yuan) + "");
            input.setText((mr1) + "");
            input2.setText((me1) + "");
            input1.setText((md1) + "");
          }
          
          btn.setText("Limpar");
        }
      }
    }

    else if(btn.getText()=="Limpar"){
      input.setText("");
      input1.setText("");
      input2.setText("");
      input3.setText("");

      btn.setText("Calcular");
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

}

