/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/**
 *
 * @author pintm1551
 */
public class A2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     becker.robots.City kw = new becker.robots.City(); 
     Robot karel = new Robot(kw, 1, 3, Direction.SOUTH);
     Robot tina = new Robot(kw, 1, 3, Direction.SOUTH); 
     tina.setColor(Color.MAGENTA);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.WEST);
        new Wall(kw, 4, 1, Direction.WEST);
        new Wall(kw, 5, 1, Direction.WEST);
        new Wall(kw, 6, 1, Direction.WEST);
        new Wall(kw, 7, 1, Direction.WEST);
        new Wall(kw, 8, 1, Direction.WEST);
        new Wall(kw, 9, 1, Direction.WEST);
        new Wall(kw, 10, 1, Direction.WEST);
        new Wall(kw, 1, 2, Direction.EAST);
        new Wall(kw, 2, 2, Direction.EAST);
        new Wall(kw, 3, 2, Direction.EAST);
        new Wall(kw, 3, 2, Direction.EAST);
        new Wall(kw, 4, 2, Direction.EAST);
        new Wall(kw, 5, 2, Direction.EAST);
        new Wall(kw, 6, 2, Direction.EAST);
        new Wall(kw, 7, 2, Direction.EAST);
        new Wall(kw, 8, 2, Direction.EAST);
        new Wall(kw, 2, 7, Direction.EAST);
        new Wall(kw, 3, 7, Direction.EAST);
        new Wall(kw, 9, 2, Direction.EAST);
        new Wall(kw, 10, 3, Direction.EAST);
        new Wall(kw, 10, 2, Direction.EAST);
        new Wall(kw, 10, 3, Direction.SOUTH);
        new Wall(kw, 6, 3, Direction.EAST);
        new Wall(kw, 7, 3, Direction.EAST);
        new Wall(kw, 4, 3, Direction.EAST);
        new Wall(kw, 9, 8, Direction.EAST);
        new Wall(kw, 8, 8, Direction.EAST);
        new Wall(kw, 1, 3, Direction.EAST);
        new Wall(kw, 2, 4, Direction.NORTH);
        new Wall(kw, 2, 5, Direction.NORTH);
        new Wall(kw, 2, 6, Direction.NORTH);
        new Wall(kw, 2, 7, Direction.NORTH);
        new Wall(kw, 2, 4, Direction.NORTH);
        new Wall(kw, 3, 4, Direction.SOUTH);
        new Wall(kw, 3, 5, Direction.SOUTH);
        new Wall(kw, 3, 6, Direction.SOUTH);
        new Wall(kw, 3, 7, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.SOUTH);
        new Wall(kw, 5, 4, Direction.SOUTH);
        new Wall(kw, 5, 5, Direction.SOUTH);
        new Wall(kw, 5, 6, Direction.SOUTH);
        new Wall(kw, 5, 4, Direction.NORTH);
        new Wall(kw, 5, 5, Direction.NORTH);
        new Wall(kw, 5, 6, Direction.NORTH);
        new Wall(kw, 5, 6, Direction.EAST);
        new Wall(kw, 8, 4, Direction.NORTH);
        new Wall(kw, 8, 5, Direction.NORTH);
        new Wall(kw, 8, 6, Direction.NORTH);
        new Wall(kw, 8, 7, Direction.NORTH);
        new Wall(kw, 8, 8, Direction.NORTH);
        new Wall(kw, 9, 4, Direction.SOUTH);
        new Wall(kw, 9, 5, Direction.SOUTH);
        new Wall(kw, 9, 7, Direction.SOUTH);
        new Wall(kw, 9, 8, Direction.SOUTH);
        new Wall(kw, 9, 6, Direction.SOUTH);
        new Thing(kw, 1, 5);
        new Thing(kw, 1, 4);
        new Thing(kw, 1, 7);
        new Thing(kw, 2, 5);
        new Thing(kw, 2, 4);
        new Thing(kw, 2, 3);
        new Thing(kw, 2, 6);
        new Thing(kw, 2, 8);
        new Thing(kw, 2, 1);
        new Thing(kw, 1, 2);
        new Thing(kw, 3, 1);
        new Thing(kw, 4, 1);
        new Thing(kw, 5, 1);
        new Thing(kw, 8, 1);
        new Thing(kw, 10, 1);
        new Thing(kw, 4, 2);
        new Thing(kw, 6, 2);
        new Thing(kw, 8, 2);
        new Thing(kw, 9, 2);
        new Thing(kw, 10, 2);
        new Thing(kw, 3, 3);
        new Thing(kw, 3, 5);
        new Thing(kw, 3, 7);
        new Thing(kw, 4, 5);
        new Thing(kw, 4, 7);
        new Thing(kw, 5, 3);
        new Thing(kw, 5, 4);
        new Thing(kw, 5, 5);
        new Thing(kw, 5, 7);
        new Thing(kw, 5, 8);
        new Thing(kw, 6, 6);
        new Thing(kw, 6, 8);
        new Thing(kw, 7, 5);
        new Thing(kw, 7, 7);
        new Thing(kw, 8, 8);
        new Thing(kw, 8, 3);
        new Thing(kw, 8, 4);
        new Thing(kw, 9, 5);
        new Thing(kw, 9, 4);
        new Thing(kw, 9, 7);
        new Thing(kw, 10, 5);
        new Thing(kw, 10, 4);
        new Thing(kw, 10, 7);
        while(karel.getAvenue() == 3){    
            while(karel.countThingsInBackpack() > 0){
            karel.putThing();
            }
            while(karel.getStreet() == 10){
                  if(tina.frontIsClear()){
                        tina.move();
                        while(tina.canPickThing()){
                            tina.pickThing();
                        }
                  }
            }
            if(karel.frontIsClear()){
                  karel.move();
                  if(karel.canPickThing()){
                      karel.pickThing();
                  }
              }
              karel.turnLeft();
                      while(karel.frontIsClear()){
                          karel.move();
                          if(karel.canPickThing()){
                                karel.pickThing();
                          }
                          if(karel.getAvenue() != 3){
                          if(!karel.frontIsClear()){
                              karel.turnLeft();
                              karel.turnLeft();
                          }
                         }else{
                              karel.turnLeft();
                              break;
                          }
                      }
                  if(!karel.frontIsClear()){
                  karel.turnLeft();
                  karel.turnLeft();
                  karel.turnLeft();
                  }
            }
} 
}

 
