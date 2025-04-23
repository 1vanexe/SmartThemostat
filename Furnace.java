import java.util.TimerTask;

public class Furnace extends TimerTask
{
	boolean commandMode;
	UI myUI;
	TempSensor myTS;

	public Furnace(TempSensor inTS, UI inUI)
	{
		this.myUI = inUI;
		this.myTS = inTS;
	}

	@Override
	public void run()
	{
		// Reads hold temp and current room temp
		int holdTemp = myUI.getHoldTemp();
		int currTemp = myTS.takeTemp();
		boolean runState = myUI.getRunState();

		/* if system is ON and room is too hot, turn off furnace */
		if(runState && currTemp > (holdTemp + 2)){
			commandMode = false;
		}
		// if System is off and room is too cold, turn on furnace
		if(!runState && currTemp < (holdTemp - 2)){
			commandMode = true;
		}

		// Prints system status and updates run state
		myUI.printStatus(currTemp, commandMode);
		myUI.setRunState(commandMode);



	}
}