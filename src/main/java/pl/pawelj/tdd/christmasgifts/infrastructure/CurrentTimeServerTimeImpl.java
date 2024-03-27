package pl.pawelj.tdd.christmasgifts.infrastructure;

import org.springframework.stereotype.Component;
import pl.pawelj.tdd.christmasgifts.application.CurrentTime;

import java.time.LocalDate;

@Component
class CurrentTimeServerTimeImpl implements CurrentTime {

    @Override
    public int year() {
        return LocalDate.now().getYear();
    }
}
