package Assignment_Progs;

import java.util.ArrayList;
import java.util.Set;

public class A054_UpdateElement {

	public static void main(String[] args) {
		
		ArrayList<String> a1= new ArrayList<String>();
		
		a1.add("sahil");
		a1.add("mayank");
		a1.add("arun");
		a1.add("janak");
		a1.add("dixit");
		
		a1.set(2, "dhuryodhan");
		
		for(String str : a1)
		{
			System.out.println(str);
		}
	}
}
