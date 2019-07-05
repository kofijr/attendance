

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;

public class Registration implements ActionListener
{

      private JButton inputButton;
      private JButton searchButton;
    

    public Registration()
    {
        JFrame frame = new JFrame ("Student Registration");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(makePanel());
        frame.pack();
        frame.setVisible(true);

    }
    private JPanel makePanel() {
    JPanel panel = new JPanel();
        inputButton = new JButton ("Input Information");
        panel.add(inputButton);
        inputButton.addActionListener(this);

        searchButton = new JButton ("Search For Information:");
        panel.add (searchButton);
        searchButton.addActionListener(this);
        panel.setPreferredSize(new Dimension(300,90));
        panel.setBackground(Color.RED);
        return panel;
     }

               public void actionPerformed (ActionEvent event){




                   if (event.getSource() == inputButton)
                     {
                          Validation frame =new Validation();
                          frame.setVisible(true);
                          setDefaultCloseOPeration(JFrame.DISPOSE_ON_CLOSE);
                     }

                   if (event.getSource() == searchButton){

                          Searching frame = new Searching();
                          frame.setVisible(true);
                          setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                     }

               }

                       public static void main (String[] args)
                        {
                         new Registration();

                        }

    private void setDefaultCloseOPeration(int DISPOSE_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setDefaultCloseOperation(int DISPOSE_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
               
}                
