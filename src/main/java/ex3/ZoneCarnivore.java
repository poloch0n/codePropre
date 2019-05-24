package ex3;

public class ZoneCarnivore extends Zone {

	private final Integer MASSE_NOURRITURE = 10;
	
	@Override
	public double getPoids() {
		// TODO Auto-generated method stub
		return this.MASSE_NOURRITURE;
	}
}
