
public class Bottle extends WasteManagement implements Recycleable {

	protected String name;
	protected String material;
	protected double weight;

	public Bottle() {
		name = "Vitamin Water";
		material = "plastic";
		weight = 2.0;
	}

	public Bottle(String name, String material, double weight) {
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

	@Override
	public void reuse() {
		System.out.println("This plastic will be broken down and used for fidget spinners.");
	}

	/**
	 * the recycle method returns a total of the weight amount of an object and
	 * multiplies that amount by the price given for that object per pound.
	 */
	@Override
	public double recycle() {
		double total = 0.0;
		total = weight * plasticPPP;
		return total;
	}

}
