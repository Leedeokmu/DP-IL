package com.freeefly.template_method;

public class Coffee implements CaffeineBeverage{
    @Override
    public void brew() {
        System.out.println("필터를 통해 커피를 우리는 중...");
    }
    @Override
    public void addCondiments() {
        System.out.println("설탕과 우유를 추가 하는 중...");
    }
}
