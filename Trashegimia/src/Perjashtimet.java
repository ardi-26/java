import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Exception ose perjashtim eshte nje "perjashtim" nga rrjedha normale
 * e ekzekutimit te programit.
 * 
 */
public class Perjashtimet {

	public static void main(String[] args) {
		try {
			Scanner s = new Scanner(System.in);
			int n, m;
			System.out.print("Shkruaj nje numer te plote: ");
			n = s.nextInt();
			System.out.println("Katrori i numrit eshte "+n*n);
			System.out.print("Shkruaj nje numer te plote: ");
			m = s.nextInt();
			System.out.println("n pjesetuar me m eshte "+ n/m);
			String emri = "Java";
			System.out.println(emri.charAt(100));
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			System.out.println("Gabim ne input! "+ e.toString());
		}
		catch(ArithmeticException e) {
			System.out.println("Kujdes pjesetim me zero " + e.toString());
		}
		catch(Exception e) {
			System.out.println("Gabim i panjohur " + e.toString());
		}
		System.out.println("\nFund programi");
	}

}
