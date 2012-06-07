package opjj

import spock.lang.Specification

class AcmeSpec extends Specification {

    def "acme should offer a job to everyone that meet requirements"() {
        given: "two applicants and acme"
        def johnDoe = Mock(JobApplication)
        def janeDoe = Mock(JobApplication)
        def acme = new Acme()
        acme.accept(johnDoe)
        acme.accept(janeDoe)

        and: "offered salary"
        def salaryOffering = 90

        when:
        acme.offerJob(salaryOffering)

        then:
        1 * johnDoe.getMinimumSalary() >> 100
        1 * janeDoe.getMinimumSalary() >> 80
        1 * johnDoe.turnedDown()
        1 * janeDoe.jobOffered(salaryOffering)
    }

}
