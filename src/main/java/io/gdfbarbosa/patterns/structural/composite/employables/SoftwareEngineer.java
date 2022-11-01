package io.gdfbarbosa.patterns.structural.composite.employables;

public class SoftwareEngineer implements Employable {
    private final double salary;

    public SoftwareEngineer(double salary) {
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }
}
