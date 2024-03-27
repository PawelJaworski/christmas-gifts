package pl.pawelj.tdd.christmasgifts.application.command;

import pl.pawelj.tdd.christmasgifts.application.ChristmasGiftsFacade;
import pl.pawelj.tdd.christmasgifts.application.EntityFactoryAbility;

import java.util.List;

public interface ChristmasGiftsFacadeAbility {

    ChristmasGiftsFacade INSTANCE = ChristmasGiftsFacade.builder()
            .entityFactory(EntityFactoryAbility.INSTANCE)
            .build();

    default void shopping_list_item_added(String positionName) {
        INSTANCE.addToShoppingList(positionName);
    }

    default void present_bought(String name) {
        INSTANCE.buyPresent(name);
    }

    default List<String> expect_not_yet_bought_presents() {
        return INSTANCE.filterNotYetBoughtPresents();
    }
}
