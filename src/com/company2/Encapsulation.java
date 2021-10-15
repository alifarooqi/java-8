package com.company2;

public class Encapsulation {
    private int a;
    private boolean b;

    Encapsulation(int a, boolean b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    protected void setA(int a) {
        this.a = a;
    }

    // Getter
    public boolean isB() {
        return b;
    }

    public void setB(boolean b) {
        this.b = b;
    }
}
