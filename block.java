import java.awt.*;
import java.applet.*;

public class block extends Applet {
    String mgs;

    public void paint(Graphics g) {
        String mgs;
        setBackground(Color.green);
        setForeground(Color.blue);
        mgs = "java in applet";
        g.drawString(mgs, 200, 200);

    }
}
/* <applet code="block.class" width="30" height="30"></applet> */