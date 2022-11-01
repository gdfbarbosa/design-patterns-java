package io.gdfbarbosa.patterns.structural.composite;

import io.gdfbarbosa.patterns.structural.composite.department.Department;
import io.gdfbarbosa.patterns.structural.composite.department.EngineeringDepartment;
import io.gdfbarbosa.patterns.structural.composite.department.ProductDepartment;
import io.gdfbarbosa.patterns.structural.composite.employables.Employable;
import io.gdfbarbosa.patterns.structural.composite.employables.ProductManager;
import io.gdfbarbosa.patterns.structural.composite.employables.SoftwareEngineer;
import io.gdfbarbosa.patterns.structural.composite.employables.SoftwareEngineeringManager;

import java.util.ArrayList;
import java.util.List;

public class CompositeMain {
    public static void main(String[] args) {
        List<Employable> companyEmployables = new ArrayList<>();

        Department engineeringDepartment = new EngineeringDepartment();
        Department productDepartment = new ProductDepartment();

        engineeringDepartment.addEmployable(new SoftwareEngineer(497000));
        engineeringDepartment.addEmployable(new SoftwareEngineer(335000));
        engineeringDepartment.addEmployable(new SoftwareEngineer(215000));
        engineeringDepartment.addEmployable(new SoftwareEngineeringManager(547000));
        engineeringDepartment.addEmployable(new SoftwareEngineeringManager(522000));

        productDepartment.addEmployable(new ProductManager(355000));
        productDepartment.addEmployable(new ProductManager(327000));

        companyEmployables.add(productDepartment);
        companyEmployables.add(engineeringDepartment);

        // Composite design pattern allows to handle
        // part-whole hierarchies using an uniform interface for leafs and Composites
        double totalPayroll = 0.0;
        for (Employable employable : companyEmployables) {
            totalPayroll += employable.getSalary();
        }
        System.out.println("Total payroll = " + totalPayroll);
    }
}
