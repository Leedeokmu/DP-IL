package com.freeefly.state;

import org.w3c.dom.ls.LSOutput;

public class WinnerState implements State{
    private GumballMachine gumballMachine;
    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("장깐만 기다려 주세요");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("이미 알맹이를 뽑았습니다.");
    }

    @Override
    public void turnCrank() {
        System.out.println("손잡이는 한번만 돌려주세요");

    }

    @Override
    public void dispense() {
        System.out.println("축하! 알맹이를 하나 더 받으세요~");
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            System.out.println("더 이상 알맹이가 없습니다.");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("더 이상 알맹이가 없습니다.");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }

    @Override
    public void refill(int cnt) {
        System.out.println("알맹이를 " + cnt + "개 채웁니다~");
        gumballMachine.addCount(cnt);
    }
}
