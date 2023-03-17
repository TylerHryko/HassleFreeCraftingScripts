package hasslefreetannin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.Dimension;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Toolkit;
import hasslefreetannin.MouseCorrectRobot;

public class HassleFreeTannin
{
  public static void main(String [] args){
//--------------------------ACTUAL BOT CODE BEGINS HERE--------------------------
  //>>>>>>>>>>>NOT FOR REDISTROBUTION OR RELEASE UNDER ANY CIRCUMSTANCES<<<<<<<<<<<
  //-------------------SUITABLE FOR CAMPHOR USING RATH'S ROTATION--=======---------
        for(;;)
        {
          try {
              Robot robot = new Robot();
              MouseCorrectRobot mouse = new MouseCorrectRobot();

                try {
                  Robot robot2 = new Robot();
                  // Simulate a key press.
                  // Program assumes 3 = hook, 2 = cast. 
                  try{
                    Thread.sleep(2000);
                    System.out.println("Clicking!");
                    //mouse.MoveMouseControlled(0.5,0.5);
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
                    Thread.sleep(40000);
                    robot.keyPress(KeyEvent.VK_9);
                    robot.keyRelease(KeyEvent.VK_9);
                    Thread.sleep(33000);
                    //for collectible synth, comment out for mass prod.
                    /*Thread.sleep(33000);
                    System.out.println("Clicking!");
                    robot.mouseMove(1825,1192);
                    Thread.sleep(200);
                    robot.mousePress(InputEvent.BUTTON1_MASK);
                    Thread.sleep(200);
                    robot.mouseRelease(InputEvent.BUTTON1_MASK);
                    Thread.sleep(1000);
                    */
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

