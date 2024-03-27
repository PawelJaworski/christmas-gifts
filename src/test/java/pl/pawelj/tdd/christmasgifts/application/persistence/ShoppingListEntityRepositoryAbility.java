package pl.pawelj.tdd.christmasgifts.application.persistence;

import org.junit.jupiter.api.Assertions;
import pl.pawelj.tdd.christmasgifts.application.command.persistence.ShoppingListEntityRepository;

import java.util.List;

public interface ShoppingListEntityRepositoryAbility {
    ShoppingListEntityRepository INSTANCE = new ShoppingListEntityInMemoryRepository();

    default void cleanupShoppingListEntityRepositoryAbility() {
        INSTANCE.deleteAll();
    }

    default void expect_shopping_list_position_available(String positionName) {
      var found = getShoppingListEntityRepository().findAll().stream()
              .filter(it -> it.getPositions().stream().anyMatch(pos -> pos.name().equals(positionName)))
              .findFirst();

      Assertions.assertTrue(found.isPresent(), "Position with givenName not found.");
    }

    default ShoppingListEntityRepository getShoppingListEntityRepository() {
        return INSTANCE;
    }
}
