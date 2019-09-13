import java.awt.Color;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public static void main(String[] args) {
		Color skyBlue = new Color(212, 254, 255);
		Robot rob = new Robot();
		String time = JOptionPane.showInputDialog("Night or day?");
		if(time.equalsIgnoreCase("day")) {
			rob.setWindowColor(skyBlue);
		}
		else if(time.equalsIgnoreCase("night")) {
			rob.setWindowColor(Color.black);	
		}
		rob.setX(100);
		rob.setY(500);
		Random random = new Random();
		for (;;) {
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
		int height;
		if (size.equals("small")) {
			height = 60;
			rob.setPenColor(Color.ORANGE);

		}
		else if(size.equals("medium")) {
			height = 120;
			rob.setPenColor(Color.red);
		}
		else if(size.equals("large")) {
			height = 250;
			rob.setPenColor(Color.blue);
		}
		else {
			height = 0;
		}
		rob.setSpeed(100);
		rob.setPenWidth(10);
		rob.penDown();
		rob.setAngle(0);
		rob.move(height);
		if(size.equals("large")) {
			rob.turn(90);
			rob.move(50);
			rob.turn(90);
		}
		else {
		drawPointyRoof(rob);
		}
		rob.move(height);
		rob.turn(-90);
		rob.setPenColor(Color.GREEN);
		rob.move(50);
		rob.turn(-90);
	}
	static void drawPointyRoof(Robot rob) {
		rob.turn(45);
		rob.move(50);
		rob.turn(90);
		rob.move(50);
		rob.turn(45);
	}
}
//(int i = 0; i < 10; i++)
