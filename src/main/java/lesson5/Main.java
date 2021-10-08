package lesson5;

public class Main {
    private static final Employee[] employeesTeam = new Employee[5];

    public static void main(String[] args) {

        employeesTeam[0] = new Employee("Romanov Nikolay Mihailovich", "CEO", "romanovnm@mail.ru", 11111111, 1000000000, 65);
        employeesTeam[1] = new Employee("Petrov Ivan Petrovich", "meneger", "petrovip@mail.ru", 11111112, 100000, 45);
        employeesTeam[2] = new Employee("Sidorov Andrei Ivanovich", "QA meneger", "sidorovai@mail.ru", 11111113, 100000, 40);
        employeesTeam[3] = new Employee("Ivanova Violetta Mihailovna", "secretary", "violetta_zaika@mail.ru", 11111114, 30000, 22);
        employeesTeam[4] = new Employee("Potapov Boris Borisovich", "guard", "potapovbb@mail.ru", 11111114, 30000, 55);
        checkAge();
    }

    public static void checkAge() {
        for (int i = 0; i <= 4; i++) {
            if (employeesTeam[i].age < 40) {
                System.out.println(employeesTeam[i]);
            }
        }
    }
}
