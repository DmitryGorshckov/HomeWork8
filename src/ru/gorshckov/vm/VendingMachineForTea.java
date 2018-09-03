package ru.gorshckov.vm;

import ru.gorshckov.vm.VendingMachine;

public class VendingMachineForTea extends VendingMachine {
    private String[] hotDrinks = new String[] {"Чай черный", "Чай зеленый", "Кофе"};

    @Override
    protected String getDrink(int key){
        return this.hotDrinks[key];
    }
}
