import java.awt.Color;

public class Ray {
	double x,y,z;
	
	double vx,vy,vz;
	
	Ray(double x, double y, double z, double vx, double vy, double vz) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.vx = vx;
		this.vy = vy;
		this.vz = vz;
	}
	
	Color run() {
		Color color = new Color(255,0,0);
		double x1 = x;
		double y1 = y;
		double z1 = z;
		
		double x2 = x + vx;
		double y2 = y + vy;
		double z2 = z + vz;
		
		for(EntityObject o : Scene.objects) {
			if(o.getClass() == Sphere.class) { 
				double a = Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2) + Math.pow((z2 - z1),2);
				double b = (-2)*((x2 - x1)*(o.x - x1) + (y2 - y1)*(o.y - y1) + (o.z - z1)*(z2 - z1));
				double c = Math.pow((o.x - x1),2) + Math.pow((o.y - y1),2) + Math.pow((o.z - z1),2) - ((Sphere)o).r*((Sphere)o).r;
				
				if(b*b - 4*a*c >= 0) {
					color = new Color(255,255,255);
				}
			}
		}
		
		return color;
	}
}
