import java.awt.Color;

public class Main {
	static final int width = 200;
	static final int height = 200;
	static final int res = 4;
	static final Color[][] screen = new Color[width][height];
	static Window window;
	static final Scene scene = new Scene();
	
	public static void main(String[] args) {
		scene.createScene();
		scene.renderScene();
		window = new Window();
	}
}
