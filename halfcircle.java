import java.awt.*;
import java.applet.*;

public class halfcircle extends Applet {
    public void paint(Graphics g) {
        g.drawArc(60, 125, 80, 40, 270, 180);
        g.fillArc(60, 125, 80, 40, 270, 180);
        g.drawString("Arc examle:", 50, 50);
    }
}
/* <applet code="halfcircle.class" width="300" height="300"></applet> */