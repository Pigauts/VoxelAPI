package com.fulvio.number;

public class Amount {

    protected final int minimum;

    public Amount(int minimum) {
        this.minimum = minimum;
    }

    public int getInt() {
        return minimum;
    }

}
