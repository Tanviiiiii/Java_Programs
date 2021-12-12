package applets;

import java.awt.*;
import java.applet.*;
import java.applet.Applet;

public class hello extends Applet
{
  public void paint(Graphics g)
  {
    g.drawString("Hello Java", 100, 200);
  }
}

