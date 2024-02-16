
public class Errors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. String emri gabime sintakse
		
		/* 2. Gabim strukture
		String emri;
		System.out.println(emri);
		*/
		
		try {
			String[] emrat= {"ardi"};
			System.out.println(emrat[1]);
			System.out.println("Pas ndodhjes se exception");
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Kujdes ka ndodhur nje gabim! " +e.getMessage());
			
		}
		
		System.out.println("Fundi programit");
	}

}