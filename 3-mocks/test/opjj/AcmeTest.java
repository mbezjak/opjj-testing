package opjj;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;

import org.junit.Test;

public class AcmeTest {

    private Employer acme = new Acme();
    private int acmeOffer = 90;

    @Test
    public void acmeShouldOfferAJobToEveryoneThatMeetRequirements() {
        JobApplication john = createMock(JobApplication.class);
        JobApplication jane = createMock(JobApplication.class);
        acme.accept(john);
        acme.accept(jane);

        expect(john.getMinimumSalary()).andReturn(100);
        expect(jane.getMinimumSalary()).andReturn(80);
        john.turnedDown();
        jane.jobOffered(acmeOffer);
        replay(john, jane);

        acme.offerJob(acmeOffer);

        verify(john, jane);
    }

}
