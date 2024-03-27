package pl.pawelj.tdd.christmasgifts.infrastructure.jackson;

import pl.pawelj.tdd.christmasgifts.infrastructure.JacksonConfig;

public interface JacksonConfigAbility {
    JacksonConfig INSTANCE = new JacksonConfig();

    default JacksonConfig getJacksonConfig() {
        return INSTANCE;
    }
}