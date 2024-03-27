package pl.pawelj.tdd.christmasgifts.application.command.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ShoppingListEntityJpaEntityRepository extends ShoppingListEntityRepository, JpaRepository<ShoppingListEntity, UUID> {

}
