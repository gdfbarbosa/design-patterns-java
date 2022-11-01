package io.gdfbarbosa.patterns.structural.composite.employables;

public class SoftwareEngineeringManager implements Employable {
    private final double salary;

    public SoftwareEngineeringManager(double salary) {
        this.salary = salary;
    }
    @Override
    public double getSalary() {
        return this.salary;
    }
}
