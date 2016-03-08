/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author pintm1551
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      becker.robots.City kw = new becker.robots.City();
    new Thing(kw, 1, 2);
   new Thing(kw, 1, 3);
   new Thing(kw, 1, 4);
   new Thing(kw, 1, 5);
   new Thing(kw, 1, 6);
   new Thing(kw, 1, 7);
   new Thing(kw, 1, 8);
   new Thing(kw, 1, 9);
   new Thing(kw, 1, 10);
   new Thing(kw, 1, 11);
   Robot karel = new Robot(kw, 1, 1, Direction.EAST);
   while(true){
if(karel.frontIsClear()){
  karel.move(); 
     }
  if(karel.countThingsInBackpack()<7){
      karel.pickThing();       
     }
  }
 }
}
