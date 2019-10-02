import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * 
 * @author chris The class Wastemanagement implements Recycleable in order to
 *         give the createspreadsheet method access to the two methods present
 *         in the Recycleable interface.
 */

public class WasteManagement implements Recycleable {
	protected final double aluminumPPP = 1.60;
	protected final double plasticPPP = 0.58;
	protected final double glassPPP = 0.10;
	protected String material;
	protected double weight;
	protected String name;

	/**
	 * Getters and setters were created below in order to give the method called
	 * createSpreadSheet access to the methods of the objects
	 * 
	 * @return
	 */
	
	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void reuse() {

	}

	@Override
	public double recycle() {
		return 0.0;
	}

	/**
	 * 
	 * @param args
	 * @throws FileNotFoundException The file not found exception is thrown as a
	 *                               result of the creation of the PrintWriter If
	 *                               absent from the program the PrintWriter will
	 *                               not work properly
	 * 
	 *                               In main two Objects are created from the Can
	 *                               and Bottle classes and an Array list is created
	 *                               that stores the two objects.
	 */

	public static void main(String[] args) throws FileNotFoundException {
		Can Coke16Pack = new Can();
		Bottle VitaminWater = new Bottle();
		ArrayList<WasteManagement> recycleArray = new ArrayList<WasteManagement>();
		recycleArray.add(Coke16Pack);
		recycleArray.add(VitaminWater);
		createSpreadSheet(recycleArray);
	}

	/**
	 * 
	 * @param array Array contains two objects from the Can and Bottle class that
	 *              were inserted into the arraylist in main
	 *
	 * @throws FileNotFoundException A file not found exception is thrown in order
	 *                               to allow PrinWriter to behave normally
	 * 
	 *                               In the method below a printwriter is created
	 *                               and prints out values from the objects stored
	 *                               in the arraylist and outputs an excel document
	 *                               when done.
	 */
	
	public static void createSpreadSheet(ArrayList<WasteManagement> array) throws FileNotFoundException {
		try {

			PrintWriter pw = new PrintWriter("recycle.csv");
			pw.println("Item, Material, Weight, Recycle amount ");
			pw.println(array.get(0).getName() + ", " + array.get(0).getMaterial() + ", " + array.get(0).getWeight()
					+ ", " + array.get(0).recycle());
			pw.println(array.get(1).getName() + ", " + array.get(1).getMaterial() + ", " + array.get(1).getWeight()
					+ ", " + array.get(1).recycle());
			pw.println("TOTAL, , , " + (array.get(0).recycle() + array.get(1).recycle()));
			pw.close();
		} catch (FileNotFoundException e) {
			System.out.println("Ay you got no File!");
		}

	}

}
