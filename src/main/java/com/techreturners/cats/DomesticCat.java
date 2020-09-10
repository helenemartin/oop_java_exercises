package com.techreturners.cats;

class DomesticCat extends Cat {

    public DomesticCat() {
        this.type = "domestic";
        this.averageHeight = 23;
    }

    public String eat() {
        return "Purrrrrrr";
    }

    public String wakeUp() {
        isCatAsleep = false;
        return "Cat should be awake now";
    }

    @Override
    public Boolean isASleep() {
        return super.isAsleep();
    }
}