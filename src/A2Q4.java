/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author pintm1551
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     becker.robots.City kw = new becker.robots.City(); 
     Robot karel = new Robot(kw, 3, 1, Direction.NORTH);
     new Wall(kw,1,1, Direction.SOUTH);
     new Wall(kw,1,1, Direction.NORTH);
     new Wall(kw,1,1, Direction.EAST); 
     new Wall(kw,1,1, Direction.WEST);
     new Wall(kw,1,4, Direction.SOUTH);
     new Wall(kw,1,4, Direction.NORTH);
     new Wall(kw,1,4, Direction.EAST); 
     new Wall(kw,1,4, Direction.WEST);
     new Wall(kw,4,4, Direction.SOUTH);
     new Wall(kw,4,4, Direction.NORTH);
     new Wall(kw,4,4, Direction.EAST); 
     new Wall(kw,4,4, Direction.WEST);
     new Wall(kw,4,1, Direction.SOUTH);
     new Wall(kw,4,1, Direction.NORTH);
     new Wall(kw,4,1, Direction.EAST); 
     new Wall(kw,4,1, Direction.WEST);
     new Wall(kw,2,2, Direction.NORTH); 
     new Wall(kw,2,2, Direction.WEST);
     new Wall(kw,3,3, Direction.SOUTH); 
     new Wall(kw,3,3, Direction.EAST);
     new Wall(kw,3,2, Direction.SOUTH); 
     new Wall(kw,3,2, Direction.WEST);
     new Wall(kw,2,3, Direction.NORTH); 
     new Wall(kw,2,3, Direction.EAST);
while(true){
    do{
       karel.move();
    }while(karel.frontIsClear());
    do{
       karel.turnLeft();
       karel.move();
       karel.turnLeft();
       karel.turnLeft();
       karel.turnLeft();
       karel.move();
       karel.move();
       karel.turnLeft();
       karel.turnLeft();
       karel.turnLeft();
       karel.move();
       karel.move();
       karel.turnLeft();
       karel.turnLeft();
       karel.turnLeft();
       karel.move();
       karel.turnLeft();
    }while(!karel.frontIsClear()); 
     }
  }
}


