package com.freeefly.command;

import com.freeefly.command.command.NoCommand;

public class RemoteController {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteController() {
        Command noCommand = new NoCommand();
        undoCommand = noCommand;
        onCommands = new Command[7];
        offCommands = new Command[7];
        for(int i = 0; i < 7; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void pushOnButton(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void pushOffButton(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void pushUndoButton() {
        undoCommand.undo();
    }

    public void printString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n----- Remote Control ------\n");
        for (int i = 0; i < 7; i++) {
            sb.append("[slot" + i + "]").append(onCommands[i].getClass().getName()).append("\t").append(offCommands[i].getClass().getName()).append("\n");
        }
        System.out.println(sb.toString());
    }
}
