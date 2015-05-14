package com.idodevjobs;

import ch.lambdaj.function.closure.Switcher;

import java.util.Arrays;
import java.util.List;

public class GoogleGuavaSwitchedExampleTwo {
    public static void main(String args[]) {
        Employee fulltime = new Employee(JOB_TYPE.FULL_TIME);
        Employee partime = new Employee(JOB_TYPE.PART_TIME);
        Employee contract = new Employee(JOB_TYPE.CONTRACT);
        Employee intern = new Employee(JOB_TYPE.INTERN);
        List<Employee> employeeList = Arrays.asList(fulltime, partime, contract, intern);

        Switcher<Salary> salarySwitcher = new Switcher<>();
        salarySwitcher.addCase(JOB_TYPE.FULL_TIME, new Salary(100000));
        salarySwitcher.addCase(JOB_TYPE.PART_TIME, new Salary(50000));
        salarySwitcher.addCase(JOB_TYPE.CONTRACT, new Salary(120000));
        salarySwitcher.addCase(JOB_TYPE.INTERN, new Salary(45000));
        salarySwitcher.setDefault(new Salary(0));

        for (Employee e : employeeList) {
            Salary sal = salarySwitcher.exec(e.getJobtype());
            e.setSalary(sal);
            System.out.println("Salary " + e.getSalary().getSalary() + " Offered Job type " + e.getJobtype());
        }

    }
}

enum JOB_TYPE {
    FULL_TIME, CONTRACT, INTERN, PART_TIME
}

class Employee {

    private final JOB_TYPE jobtype;
    private Salary salary;

    Employee(JOB_TYPE job_type) {
        this.jobtype = job_type;
    }

    public JOB_TYPE getJobtype() {
        return jobtype;
    }

    Salary getSalary() {
        return salary;
    }

    void setSalary(Salary salary) {
        this.salary = salary;
    }
}

class Salary {
    private final double sal;

    public Salary(double sal) {
        this.sal = sal;
    }

    public double getSalary() {
        return sal;
    }
}