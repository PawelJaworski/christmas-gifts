package pl.pawelj.tdd.christmasgifts.application.command.persistence;

import java.util.List;
import java.util.Optional;

public interface ShoppingListEntityRepository {

    List<ShoppingListEntity> findAll();

    ShoppingListEntity save(ShoppingListEntity state);

    Optional<ShoppingListEntity> findByChristmasYear(int year);

    void deleteAll();
}
