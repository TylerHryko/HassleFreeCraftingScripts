
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class HassleFreeDesynth
{
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
                    Thread.sleep(3000);
                    System.out.println("Clicking!");
                    robot.mouseMove(1711,873);
                    Thread.sleep(200);
                    robot.mousePress(InputEvent.BUTTON1_MASK);
                    Thread.sleep(200);
                    robot.mouseRelease(InputEvent.BUTTON1_MASK);
                  }catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                  try{
                    Thread.sleep(500);
                    System.out.println("Clicking Again!");
                    robot.mouseMove(1711,1409);
                    Thread.sleep(200);
                    robot.mousePress(InputEvent.BUTTON1_MASK);
                    Thread.sleep(200);
                    robot.mouseRelease(InputEvent.BUTTON1_MASK);
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

