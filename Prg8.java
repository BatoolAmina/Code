// Create application using Java Swing package. 

import javax.swing.*;
import java.awt.event.*;
public class SwingApplication 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Swing Application");
        JButton button = new JButton("Click Me!");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) 
            {
                JOptionPane.showMessageDialog(frame, "Button Clicked!");
            }
        });
        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
