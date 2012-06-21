package initial;

public class Employee {

    private String firstName;
    private String sureName;
    private final Address address;


    public Employee(String firstName, String sureName, Address address) {

        this.firstName = firstName;
        this.sureName = sureName;
        this.address = address;
    }

    @Override
    public boolean equals(Object comparedEmployee) {
        if (this == comparedEmployee) return true;
        if (comparedEmployee == null || getClass() != comparedEmployee.getClass()) return false;

        Employee employee = (Employee) comparedEmployee;

        if (firstName != null ? !firstName.equals(employee.firstName) : employee.firstName != null) return false;
        if (sureName != null ? !sureName.equals(employee.sureName) : employee.sureName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (sureName != null ? sureName.hashCode() : 0);
        return result;
    }
}
