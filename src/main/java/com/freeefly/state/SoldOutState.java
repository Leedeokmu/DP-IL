package com.freeefly.state;

public class SoldOutState implements State {
    private GumballMachine gumballMachine;
    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("알맹이가 없습니다...");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("알맹이가 없습니다...");
    }

    @Override
    public void turnCrank() {
        System.out.println("알맹이가 없습니다...");
    }

    @Override
    public void dispense() {
        System.out.println("알맹이가 없습니다...");
    }

    @Override
    public void refill(int cnt) {
        System.out.println("알맹이를 " + cnt + "개 채웁니다~");
        gumballMachine.addCount(cnt);
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
}
