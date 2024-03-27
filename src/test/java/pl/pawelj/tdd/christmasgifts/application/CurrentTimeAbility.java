package pl.pawelj.tdd.christmasgifts.application;

import lombok.Setter;

import java.time.LocalDate;

public class CurrentTimeAbility implements CurrentTime {
    public static final CurrentTime INSTANCE = new CurrentTimeAbility();

    @Setter
    private static LocalDate now = LocalDate.now();

    private CurrentTimeAbility() {}

    @Override
    public int year() {
        return now.getYear();
    }
}
