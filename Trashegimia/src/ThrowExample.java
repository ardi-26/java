
public class ThrowExample {
/* ne rast se kemi nje program apo kod qe mund te gjeneroje exception,
	te vendoset kodi ose programi ne nje metode te vecante, me pas te bejme
	kete metode mark me fjalen kyce throws dhe tipin e exception qe mendojme ne qe
	mund te behet throw
*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			getArrayItem();
		} catch (ArrayIndexOutOfBoundsException e) 
		{
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

	private static void getArrayItem() 
	throws ArrayIndexOutOfBoundsException
	{
		String[] emrat= {"ardi"};
		System.out.println(emrat[1]);
		System.out.println("Pas ndodhjes se exception");
	}

}