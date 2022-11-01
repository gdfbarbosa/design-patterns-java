package io.gdfbarbosa.patterns.structural.composite.department;

import io.gdfbarbosa.patterns.structural.composite.employables.Employable;

import java.util.ArrayList;
import java.util.List;

public class Department implements Employable {
    private List<Employable> employables;

    public Department() {
        this.employables = new ArrayList<>();
    }

    @Override
    public double getSalary() {
        return this.employables
                .stream()
                .reduce(0.0, (partial, current) -> partial + current.getSalary(), Double::sum);
    }

    public void addEmployable(Employable employable) {
        this.employables.add(employable);
    }
}
