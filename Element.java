public class Element {
	private String name;
	private int coef;

	public Element(String name, int coef){
		this.name = name;
		this.coef = coef;
	}

	public String getName(){
		return this.name;
	}

	public int getCoef(){
		return this.coef;
	}
}