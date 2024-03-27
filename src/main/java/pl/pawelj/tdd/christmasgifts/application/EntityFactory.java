package pl.pawelj.tdd.christmasgifts.application;

import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pl.pawelj.tdd.christmasgifts.application.command.persistence.ShoppingListEntity;
import pl.pawelj.tdd.christmasgifts.application.command.persistence.ShoppingListEntityRepository;

@Component
@Builder
@RequiredArgsConstructor
class EntityFactory {
    private final CurrentTime currentTime;
    private final ShoppingListEntityRepository shoppingListRepository;

    ShoppingListEntity findElseCreate() {
        var currentYear = currentTime.year();
        return shoppingListRepository.findByChristmasYear(currentYear)
                .orElseGet(() -> shoppingListRepository.save(new ShoppingListEntity(currentYear)));
    }
}
