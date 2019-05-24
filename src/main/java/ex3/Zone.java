package ex3;

import java.util.ArrayList;
import java.util.List;

public abstract class Zone {

	protected List<String> types;
	protected List<String> noms;
	protected List<String> comportements;
	
	public Zone() {
		this.noms = new ArrayList<String>();
		this.types = new ArrayList<String>();
		this.comportements = new ArrayList<String>();
	}
	
	public void afficherListeAnimaux(){
		for (String nom: noms){
			System.out.println(nom);
		}
	}
	
	public void addAnimal(String typeAnimal, String nomAnimal, String comportement) {
		types.add(typeAnimal);
		noms.add(nomAnimal);
		comportements.add(comportement);
	}
	
	public int compterAnimaux(){
		return noms.size();
	}
	
	public abstract double getPoids();
	
	public double calculerKgsNourritureParJour(){
		return noms.size() * getPoids();
	}
}
