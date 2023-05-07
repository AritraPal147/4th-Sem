import java.awt.*;
import java.applet.*;

public class ShapesApplet extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawRect(10, 10, 50,50);
        g.setColor(Color.cyan);
        g.fillRect(10, 10, 50, 50);

        g.setColor(Color.black);
        g.drawOval(80, 80, 60, 60);
    }
}

/* 
    <applet code=ShapesApplet.java height=1000 width=1000>
    </applet>
*/

/*
<style>
@import url("style.css")
</style>
*/