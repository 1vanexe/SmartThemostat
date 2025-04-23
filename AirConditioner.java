import java.util.TimerTask;

public class AirConditioner extends TimerTask
{
	boolean commandMode;
	UI myUI;
	TempSensor myTS;

	public AirConditioner(TempSensor inTS, UI inUI)
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

		/* if system is ON and room is too cold, turn off AC */

		if(runState && currTemp < (holdTemp - 2)){
			commandMode = false;
		}
		// if System is Off and room is too hot, turn on AC
		if(!runState && currTemp > (holdTemp + 2)){
			commandMode = true;
		}

		// Prints current status and updates run State
		myUI.printStatus(currTemp, commandMode);
		myUI.setRunState(commandMode);


	}

}