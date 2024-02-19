
public class TestFakulteti {

	public static void main(String[] args) {
	Fakulteti dekani = new Fakulteti("Agim Dushku", "Tirane",
			"33423424","spirro@gmail.com", "Kati pare godina A", 
			170000, new Data(1,1,1990),4, Grada.PROFESOR);
	System.out.println(dekani);
	dekani.rishikoPaga();
	System.out.println(dekani);

	}

}
