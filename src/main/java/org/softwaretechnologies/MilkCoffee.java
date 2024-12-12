package org.softwaretechnologies;

// TODO: 09.12.2024 Создайте класс MilkCoffee, поддерживающий интерфейс CofeIntrface
//  к стоимости базового напитка добавьте 10.
//  к описанию добавьте " + milk"

public class MilkCoffee implements CoffeeInterface {

    private final CoffeeInterface baseCoffee; // Базовый напиток

    public MilkCoffee(CoffeeInterface baseCoffee) {
        this.baseCoffee = baseCoffee;
    }

    @Override
    public int getCost() {
        return baseCoffee.getCost() + 10; // Стоимость базового кофе + молоко
    }

    @Override
    public String description() {
        return baseCoffee.description() + " + milk"; // Описание с добавлением молока
    }
}
