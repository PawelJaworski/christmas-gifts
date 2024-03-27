package pl.pawelj.tdd.christmasgifts.application

import pl.pawelj.tdd.christmasgifts.application.command.ChristmasGiftsFacadeAbility

import pl.pawelj.tdd.christmasgifts.application.persistence.ShoppingListEntityRepositoryAbility
import spock.lang.Specification

class ChristmasGiftReadinessSpec extends Specification implements ChristmasGiftsFacadeAbility,
        ShoppingListEntityRepositoryAbility {

    def LEGO_BRICKS = "Lego bricks"
    def SOCKS = "Socks"

    def setup() {
        cleanupShoppingListEntityRepositoryAbility()
    }

    def "Shopping list should be available."() {
        when:
        shopping_list_item_added(LEGO_BRICKS)

        then:
        expect_shopping_list_position_available(LEGO_BRICKS)
    }

    def "Not yet bought presents can be filtered on shopping list"() {
        given:
        shopping_list_item_added(LEGO_BRICKS)
        shopping_list_item_added(SOCKS)

        when:
        present_bought(SOCKS)

        then:
        expect_not_yet_bought_presents() == [LEGO_BRICKS]
    }

}
