/**
 * Klasa rreth zjeron klases ObjektGjeometrik, pasi nje rreth eshte-nje objekt gjeometrik
 * Rrethi ka fushen rrezja te tipit double me vlere default 1.0
 * Ka metodat getPerimeter(), getSiperfaqe(), toString()
 * Perimetri = 2 * pi * rrezja
 * Siperfaqja = pi * rrezja * rrezja
 * @author User
 * 
 *
 */
public class Rreth extends ObjektGjeometrik {
private double rrezja = 1.0; 

public Rreth() {
	super();
}

/**
 * @param ngjyra
 * @param ngjyrosur
 * @param rrezja
 */
public Rreth(String ngjyra, boolean ngjyrosur, double rrezja) {
	super(ngjyra, ngjyrosur);
	setRrezja(rrezja);
	// TODO Auto-generated constructor stub
}

/**
 * @return the rrezja
 */
public double getRrezja() {
	return rrezja;
}

/**
 * @param rrezja the rrezja to set
 * @throws IllegalArgumentException kur rrezja <=0
 */
public void setRrezja(double rrezja) {
	if(rrezja <= 0) 
		throw new IllegalArgumentException("Rrezja negative!!");
	else
		this.rrezja = rrezja;
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return String.format("Rrethi me rreze %.2f\n", getRrezja())+super.toString();
}

@Override
public double getSiperfaqe() {
	// TODO Auto-generated method stub
	return Math.PI * rrezja * rrezja;
}

@Override
public double getPerimeter() {
	// TODO Auto-generated method stub
	return 2 * Math.PI*rrezja;
}




}
