package opjj;

public final class Student implements JobApplication {

    private final int minimumSalary;

    public Student(int minimumSalary) {
        this.minimumSalary = minimumSalary;
    }

    @Override
    public int getMinimumSalary() {
        return minimumSalary;
    }

    @Override
    public void jobOffered(int salary) {
        System.out.println(salary + " :)");
    }

    @Override
    public void turnedDown() {
        System.out.println(":(");
    }

}
