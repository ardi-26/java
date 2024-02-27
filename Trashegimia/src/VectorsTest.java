import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

public class VectorsTest {

	public static void main(String[] args) {
		Vector<String> v  = new Vector<>();
		v.add("a");
		v.addElement("b");
		
		Vector <String> v1 = (Vector <String> )(v.clone());
		v1.addAll(v);
		System.out.println(v1.toString());
		Iterator<String> iterator = v1.iterator();
	
		

	}

}
