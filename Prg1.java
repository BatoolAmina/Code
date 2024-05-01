//Create GUI application using AWT & Applet classes
import java.applet.*;
import java.awt.*;
public class Test extends Applet{
    public void paint(Graphics g){
        Font f = new Font("Times New Roman", Font.BOLD, 40);
        g.setFont(f);
        g.drawString("Welcome to Applet", 100, 100);
    }
}

// Compiling javac Test.java

// Create HTML file:

<html>
<head>
<title>Applet</title>
</head>
<applet code = "Test.class" width="600" height="400"></applet>
</html>

//Now open html file
//applet viewer.html
