package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {
    
     String name;
     JButton start, back;

  Rules(String name){
      this.name = name;
      
       getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
       
        JLabel heading = new JLabel("Welcome " + name + " to Simple Minds");
        heading.setBounds(50, 20, 700, 40);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,30));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma",Font.PLAIN,16));
        rules.setText(
    
           
            
               "<html>"+ 
                "1. Online quiz consists on 5 MCQ questions." + "<br><br>" +
                "2. Repeated answer for a question will not be considerd." + "<br><br>" +
                "3. You may have lot of options in life but here all the questions are compulsory." + "<br><br>" +
                "4. You can answer each question in specified time." + "<br><br>" +
                "5. Questions are of multiple choices." + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions, may be he/she is doing well." + "<br><br>" +
                "7. Each questions carry 5 marks. No negative marking for a wrong answers." + "<br><br>" +
                "8. Believe in yourself you can do this and Good Luck." + "<br><br>" +
            "<html>"
);

               
     add(rules);
     
         back =  new JButton("Back");
         back.setBounds(250, 500, 100 , 30);
         back.setBackground(new Color(30, 144, 254));
         back.setForeground(Color.WHITE);
         back.addActionListener(this);
         add(back);
     
         start = new JButton("Start");
         start.setBounds(400, 500, 100, 30);
         start.setBackground(new Color(30, 144, 254));
         start.setForeground(Color.WHITE);
         start.addActionListener(this);
         add(start);
     
     setSize(800, 650);
     setLocation(350, 100);
     setVisible(true);
  }  
  
  public void actionPerformed(ActionEvent ae){
      if(ae.getSource() == start){
          setVisible(false);
         new Quiz(name); 
          
      }else{
          setVisible(false);
          new Login();
      }
  }
  
  
public static void main(String[] args) {
 new Rules("User");
  }
}
