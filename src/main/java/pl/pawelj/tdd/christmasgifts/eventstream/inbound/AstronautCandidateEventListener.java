package pl.pawelj.tdd.christmasgifts.eventstream.inbound;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pl.pawelj.tdd.christmasgifts.application.ChristmasGiftsFacade;
import pl.pawelj.tdd.christmasgifts.eventstream.inbound.contract.AstronautAptitudeTestPassedEvent;

@Component
@RequiredArgsConstructor
class AstronautCandidateEventListener {
    private ChristmasGiftsFacade applicationForALoanCmdFacade;

    public void onLoanStarted(AstronautAptitudeTestPassedEvent event) {
//        Optional.ofNullable(event)
//                .map(LoanStartedEvent::applicationNumber)
//                .map(SendCommunicationAboutStartedLoanCmd::new)
//                .ifPresent(applicationForALoanCmdFacade::sendCommunicationAboutStartedLoan);
    }
}
