/**
 * Klasa katror zgjeron klasen Drejtkendesh, pasi nje katror eshte nje rast i vecante i klases
 * Drejtkendesh ku brinja1 = brinja2
 * Kjo klase nuk ka asnje fushe te re
 * Konstruktori default nderton nje katror me brinje default 1.0
 * @author User
 *
 */
public class Katror extends Drejtkendesh{

	public Katror() {
		setBrinja1(1.0);
		setBrinja2(1.0);
	}
	
	public Katror(String ngjyra, boolean ngjyrosur, double brinja) {
		super(ngjyra, ngjyrosur, brinja, brinja);
		
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Katrori me brinje %.2f\n", this.getBrinja1()) +
				String.format("Krijuar me %s\nNgjyra %s\nNgjyrosur %s\n", 
						getDataKrijimit(), getNgjyra(),isNgjyrosur());
	}

	@Override
	public void setBrinja1(double brinja1) {
		// TODO Auto-generated method stub
		super.setBrinja1(brinja1);
		super.setBrinja2(brinja1);
	}

	@Override
	public void setBrinja2(double brinja2) {
		// TODO Auto-generated method stub
		super.setBrinja2(brinja2);
		super.setBrinja1(brinja2);
	}
	
	
}
