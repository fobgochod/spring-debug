package com.mashibing.lesson20.cycle;

public class B {

    private C c;

    public C getC() {
        return c;
    }

    public void setC(C c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "B{" +
                "c=" + c +
                '}';
    }
}
