
public class TestPunonjes {

	public static void main(String[] args) {
		Punonjes denisi = new Punonjes();
		denisi.setEmri("Denis Karaj");
		denisi.setAdresa("Kodra e diellit");
		denisi.setTelefoni("35569123456");
		denisi.setEmail("denis12@gmail.com");
		denisi.setZyra("Lab 4");
		denisi.setPaga(90000.0);
		denisi.setDataPunesimit(new Data(12,1, 2016));
		denisi.rishikoPaga();
		System.out.println(denisi);
	}

}
