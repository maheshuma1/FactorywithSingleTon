import java.util.Scanner;

import com.peripherals.HandBagFactory;
import com.peripherals.HandBagInterface;

public class SingleTonMain {
	
	static SingleTonMain SM = new SingleTonMain();
	
	private SingleTonMain() {
		HandBagFactory m = new HandBagFactory();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Hand Bag Spec. with type as comma seperation:: ");
		String Str[] = s.nextLine().split(",");
		HandBagInterface mp = m.getInstance(Str[0]);
		System.out.print("Choosed HandBag "+mp.getClass().getSimpleName()+ " specific, ");
		mp.specifications(Str[1]);
	}
	
	public static SingleTonMain getrunner() {
		return SM;
		
	}
}
