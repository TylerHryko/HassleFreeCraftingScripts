  import java.awt.Color;
  import java.awt.Robot;
  import java.awt.AWTException;
  import java.awt.*;
  import java.awt.event.*;
  import java.awt.geom.Point2D;
  import javax.swing.*;
  import javax.swing.event.*;
  import java.awt.Graphics;
  import java.applet.*;
  import javax.swing.JFrame;
  import javax.swing.JApplet;
  import javax.swing.JLabel;
  import java.awt.BorderLayout;
  import javax.swing.JPanel;
  import java.awt.event.MouseEvent;
  import java.awt.event.MouseAdapter;
  import java.awt.event.MouseMotionAdapter;


public class HassleFreeVarnish{  
  public static void main(String [] args){
  //--------------------------ACTUAL BOT CODE BEGINS HERE--------------------------
  //>>>>>>>>>>>NOT FOR REDISTROBUTION OR RELEASE UNDER ANY CIRCUMSTANCES<<<<<<<<<<<
  //-------------------SUITABLE FOR CAMPHOR USING RATH'S ROTATION--=======---------
        for(;;)
        {
          try {
              Robot robot = new Robot();

                try {
                  Robot robot2 = new Robot();
                  // Simulate a key press.
                  // Program assumes 3 = hook, 2 = cast. 
                  try{
                    Thread.sleep(1500);
                    System.out.println("Clicking!");
                    robot.mouseMove(1593,1293);
                    Thread.sleep(200);
                    robot.mousePress(InputEvent.BUTTON1_MASK);
                    Thread.sleep(200);
                    robot.mouseRelease(InputEvent.BUTTON1_MASK);
                  }catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                  try{
                    Thread.sleep(2000);
                    robot.keyPress(KeyEvent.VK_8);
                    robot.keyRelease(KeyEvent.VK_8);
                    System.out.println("Running!");
                    Thread.sleep(24000);
                    robot.keyPress(KeyEvent.VK_1);
                    robot.keyRelease(KeyEvent.VK_1);
                    Thread.sleep(200);
                  }catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                  
                  
                  

          } catch (AWTException e) {
                  e.printStackTrace();
          }
          } catch (AWTException e) {
              e.printStackTrace();
          }
        }

    }}


