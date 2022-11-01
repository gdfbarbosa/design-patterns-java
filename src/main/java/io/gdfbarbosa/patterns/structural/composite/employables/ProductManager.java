package io.gdfbarbosa.patterns.structural.composite.employables;

public class ProductManager implements Employable {
    private final double salary;

    public ProductManager(double salary) {
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }
}
