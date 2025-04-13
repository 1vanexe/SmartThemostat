public class UI
{
	private boolean runState;
	private int holdTemp;
	private String rMode;

	public boolean getRunState(){
		return runState;
	}
	public void setRunState(boolean runState){
		this.runState = runState;
	}
	public int getHoldTemp(){
		holdTemp = 68;
		return holdTemp;
	}

	public String getRMode(){
		rMode = "heat";
		return rMode;
	}
	/* DONE add get and set methods for the runState */

	/* DONE  add get method to return the holdTemp, hardcoded to 68 degrees */

	/* DONE add get method to return the rMode, initially hardcoded to "heat" for testing purposes */

	public void printStatus(int currTemp, boolean commandMode)
	{
		System.out.println("Hold Temp: " + getHoldTemp() + " | Mode: " + getRMode() + " | Furnace State: " + convertBool(getRunState()) + "| Current Temp: " + currTemp + " | Command Mode: " + convertBool(commandMode));
	}

	private String convertBool(boolean isOn)
	{

		String state = "Off";
		if (isOn){
			state = "On";
		}
		/* DONE add a string variable to hold the on/off state as a string, initialized to "Off"  */

		/* DONE add an if statement, testing to see if isOn is true, and if it is, setting the string variable to "On" */

		/* DONE add the return statement for the string */
		return state;
	}
}