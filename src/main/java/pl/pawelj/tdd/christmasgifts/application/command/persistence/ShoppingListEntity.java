package pl.pawelj.tdd.christmasgifts.application.command.persistence;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ShoppingListEntity {
    @Id
    private Integer christmasYear;

    @ElementCollection
    private List<ShoppingListPosition> positions = new ArrayList<>();

    public ShoppingListEntity(int christmasYear) {
        this.christmasYear = christmasYear;
    }

    public void addPosition(String positionName) {
        positions.add(ShoppingListPosition.newShoppingListPosition(positionName));
    }

    public void buyPresent(String positionName) {
        positions = positions.stream()
                .map(it -> it.name().equals(positionName) ? it.buy() : it)
                .toList();
    }
}
