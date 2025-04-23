import java.util.Random;
public class TempSensor
{
	/* once fully developed, this class will monitor the input from an analog temperature sensor and
	provide the input value to the calling method.  For our purposes, this is just going to generate
	random temperatures */

	// List of possible temperatures
	int[] tempArray = new int[] {45,64,65,66,67,68,69,70,71,72,73,85};
	/* Setting variable to hold a random number and temp */
	private int randomNum;
	private int randomTemp;


	// Chooses temperature by returning a random value from the array
	public int takeTemp(){
		Random rand = new Random();
		randomNum = rand.nextInt(tempArray.length);
		randomTemp = tempArray[randomNum];
		return randomTemp;
	}

}
