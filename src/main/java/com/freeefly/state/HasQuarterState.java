package com.freeefly.state;

import java.util.Random;

public class HasQuarterState implements State {
    private GumballMachine gumballMachine;
    private Random randomWInner = new Random();
    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("동전은 하나만...");

    }

    @Override
    public void ejectQuarter() {
        System.out.println("동전이 반환됩니다.");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("손잡이를 돌렸습니다!");
        int winner = randomWInner.nextInt(10);
        if (winner == 0 && gumballMachine.getCount() > 1) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("알맹이가 나갈 수 없습니다.");
    }

    @Override
    public void refill(int cnt) {
        System.out.println("알맹이를 " + cnt + "개 채웁니다~");
        gumballMachine.addCount(cnt);
    }
}
