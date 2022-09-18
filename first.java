import java.awt.*;
import java.applet.*;

public class first extends Applet {
    String name, msg;

    public void init() {
        name = getParameter("First");
    }

    public void paint(Graphics g) {
        msg = "hi" + name;
        g.drawString(msg, 700, 800);
    }
}
/* <applet code="first.class" widht=500 height=500> </applet> */