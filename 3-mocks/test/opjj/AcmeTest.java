package opjj;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;

import org.junit.Test;

public class AcmeTest {

    @Test
    public void acmeShouldOfferAJobToEveryoneThatMeetRequirements() {
        JobApplication johnDoe = createMock(JobApplication.class);
        JobApplication janeDoe = createMock(JobApplication.class);
        Employer acme = new Acme();
        acme.accept(johnDoe);
        acme.accept(janeDoe);

        int salaryOffering = 90;
        expect(johnDoe.getMinimumSalary()).andReturn(100);
        expect(janeDoe.getMinimumSalary()).andReturn(80);
        johnDoe.turnedDown();
        janeDoe.jobOffered(salaryOffering);
        replay(johnDoe, janeDoe);

        acme.offerJob(salaryOffering);

        verify(johnDoe, janeDoe);
    }

}
