package pl.pawelj.tdd.christmasgifts.application;

import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.pawelj.tdd.christmasgifts.application.command.persistence.ShoppingListEntityRepository;
import pl.pawelj.tdd.christmasgifts.application.command.persistence.ShoppingListPosition;

import java.util.List;

@Service
@Transactional
@Builder
@RequiredArgsConstructor
public class ChristmasGiftsFacade {
    private final EntityFactory entityFactory;

    public void addToShoppingList(String positionName) {
        entityFactory.findElseCreate()
                .addPosition(positionName);
    }

    public void buyPresent(String name) {
        entityFactory.findElseCreate()
                .buyPresent(name);
    }

    public List<String> getShoppingListPositions() {
        return entityFactory.findElseCreate()
                .getPositions().stream()
                .map(ShoppingListPosition::name)
                .toList();
    }

    public List<String> filterNotYetBoughtPresents() {
        return entityFactory.findElseCreate().getPositions().stream()
                .filter(ShoppingListPosition::isNotYetBought)
                .map(ShoppingListPosition::name)
                .toList();
    }
}
