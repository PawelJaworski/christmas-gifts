package pl.pawelj.tdd.christmasgifts.application;

import pl.pawelj.tdd.christmasgifts.application.command.persistence.ShoppingListEntityRepository;
import pl.pawelj.tdd.christmasgifts.application.persistence.ShoppingListEntityRepositoryAbility;

public interface EntityFactoryAbility {
    EntityFactory INSTANCE = EntityFactory.builder()
            .shoppingListRepository(ShoppingListEntityRepositoryAbility.INSTANCE)
            .currentTime(CurrentTimeAbility.INSTANCE)
            .build();
}
