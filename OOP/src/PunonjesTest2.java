
public class PunonjesTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punonjes p1 = new Punonjes("Agim","Prifti", 50000);
		p1.setDataLindjes(new Data(1,12,2000));
		p1.getDataLindjes().afishoDaten();
		System.out.println(p1.getMosha() + " vjec");
	}

}
