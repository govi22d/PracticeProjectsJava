package frameExample;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame {
   private JFrame mainFrame;
   private JLabel headerLabel;
   private JLabel footerLabel;
   private JPanel controlPanel;
   private JLabel msglabel;
   private JButton btn1;
   private JButton btn2;
   private JButton btn3;
   private JLabel baseFrameMsgLbl;
   public MyFrame(){
      prepareGUI();
   }
   
   public static void main(String[] args){
	   MyFrame  jFrameDemo = new MyFrame();  
	   jFrameDemo.showJFrameDemo();
   }
   
   private void prepareGUI(){
	  btn1 = new JButton("Open a Frame");
	  btn2 = new JButton("Click Me");
	  btn3 = new JButton("Click Me");
	  baseFrameMsgLbl = new JLabel("Set here");
	  headerLabel = new JLabel("Header", JLabel.CENTER);        
      footerLabel = new JLabel("Footer",JLabel.CENTER);    
      msglabel = new JLabel("New frame label.", JLabel.CENTER);
      
      //header label 
      headerLabel.setFont(new Font(Font.SERIF, Font.BOLD, 20));;
      
      //panel
      controlPanel = new JPanel();
      controlPanel.setSize(200, 200);
      controlPanel.setLayout(new GridLayout());
      controlPanel.setBackground(Color.BLUE);
      controlPanel.add(btn1);
      controlPanel.add(btn2);
      controlPanel.add(btn3);
      controlPanel.add(baseFrameMsgLbl);
      
      //frame
      mainFrame = new JFrame("My Frame");
      mainFrame.setSize(400,700);
      
      //frame container
      Container ctn = mainFrame.getContentPane();
      ctn.setLayout(new GridLayout(3, 1));
      ctn.setBackground(Color.CYAN);   
      ctn.add(headerLabel);
      ctn.add(controlPanel);
      ctn.add(footerLabel);
      mainFrame.setVisible(true);  
   }
   
   private void showJFrameDemo(){
      //headerLabel.setText("Container in action: JFrame");   
      headerLabel.setBackground(Color.GREEN);
          
      
      btn1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        	 footerLabel.setText("A Frame shown to the user.");
            final JFrame frame = new JFrame();
            frame.setSize(300, 300);
            frame.setLayout(new FlowLayout());       
            frame.add(msglabel);
            frame.setVisible(true);
         }
      });
      
      btn2.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
        	  baseFrameMsgLbl.setText("btn2 clicked");
          }
       });
      
      btn3.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
        	  baseFrameMsgLbl.setText("btn3 clicked");
          }
       });
      
      //will close all child windows as well
      mainFrame.addWindowListener(new WindowAdapter() {
          public void windowClosing(WindowEvent windowEvent){
             System.exit(0);
          }        
       }); 
      
      mainFrame.setVisible(true);  
   }
}