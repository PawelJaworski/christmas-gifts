package pl.pawelj.tdd.christmasgifts.application.command.persistence;

import jakarta.persistence.Embeddable;

@Embeddable
public record ShoppingListPosition(String name, boolean isBought) {
    public static ShoppingListPosition newShoppingListPosition(String name) {
        return new ShoppingListPosition(name, false);
    }

    public ShoppingListPosition buy() {
        return new ShoppingListPosition(name, true);
    }

    public boolean isNotYetBought() {
        return !isBought;
    }
}
