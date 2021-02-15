public class Ladderklimmen extends Attractie implements GokAttractie{
	public Ladderklimmen() {
		naam = "Ladderklimmen";
		prijs = 5.00;
		kassa = new Kassa();
	}
	
	public void kansSpelBelastingBetalen() {
		//System.out.println("reserve 30%");
		kassa.omzet = kassa.omzet*0.7;
	}
}