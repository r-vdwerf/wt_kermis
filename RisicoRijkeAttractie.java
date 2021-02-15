public class RisicoRijkeAttractie extends Attractie{
	int draaiLimiet = 0;

	void opstellingsKeuring(RisicoRijkeAttractie a) throws limietBereiktException {
		a.draaiLimiet++;
		//System.out.println(a.draaiLimiet);
		if(a instanceof Spin) {
			if(a.draaiLimiet > 5) {
				/* throw exception? */
				throw new limietBereiktException();
			}
		}
		if(a instanceof Hawaii) {
			if(a.draaiLimiet > 10) {
				/* throw exception */
				throw new limietBereiktException();
			}
		}
	}
	
	void resetAttractie(RisicoRijkeAttractie a) {
		a.draaiLimiet = 0;
	}
}