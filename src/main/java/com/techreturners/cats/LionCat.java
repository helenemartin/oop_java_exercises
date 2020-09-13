package com.techreturners.cats;

class LionCat extends Cat {

    public LionCat() {
        super(1100, "wild");
    }

    @Override
    public String eat() {
        return "Roar!!!!";
    }

    @Override
    public boolean isAsleep() {
        return super.isAsleep();
    }

    @Override
    public String wakeUp() {
        super.setToWakeUp();
        return null; // TODO
    }
}