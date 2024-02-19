enum Grada {LEKTOR, ASISTENT_PROFESOR, PROFESOR_ASOCIUAR, DOKTOR, PROFESOR};

public class Fakulteti extends Punonjes {
private int oretQendrimitZyre;
private Grada grada;



/**
 * @param emri
 * @param adresa
 * @param telefoni
 * @param email
 * @param zyra
 * @param paga
 * @param dataPunesimit
 * @param oretQendrimitZyre
 * @param grada
 */
public Fakulteti(String emri, String adresa, String telefoni, String email, String zyra, double paga,
		Data dataPunesimit, int oretQendrimitZyre, Grada grada) {
	super(emri, adresa, telefoni, email, zyra, paga, dataPunesimit);
	setOretQendrimitZyre(oretQendrimitZyre);
	this.grada = grada;
	
}
/**
 * @return the oretQendrimitZyre
 */
public int getOretQendrimitZyre() {
	return oretQendrimitZyre;
}
/**
 * @param oretQendrimitZyre the oretQendrimitZyre to set
 */
public void setOretQendrimitZyre(int oretQendrimitZyre) {
	if(oretQendrimitZyre >= 0) this.oretQendrimitZyre = oretQendrimitZyre;
}
/**
 * @return the grada
 */
public Grada getGrada() {
	return grada;
}
/**
 * @param grada the grada to set
 */
public void setGrada(Grada grada) {
	this.grada = grada;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString() + String.format("\nGrada %s\nOret ne zyre %d\n", grada.name(), 
			oretQendrimitZyre);
}
/**
 * rishkruan metoden e superklases
 * Per gradata PRFESOR, DOKTOR, PREFESOR_ASOCIUAR, pavaresisht viteve te punes, aplikohet shtesa 
 * prej 15%. Per gradat e tjera aplikohet shtese prej 10% vetem ne varesi te viteve te punes
 * @return true ose false kur nuk plpotesohet kriteri i viteve te punes 
 */
@Override
public boolean rishikoPaga() {
	// TODO Auto-generated method stub
	switch (grada) {
	
	case  PROFESOR,
	      DOKTOR,
	      PROFESOR_ASOCIUAR :
	    	  this.setPaga(paga*1.15);
			  return true;
	default:
		return super.rishikoPaga();
		
	    	  
	
	}
}

}
