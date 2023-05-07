import java.awt.*;
import java.applet.*;

public class TextApplet extends Applet {
    String msg;
    
    public void init() {
        setBackground(Color.cyan);
        setForeground(Color.red);
        msg = "Simple Text Applet";
        System.out.println("Applet initialized");
    }

    public void start() {
        System.out.println("Applet started...");
    }

    public void stop() {
        System.out.println("Stopping Applet...");
    }

    public void destroy() {
        System.out.println("Destroyed Applet");
    }

    public void paint(Graphics g) {
        g.drawString(msg, 10, 50);
    }
}

/*
    <applet code="TextApplet.java" height=300 width=300>
    </applet>
*/