public class Combattant {

	private String nom;
	private int taille; 
	private double reach;
	private int age;
	/*
	public Combattant(String nom, int taille, double reach, int age) {
		this.nom = nom;
		this.taille = taille;
		this.reach = reach;
		this.age = age;
	}
	*/
	public Combattant(String nom, int taille, double reach, int age) {
		this.nom = nom;
		this.taille = taille;
		this.reach = reach;
		this.age=age;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getTaille() {
		return taille;
	}
	public void setTaille(int taille) {
		this.taille = taille;
	}
	public double getReach() {
		return reach;
	}
	public void setReach(double reach) {
		this.reach = reach;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
