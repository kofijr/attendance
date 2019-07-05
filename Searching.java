import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;

public class Searching implements ActionListener
{
    private JLabel searchlabel;
    private JTextField searchID;
    private JButton searchingButton;
    
    
    
   public Searching(){
       JFrame frame = new JFrame ("Search For Information");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(makePanel());
        frame.pack();
        frame.setVisible(true);

   }
   
   private JPanel makePanel() {
        JPanel panel = new JPanel();
        
        
        panel.add (new JLabel ("Enter Your Student ID"));
        searchID = new JTextField(8);
        panel.add(searchID);
         
        searchingButton = new JButton("Search");
        panel.add(searchingButton);
        searchingButton.addActionListener(this);
        panel.setPreferredSize(new Dimension(300,100));
        panel.setBackground(Color.RED);
        return panel;
     }
          
         public void actionPerformed (ActionEvent event){




                   if (event.getSource() == searchingButton)
                     {
                         
                     }

                  

               }

   
   
   
   public static void main (String[] args)
                        {
         new Searching();

                        }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

   
}