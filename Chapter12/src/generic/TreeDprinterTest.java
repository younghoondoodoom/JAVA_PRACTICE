package generic;

public class TreeDprinterTest {

	public static void main(String[] args) {
		
		TreeDprinter<Powder> printer1 = new TreeDprinter<Powder>();
		printer1.setMaterial(new Powder());
		System.out.println(printer1.toString());
		
		TreeDprinter<Plastic> printer2 = new TreeDprinter<Plastic>();
		printer2.setMaterial(new Plastic());
		System.out.println(printer2.toString());
		
		printer2.printing();
		
	}

}
