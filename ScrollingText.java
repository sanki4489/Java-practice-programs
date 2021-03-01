import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
 
/* <APPLET CODE=ScrollingText.class WIDTH=400 HEIGHT=200 > </APPLET> */ 
     public class ScrollingText  extends Applet implements Runnable 
     { 
        String msg="Welcome to Java Programming Language .......    "; 
        Thread t=null; 
        public void init() 
        { 
             setBackground(Color.cyan); 
             setForeground(Color.red); 
             t=new Thread(this); 
             t.start(); 
        } 
        public void run() 
        { 
           char ch; 
           for(; ;) 
           { 
                  try 
                   { 
                       repaint(); 
                       Thread.sleep(400); 
                       ch=msg.charAt(0); 
                       msg=msg.substring(1,msg.length()); 
                       msg+=ch; 
                    } 
                    catch(InterruptedException e) {} 
            } 
         } 
         public void paint(Graphics g) 
         { 
             g.drawString(msg,50,100); 
         } 
        } 