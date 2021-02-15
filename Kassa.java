public class Kassa {
	double omzet;
	int kaartjes;
	
	public void update(double prijs) {
		// TODO Auto-generated method stub
		omzet += prijs;
		kaartjes ++;
	}	
	
	public void totaal_omzet(Kassa[] kassa_s) {
		double t_omzet=0;
		
		for(int i=0;i<kassa_s.length;i++) {
			t_omzet += kassa_s[i].omzet;
		}
		String o = String.format("%.2f",t_omzet);
		System.out.println("omzet: "+o);
	}	
	
	public void totaal_kaartjes(Kassa[] kassa_s) {
		int t_kaartjes=0;
		
		for(int i=0;i<kassa_s.length;i++) {
			t_kaartjes += kassa_s[i].kaartjes;
		}
		System.out.println("kaartjes: "+t_kaartjes);
	}
}