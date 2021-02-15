import java.util.Scanner;

public class Start {
	/* Global Variables */
	static Scanner sc = new Scanner(System.in);
	static String input;	
	static Botsauto botsauto = new Botsauto();
	static Spin spin = new Spin();
	static Spiegelpaleis spiegelpaleis = new Spiegelpaleis();
	static Spookhuis spookhuis = new Spookhuis();
	static Hawaii hawaii = new Hawaii();
	public static Ladderklimmen ladderklimmen = new Ladderklimmen();
	static Attractie[] attrs = {botsauto, spin, spiegelpaleis, spookhuis, hawaii, ladderklimmen};
	static Kassa kermis_kassa = new Kassa();
	static Kassa[] kassa_s = {botsauto.kassa,spin.kassa,spiegelpaleis.kassa,
			spookhuis.kassa,hawaii.kassa, ladderklimmen.kassa};
	
	public static void main(String[] args) {				
		/* Inform user */
		System.out.println("geef een input alstublieft: [1-6, o, k, b]");
		start();		
	}
	
	static void ask_input() {
		input = sc.nextLine();
	}
	
	static void start() {
		ask_input();
		if(input.equals("o")) {
			kermis_kassa.totaal_omzet(kassa_s);
		}
		if(input.equals("k")) {
			kermis_kassa.totaal_kaartjes(kassa_s);
		}
		if(input.equals("1")) {
			botsauto.kassa.update(botsauto.prijs);
		}
		if(input.equals("2")) {
			try {
				spin.opstellingsKeuring(spin);
				spin.kassa.update(spin.prijs);
			} catch (limietBereiktException e) {
				System.out.println("de attractie moet gereset worden, input 'm':");
				ask_input();
				if(input.equals("m")) {
					spin.resetAttractie(spin);
				}
			}
		}
		if(input.equals("3")) {
			spiegelpaleis.kassa.update(spiegelpaleis.prijs);
		}
		if(input.equals("4")) {
			spookhuis.kassa.update(spookhuis.prijs);
		}
		if(input.equals("5")) {
			try {
				hawaii.opstellingsKeuring(hawaii);
				hawaii.kassa.update(hawaii.prijs);
			} catch (limietBereiktException e) {
				System.out.println("de attractie moet gereset worden, input 'm':");
				ask_input();
				if(input.equals("m")) {
					hawaii.resetAttractie(hawaii);
				}
			}
		}
		if(input.equals("6")) {
			ladderklimmen.kassa.update(ladderklimmen.prijs);
		}
		if(input.equals("b")) {
			BelastingInspecteur inspecteur = new BelastingInspecteur();
			for(int i=0;i<attrs.length;i++) {
				if(attrs[i] instanceof GokAttractie) {
					GokAttractie ga = (GokAttractie) attrs[i];
					inspecteur.belastingHeffen(ga);
				}
			}
			kermis_kassa.totaal_omzet(kassa_s);
		}		
		start();
	}
}
