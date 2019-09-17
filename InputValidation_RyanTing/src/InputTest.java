/**
 * AP CmpSci 2019-2020
 * Input
 * Universal input validation used for most cases where it is needed.
 * 
 * @author Ryan Ting
 * @version September 4, 2019
 * @see Input
 */

public class InputTest {

	/**
	 * Main method exercises the Input class.
	 * @param args Command line arguments (not used)
	 */
	public static void main(String[] args) 
	{
		Input.readNum("intMinMax", -4, -4);
		Input.readDouble("double");
		Input.readNum(0.0, "doubleMin");
		Input.readNum("doubleLimit", 0.0, true);
		Input.readNum(0, "intMin");
		Input.readNum("intMax", 0);
		Input.readInt("int");
		Input.readNum("doubleMinMax", -4.5, 4.5);
		Input.readNum("intLimit", 0, false);
		Input.readNum("doubleMax", 0.0);
	}
}
