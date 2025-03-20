import processing.core.PApplet;

public class JavaFile extends PApplet { 
	public static void main(String[] args) { 
		String[] processingArgs = {"MySketch"};
		JavaFile javaFile = new JavaFile();
		PApplet.runSketch(processingArgs, javaFile);
	}
	public void settings() {
		size(800, 800); //Sets the window size.
	}

	public void setup() {
		frameRate(60); //Sets the framerate.
	}

	float y = 400;
	float ySpeed = 0;
	public void draw() {
		background(255, 255, 255);
		fill(200, 0, 0);
		ellipse(400, y, 50, 50);
		y = y + ySpeed;
		if(y > 750) {
			ySpeed = ySpeed * -1;
		}
		else {
			ySpeed = ySpeed + 1;
		}
	}
}



