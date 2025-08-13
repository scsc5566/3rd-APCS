import kareltherobot.*;

public class Main implements Directions{
  public static void main(String[] args) {
    World.setVisible(true);// allows us to see the run
    World.setSize(12,21);
    World.setDelay(20);
  
    // The line below creates a Robot that we will refer to as r.  
    // Find out what the numbers and direction do!
    Robot r = new Robot(8,6,West,90);
		
    // examples of commands you can invoke on a Robot
    
    r.putBeeper();// move one step in the direction it is facing
    r.move();
    r.putBeeper();
    r.move();
    r.putBeeper();
    r.move();
    r.putBeeper();
    r.turnLeft();
    r.move();
    r.putBeeper();
    r.move();
    r.putBeeper();
    r.turnLeft();
    r.move();
    r.putBeeper();
    r.move();
    r.putBeeper();
    r.move();
    r.putBeeper();
    r.turnLeft();
    r.turnLeft();
    r.turnLeft();
    r.move();
    r.putBeeper();
    r.move();
    r.putBeeper();
    r.turnLeft();
    r.turnLeft();
    r.turnLeft();
    r.move();
    r.putBeeper();
    r.move();
    r.putBeeper();
    r.move();
	r.putBeeper();


    Robot p = new Robot(8,7,East,90);
    p.move();
    p.putBeeper();
    p.move();
    p.turnLeft();
    p.turnLeft();
    p.turnLeft();
    p.move();
    p.move();
    p.putBeeper();
    p.move();
    p.move();
    p.turnLeft();
    p.move();
    p.putBeeper();
    p.move();
    p.turnLeft();
    p.move();
    p.move();
    p.move();
    p.putBeeper();
    p.turnLeft();
    p.turnLeft();
    p.turnLeft();
    p.move();
    p.turnLeft();
    p.turnLeft();
    p.turnLeft();
    p.move();
    p.move();
    p.move();
    p.putBeeper();
    p.turnLeft();
    p.move();
    p.turnLeft();
    p.move();
    p.move();
    p.putBeeper();
    p.turnLeft();
    p.turnLeft();
    p.turnLeft();
    p.move();
    p.turnLeft();
    p.move();
    p.move();
    p.putBeeper();
  }
}



