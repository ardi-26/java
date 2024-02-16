
public class TestStudent {

	public static void main(String[] args) {
	Student anisa = new Student("Anisa Sula", "Tirona e Re", 
			"06723923", "anisa.sula@gmail.com",Status.VITIPARE);
	anisa.setStatus(Status.VITIDYTE);
	if(anisa.getStatus() ==  Status.VITIDYTE )
	{
		System.out.println("Anisa eshte ne vit te dyte");
	}
	System.out.println(anisa);
	}

}
