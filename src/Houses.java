import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public static void main(String[] args) {
		Robot rob = new Robot();
		rob.setX(100);
		rob.setY(500);
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			int randy = random.nextInt(3);
			if (randy==0) {
				drawHouse(rob, "small");
			}
			if (randy==1) {
				drawHouse(rob, "medium");
			}
			if (randy==2) {
				drawHouse(rob, "large");
			}
		}
	}

	static void drawHouse(Robot rob, String size) {
		if (size.equals("small")) {
			rob.setSpeed(100);
			rob.setPenWidth(10);
			rob.penDown();
			rob.setPenColor(Color.ORANGE);
			rob.move(60);
			rob.turn(45);
			rob.move(50);
			rob.turn(90);
			rob.move(50);
			rob.turn(45);
			rob.move(60);
			rob.turn(-90);
			rob.setPenColor(Color.GREEN);
			rob.move(50);
			rob.setPenColor(Color.ORANGE);
			rob.turn(-90);
		}
		if(size.equals("medium")) {
			rob.setSpeed(100);
			rob.setPenWidth(10);
			rob.penDown();
			rob.setPenColor(Color.red);
			rob.move(120);
			rob.turn(45);
			rob.move(50);
			rob.turn(90);
			rob.move(50);
			rob.turn(45);
			rob.move(120);
			rob.turn(-90);
			rob.setPenColor(Color.green);
			rob.move(50);
			rob.setPenColor(Color.red);
			rob.turn(-90);
		}
		if (size.equals("large")) {
			rob.setSpeed(100);
			rob.setPenWidth(10);
			rob.penDown();
			rob.setPenColor(Color.blue);
			rob.move(250);
			rob.move(60);
			rob.turn(90);
			rob.move(50);
			rob.turn(90);
			rob.move(60);
			rob.move(250);
			rob.turn(-90);
			rob.setPenColor(Color.green);
			rob.move(50);
			rob.setPenColor(Color.blue);
			rob.turn(-90);
		}
	}
}
