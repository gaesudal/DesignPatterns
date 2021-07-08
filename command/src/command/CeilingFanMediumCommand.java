package command;

import model.CeilingFan;

public class CeilingFanMediumCommand implements Command{

	CeilingFan ceilingFan;
	int prevSpeed;
	
	public CeilingFanMediumCommand(CeilingFan ceilingFan) {
		// TODO Auto-generated constructor stub
		this.ceilingFan = ceilingFan;
	}
	
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.medium();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		if(prevSpeed == CeilingFan.HIGH) {
			ceilingFan.high();
		} else if (prevSpeed == CeilingFan.MEDIUM) {
			ceilingFan.medium();
		} else if (prevSpeed == CeilingFan.LOW) {
			ceilingFan.low();
		} else if (prevSpeed == CeilingFan.OFF) {
			ceilingFan.off();
		}
	}
	
	

}
