import java.util.Timer;

public class SmartThermostat
{

	public static void main (String[] args)
	{	// Creates timer for timed task
		Timer timer = new Timer();

		// Instantiate UI and TempSensor
		UI myUI = new UI();
		TempSensor myTS = new TempSensor();

		// Get mode from the UI hardcoded to "Heat"
		String runMode = myUI.getRMode();

		// If the system is set to Heat, run Furnace every 10,000 ms
		if(runMode.equals("heat"))
		{
			timer.schedule(new Furnace(myTS, myUI),
					0,        //startup delay
					10000);  //milliseconds between cycles
		}
		else if (runMode.equals("cool"))
		{
			timer.schedule(new AirConditioner(myTS, myUI),
					0,        //startup delay
					10000);  //milliseconds between cycles
		}
	}
}
