/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author pintm1551
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        becker.robots.City kw = new becker.robots.City(); 
        Robot karel = new Robot(kw, 69, 53, Direction.SOUTH);
        if(karel.getDirection() == Direction.NORTH){
         karel.turnLeft();
        }
         if(karel.getDirection() == Direction.EAST){
          karel.turnLeft();
          karel.turnLeft();
         }
          if(karel.getDirection() == Direction.SOUTH){ 
          karel.turnLeft();
          karel.turnLeft();
          karel.turnLeft();
          }
          do{
                karel.move();
         }while(karel.getAvenue()>0);
          karel.turnLeft();
          karel.turnLeft();
          karel.turnLeft();
          do{
                karel.move();
         }while(karel.getStreet()>0);
     }
}

