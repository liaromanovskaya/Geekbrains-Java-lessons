package lesson5;

public class Employee {
    String FIO;
    String position;
    String eMail;
    int phoneNumber;
    int salary;
    int age;

    public Employee(String FIO, String position, String eMail, int phoneNumber, int salary, int age) {
        this.FIO = FIO;
        this.position = position;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "FIO='" + FIO + '\'' +
                ", position='" + position + '\'' +
                ", eMail='" + eMail + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
