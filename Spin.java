public class Spin extends RisicoRijkeAttractie implements GokAttractie {
	public Spin() {
		naam = "Spin";
		prijs = 2.25;
		kassa = new Kassa();
	}
	
	public void kansSpelBelastingBetalen() {
		//System.out.println("reserve 30%");
		kassa.omzet = kassa.omzet*0.7;
	}
}