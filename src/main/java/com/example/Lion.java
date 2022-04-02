package com.example;

import java.util.List;

public class Lion extends Feline {

    boolean hasMane;

    @Override
    public int getKittens() {
        return getKittens(1);
    }
    @Override
    public int getKittens(int kittensCount) {
        return kittensCount;
    }

    @Override
    public List<String> getFood(String animalKind) throws Exception {
            return List.of("Животные", "Птицы", "Рыба");
    }

    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }


    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return getFood("Хищник");
    }
}
