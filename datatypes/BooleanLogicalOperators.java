package datatypes;

public class BooleanLogicalOperators {

	public static void main(String[] args) {
		boolean a= true;
		boolean b=false;
		
		boolean w = a | b;
		System.out.println(w);
		
		boolean y = a & b;
		System.out.println(y);
		
		boolean z = !a;
		System.out.println(z);
		
		boolean d = (!a&b)| (a&!b)
		System.out.println(d);

	}

}
