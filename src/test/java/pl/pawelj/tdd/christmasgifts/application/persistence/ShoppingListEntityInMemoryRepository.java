package pl.pawelj.tdd.christmasgifts.application.persistence;

import pl.pawelj.tdd.christmasgifts.application.command.persistence.ShoppingListEntity;
import pl.pawelj.tdd.christmasgifts.application.command.persistence.ShoppingListEntityRepository;

import java.util.*;

public class ShoppingListEntityInMemoryRepository implements ShoppingListEntityRepository {
    private final Map<Integer, ShoppingListEntity> data = new HashMap<>();

    @Override
    public List<ShoppingListEntity> findAll() {
        return data.values().stream().toList();
    }

    @Override
    public ShoppingListEntity save(ShoppingListEntity entity) {
        data.put(entity.getChristmasYear(), entity);

        return entity;
    }

    @Override
    public Optional<ShoppingListEntity> findByChristmasYear(int year) {
        return  data.values().stream()
                .filter(it -> it.getChristmasYear() == year)
                .findFirst();
    }

    @Override
    public void deleteAll() {
        data.clear();
    }
}
