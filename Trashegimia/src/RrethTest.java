
public class RrethTest {

	public static void main(String[] args) {
	try {
	Rreth r = new Rreth();
	r.setRrezja(-1.4);
	System.out.println(r);
	}
	catch (IllegalArgumentException e)  {
		System.out.println("Nje gabim ka ndodhur: " +e.getMessage());
	}
	}

}
