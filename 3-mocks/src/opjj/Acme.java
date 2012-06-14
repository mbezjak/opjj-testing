package opjj;

import java.util.ArrayList;
import java.util.List;

public final class Acme implements Employer {

    private final List<JobApplication> applications = new ArrayList<JobApplication>();

    @Override
    public void accept(JobApplication application) {
        applications.add(application);
    }

    @Override
    public void offerJob(int salary) {
        for (JobApplication application : applications) {
            if (salary >= application.getMinimumSalary()) {
                application.jobOffered(salary);
            } else {
                application.turnedDown();
            }
        }
    }

}
