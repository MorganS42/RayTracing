import java.util.ArrayList;

public class Scene {
	static final ArrayList<EntityObject> objects = new ArrayList<EntityObject>();
	
	Scene() {
		createScene();
		renderScene();
	}
	void createScene() {
		objects.add(new Sphere(100,100,0,142));
	}
	
	void renderScene() {
		for(int x = 0; x<Main.width; x++) {
			for(int y = 0; y<Main.height; y++) {
				Main.screen[x][y] = (new Ray(x,y,0,0,0,1)).run();
			}
		}
	}
}
