import java.util.InputMismatchException;
import java.util.Scanner;

/* Ne kete shembull, do lexojme nga perdoruesi dy numra te plote:
 * 
 * 1. Numerues 2. Emerues.
 * Programi duhet te afishoje pjestimin e numeruesit me emeruesit
 * Ne rast se perdoruesi fut nga tastiera vlera jo int (2.3 ose abc) programi 
 * duhet te perfundoje. Gjithashtu nese emeruesi eshte baraz me zero, 
 * programi duhet te ndaloje
 * 
 * 
 * 
 * 
 * 
 */
public class PjesetimMeZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		boolean vazhdo=true;
		do
		{
		try {
			
			int n, e; //n numeruesi, e emeruesi
			System.out.print("Shkruani numeruesin:  ");
			n=s.nextInt();
			System.out.print("Shkruani emeruesin:   ");
			e=s.nextInt();
			System.out.printf("Numeruesi %d, Emeruesi %d, pjesetimi %d"
					,n,e,pjesetim(n,e) );
			vazhdo=false;
		}
		catch(InputMismatchException e) 
		{
			System.out.println("Keni shkruar nje vlere jo te lejuar. "
					+ "Duhet nje numer i plote");
			s.nextLine();
		}
		catch(ArithmeticException e) 
		{
			System.out.println("Kujdes pjesetim me zero");
		}
		} while(vazhdo); 

	}
	
	public static int pjesetim(int numeruesi, int emeruesi) 
	throws ArithmeticException
	{
		
		return numeruesi/emeruesi;
	}

}