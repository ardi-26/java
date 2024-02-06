
public class TestProfilShendetesor {

	public static void main(String[] args) {
		ProfilShendetesor denisi = new 
				ProfilShendetesor("Denis", "Karaj", new Data(30,9,1999), 'M', 1.73, 75.0);
		denisi.afishoProfil();
		ProfilShendetesor anisa = new
				ProfilShendetesor("Anisa", "Sula", new Data(10,4,2004) , 'F', 1.71, 62);
		anisa.afishoProfil();

		ProfilShendetesor flavio = new
				ProfilShendetesor("Flavio","Kavaja", new Data(29,7,2007),'M',1.75,70);
		flavio.afishoProfil();
	}

}
