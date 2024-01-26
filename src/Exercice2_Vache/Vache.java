package Exercice2_Vache;

public class Vache {
	
	private int immatriculation;//shouldnt be static , becaus it ecraze each time we instance a new object it keeps the same value without increment
	private double poids;
	private static double prixAuKg;//The price should be static , doasn't change
	private static int counter;//To keep the same value and content during our proces
	
	public Vache() {}
	public Vache(double poids)
	{
		this.poids=poids;
		immatriculation=counter++;
	}
	
	public double getPoids()
	{
		return poids;
	}
	public void setPoids(double poids) 
	{
		this.poids=poids;
	}
	/*To use directely the class name without passing an instance or allocation an then use the method with the object
	 this is more optimal
	 */
	public static double getPrixAuKg() {
		return prixAuKg;
	}
	
	public static void setPrixAuKg(double prixAuKg) {
		Vache.prixAuKg = prixAuKg;
	}
	public
	//To initialize the static attributes , they will be executed only one time
	static 
	{
		prixAuKg = 120;
		
	}

	
}
