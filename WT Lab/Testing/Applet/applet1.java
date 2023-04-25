import java.awt.*;
import java.applet.*;

public class applet1 extends Applet {
    String msg;
    public void init() {
        setBackground(Color.cyan);
        setForeground(Color.red);
        msg = "This is applet example";
    }

    public void start() {
        System.out.println("...Starting of applet");
    }
    
    public void stop() {
        System.out.println("...Stopping of applet");
    }

    public void destroy() {
        System.out.println("...Exiting applet");
    }

    public void paint(Graphics g) {
        g.drawString(msg, 10, 30);
    }
}
/*
<applet code="applet1.class" height=50 width=300>
</applet>
*/