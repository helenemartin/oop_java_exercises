package com.techreturners.cats;

class CheetahCat extends Cat {

    public CheetahCat() {
        super(70, "wild");
    }

    @Override
    public String eat() {
        return "Zzzzzzz";
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