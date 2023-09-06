import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteratorDemo {

	public static void main(String[] args) {
		int total=0;
		ArrayList<Integer> numeros=new ArrayList<>();
		numeros.add(35);	numeros.add(33);	numeros.add(42);
		numeros.add(10);	numeros.add(14);	numeros.add(19);
		numeros.add(27);	numeros.add(44);	numeros.add(26);
		numeros.add(31);	numeros.add(31);	

		//resultado es 312
		Iterator<Integer> iterator=numeros.iterator();
		while (iterator.hasNext()) {
			total+=iterator.next();  
		}

		System.out.println(total);
	}

}
