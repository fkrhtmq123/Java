package p247;

public class Earth {
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SUPFACE_AREA;
	
	static {
		EARTH_SUPFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
}
