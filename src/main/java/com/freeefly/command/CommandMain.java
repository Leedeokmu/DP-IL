package com.freeefly.command;

import com.freeefly.command.command.LightOffCommand;
import com.freeefly.command.command.LightOnCommand;
import com.freeefly.command.command.StereoOffCommand;
import com.freeefly.command.command.StereoOnCommand;
import com.freeefly.command.receiver.Light;
import com.freeefly.command.receiver.Stereo;

public class CommandMain {
    public static void main(String[] args) {
        RemoteController remoteController = new RemoteController();

        Light livingLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        Stereo livingStereo = new Stereo("Living Room");
        Stereo kitchenStereo = new Stereo("Kitchen");

        LightOnCommand livingLightOnCommand = new LightOnCommand(livingLight);
        LightOffCommand livingLightOffCommand = new LightOffCommand(livingLight);

        LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);

        StereoOnCommand livingStereoOnCommand = new StereoOnCommand(livingStereo);
        StereoOffCommand livingStereoOffCommand = new StereoOffCommand(livingStereo);

        StereoOnCommand kitchenStereoOnCommand = new StereoOnCommand(kitchenStereo);
        StereoOffCommand kitchenStereoOffCommand = new StereoOffCommand(kitchenStereo);

        remoteController.setCommand(0, livingLightOnCommand, livingLightOffCommand);
        remoteController.setCommand(1, kitchenLightOnCommand, kitchenLightOffCommand);
        remoteController.setCommand(2, livingStereoOnCommand, livingStereoOffCommand);
        remoteController.setCommand(3, kitchenStereoOnCommand, kitchenStereoOffCommand);

        remoteController.printString();
        remoteController.pushOnButton(0);
        remoteController.pushOffButton(0);
        remoteController.pushOnButton(1);
        remoteController.pushOffButton(1);
        remoteController.pushOnButton(2);
        remoteController.pushOffButton(2);
        remoteController.pushOnButton(3);
        remoteController.pushOffButton(3);
        remoteController.pushUndoButton();
    }
}
