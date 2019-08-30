import org.jointheleague.graphical.robot.Robot;

public class Houses {
public static void main(String[] args) {
	Robot rob = new Robot();
	rob.setX(100);
	rob.setY(500);
	rob.setSpeed(100);
	rob.penDown();
	rob.move(100);
	rob.turn(90);
	rob.move(50);
	rob.turn(90);
	rob.move(100);
			
}
}
