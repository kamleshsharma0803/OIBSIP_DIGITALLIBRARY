package Library.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class AboutUs extends JFrame{

	private JPanel contentPane;

        public static void main(String[] args) {
            new AboutUs().setVisible(true);			
	}
    
        public AboutUs() {
            
            super("About Us - Code for Interview");
            setBackground(new Color(173, 216, 230));
            setBounds(300, 150, 700, 500);
		
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JLabel l1 = new JLabel("New label");
            l1 = new JLabel();
            l1.setBounds(500, 40, 100, 100);
            contentPane.add(l1);


            JLabel l3 = new JLabel("Library");
            l3.setForeground(new Color(0, 250, 154));
            l3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l3.setBounds(160, 40, 150, 55);
            contentPane.add(l3);

            JLabel l4 = new JLabel("Mangement System");
            l4.setForeground(new Color(127, 255, 0));
            l4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l4.setBounds(70, 90, 405, 40);
            contentPane.add(l4);

            JLabel l5 = new JLabel("v5.1");
            l5.setForeground(new Color(30, 144, 255));
            l5.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
            l5.setBounds(185, 140, 100, 21);
            contentPane.add(l5);


            JLabel l6 = new JLabel("Developed By : KAMLESH SHARMA");
            l6.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
            l6.setBounds(70, 198, 600, 35);
            contentPane.add(l6);

            JLabel l7 = new JLabel("Contact Us : ks630157@gmail.com");
            l7.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l7.setBounds(70, 260, 600, 34);
            contentPane.add(l7);

      

            JLabel l9 = new JLabel("Follow us on Instagram : KAMLESH_SHARMA_0803");
            l9.setFont(new Font("Trebuchet MS", Font.BOLD , 20));
            l9.setBounds(70, 320, 600, 34);
            contentPane.add(l9);


            JLabel l10 = new JLabel("**THANKS YOU**");
            l10.setForeground(new Color(47, 79, 79));
            l10.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
            l10.setBounds(70, 400, 600, 34);
            contentPane.add(l10);
                
                
            contentPane.setBackground(Color.WHITE);
	}
        

}