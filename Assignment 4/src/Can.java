
public class Can extends WasteManagement implements Recycleable {

	protected String name;
	protected String material;
	protected double weight;

	public Can() {
		name = "Coke can";
		material = "aluminum";
		weight = 15.0;
	}

	public Can(String name, String material, double weight) {
		this.name = name;
		this.material = material;
		this.weight = weight;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getMaterial() {
		return material;
	}

	@Override
	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public double getWeight() {
		return weight;
	}

	@Override
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * The reuse method outputs a string when called upon.
	 */
	@Override
	public void reuse() {
		System.out.println("This 16 pack of coke cans will be turned into bullets to fight the war!");
	}

	/**
	 * the recycle method returns a total of the weight amount of an object and
	 * multiplies that amount by the price given for that object per pound.
	 */

	@Override
	public double recycle() {
		double total = 0.0;
		total = weight * aluminumPPP;
		return total;
	}

}
