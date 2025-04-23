public class UI
{
	private boolean runState;
	private int holdTemp;
	private String rMode;

	// Getter for running status
	public boolean getRunState(){
		return runState;
	}

	// Setter to update run state
	public void setRunState(boolean runState){
		this.runState = runState;
	}

	// Getter for target temp hardcoded to 68
	public int getHoldTemp(){
		holdTemp = 68;
		return holdTemp;
	}

	// Getter for operating mode hardcoded to "Heat"
	public String getRMode(){
		rMode = "heat";
		return rMode;
	}

	// Print method to display system status
	public void printStatus(int currTemp, boolean commandMode)
	{
		System.out.println("Hold Temp: " + getHoldTemp() + " | Mode: " + getRMode() + " | Furnace State: " + convertBool(getRunState()) + "| Current Temp: " + currTemp + " | Command Mode: " + convertBool(commandMode));
	}

	// Method to convert Bool to On or Off string
	private String convertBool(boolean isOn)
	{
		String state = "Off";
		if (isOn){
			state = "On";
		}

		return state;
	}
}