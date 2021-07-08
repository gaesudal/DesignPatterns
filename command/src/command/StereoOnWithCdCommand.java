package command;

import model.Stereo;

public class StereoOnWithCdCommand implements Command{

	Stereo stereo;
	
	public StereoOnWithCdCommand(Stereo stereo) {
		// TODO Auto-generated constructor stub
		this.stereo = stereo;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		stereo.on();
		stereo.setCD();
		stereo.setVolume(11);
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		stereo.off();
	}
	
}
