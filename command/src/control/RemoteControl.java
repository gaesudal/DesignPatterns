package control;

import java.util.Arrays;

import command.Command;
import command.NoCommand;

public class RemoteControl {
	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;
	public RemoteControl() {
		// TODO Auto-generated constructor stub
		onCommands = new Command[7];
		offCommands = new Command[7];

		Command noCommand = new NoCommand();

		for (int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommand = noCommand;
	}

	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}

	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
	
	public void undoButtonWasPushed() {
		undoCommand.undo();
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("\n--Remote Control --\n");
		for (int i = 0 ; i < onCommands.length; i++) {
			sb.append("[slot "+ i +"] " + onCommands[i].getClass().getName() + "   " + offCommands[i].getClass().getName() + "\n");
		}
		return sb.toString();
	}
	
	
}
