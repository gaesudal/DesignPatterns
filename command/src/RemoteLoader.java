import command.CeilingFanHighCommand;
import command.CeilingFanMediumCommand;
import command.CeilingFanOffCommand;
import command.GarageDoorDownCommand;
import command.GarageDoorUpCommand;
import command.LightOffCommand;
import command.LightOnCommand;
import command.StereoOffCommand;
import command.StereoOnWithCdCommand;
import control.RemoteControl;
import model.CeilingFan;
import model.GarageDoor;
import model.Light;
import model.Stereo;

public class RemoteLoader {
	
	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
		
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
		CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
		
		remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
		remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);
		
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
		
		remoteControl.onButtonWasPushed(1);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
//		Light livingRoomLight = new Light("Living Room");
//		Light kitchenLight = new Light("Kitchen");
//		GarageDoor garageDoor = new GarageDoor("");
//		Stereo stereo = new Stereo("Living Room");
//		
//		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
//		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		
//		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
//		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
//		
//		GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
//		GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);
//		
//		StereoOnWithCdCommand stereoOnWithCD = new StereoOnWithCdCommand(stereo);
//		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		
//		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
//		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
//		remoteControl.setCommand(2, garageDoorUp, garageDoorDown);
//		remoteControl.setCommand(3, stereoOnWithCD, stereoOff);
		
//		System.out.println(remoteControl);
		
//		remoteControl.onButtonWasPushed(0);
//		remoteControl.offButtonWasPushed(0);
//		System.out.println(remoteControl);
//		remoteControl.undoButtonWasPushed();
//		remoteControl.offButtonWasPushed(0);
//		remoteControl.onButtonWasPushed(0);
//		System.out.println(remoteControl);
//		remoteControl.undoButtonWasPushed();
//		remoteControl.onButtonWasPushed(1);
//		remoteControl.offButtonWasPushed(1);
//		remoteControl.onButtonWasPushed(2);
//		remoteControl.offButtonWasPushed(2);
//		remoteControl.onButtonWasPushed(3);
//		remoteControl.offButtonWasPushed(3);
		
		
	}
	
}
