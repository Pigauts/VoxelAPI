package com.fulvio.number;

import java.util.Random;

public class Range extends Amount {

    private final int maximum;

    public Range(int minimum, int maximum) {
        super(minimum);
        this.maximum = maximum;
    }

    @Override
    public int getInt() {
        Random random = new Random();
        return random.nextInt(maximum + 1) + minimum;
    }

}
