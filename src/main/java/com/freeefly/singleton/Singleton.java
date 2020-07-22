package com.freeefly.singleton;

public class Singleton {
    private Singleton() { }

    // 프로그램 초기화 과정(getInstance 호출시)에서 메모리에 할당됨
    // 다른 프로그램이 호출하려고 하면 이미 할당되어 있기 때문에 두 번 로드하지 않고
    // 첫번째 호출의 초기화 과정이 완료될 때까지 기다림
    private static class LazyInstance {
        // final 이 붙어서 재 할당 되지 않음
        private static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return LazyInstance.instance;
    }
}
