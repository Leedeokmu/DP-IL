package com.freeefly.proxy.server;

import com.freeefly.proxy.GumballMachine;
import com.freeefly.proxy.GumballMachineRemote;

import java.rmi.Naming;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachineRemote gumballMachine = null;
        int count = 10;
        try {
            String location = "localhost";
            gumballMachine = new GumballMachine(location, count);
            Naming.bind("//"  + location + "/gumballmachine", gumballMachine);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
