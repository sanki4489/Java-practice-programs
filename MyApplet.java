import java.awt.*;
import java.applet.*;
public class MyApplet extends Applet
{
	String n;
	String a;
	public void init()
	{
		n = getParameter("name");
		a = getParameter("age");
	}
	public void paint(Graphics g)
	{
		g.drawString("Name is: " + n, 20, 20);
		g.drawString("Age is: " + a, 20, 40);
	}
}
/*
	<applet code="MyApplet" height="300" width="500">
		<param name="name" value="Saras Verma" />
		<param name="age" value="16" />
	</applet>
*/
