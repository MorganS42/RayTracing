import java.util.ArrayList;

public class Scene {
	static final ArrayList<EntityObject> objects = new ArrayList<EntityObject>();
	
	Scene() {
		createScene();
		renderScene();
	}
	void createScene() {
		objects.add(new Sphere(400,400,0,50));
	}
	
	void renderScene() {
		for(int x = 0; x<Window.width; x++) {
			for(int y = 0; y<Window.height; y++) {
				Window.screen[x][y] = (new Ray(Camera.x,Camera.y,Camera.z, x - Camera.x, y - Camera.y, 0 - Camera.z)).run();
			}
		}
	}
}
